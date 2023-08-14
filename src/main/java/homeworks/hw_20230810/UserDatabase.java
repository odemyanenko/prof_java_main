package homeworks.hw_20230810;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class UserDatabase {
  private List<User> users;

  public UserDatabase() {
    this.users = new ArrayList<>();
  }

  public List<User> getUsers() {
    return Collections.unmodifiableList(users);
  }

  public Optional<User> getUserById(int id) {
    return users.stream()
            .filter(e -> e.getId() == id)
            .findFirst();
  }

  public Optional<User> getUserByUsername(String username) {
    return users.stream()
            .filter(e -> e.getUserName().equals(username))
            .findFirst();
  }

  public void addUser(User user) {
    if (user == null) {
      throw new IllegalArgumentException();
    }
    if (users.contains(user)) {
      return;
    }
    users.add(user);
  }
}