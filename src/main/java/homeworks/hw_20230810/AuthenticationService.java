package homeworks.hw_20230810;

import java.util.NoSuchElementException;
import java.util.Optional;

public class AuthenticationService {
  private UserDatabase userDatabase;

  public AuthenticationService(UserDatabase userDatabase) {
    this.userDatabase = userDatabase;
  }

  public boolean authenticate(String username, String password) {
    if (username == null || username.isEmpty()) {
      throw new IllegalArgumentException("Empty Field UserName!");
    }
    if (password == null || password.isEmpty()) {
      throw new IllegalArgumentException("Empty Field Password!");
    }
    Optional<User> user = userDatabase.getUserByUsername(username);
    if (user.isEmpty()) {
      throw new NoSuchElementException("User not found!");
    }
    if (!user.get().getPassword().equals(password)) {
      throw new NoSuchElementException("Password does not match with db!");
    } else {
      return true;
    }
  }

  public void grantAccess(User user) {
    checkNullUser(user);
    Optional<User> databaseUser = userDatabase.getUserById(user.getId());
    if (databaseUser.isPresent()) {
      databaseUser.get().setAccess(true);
    } else {
      throw new NoSuchElementException("User not found!");
    }
  }

  public void revokeAccess(User user) {
    checkNullUser(user);
    Optional<User> databaseUser = userDatabase.getUserById(user.getId());
    if (databaseUser.isPresent()) {
      databaseUser.get().setAccess(false);
    } else {
      throw new NoSuchElementException("User not found!");
    }
  }

  private static void checkNullUser(User user) {
    if (user == null) {
      throw new IllegalArgumentException("User cannot be null");
    }
  }
}