package homeworks.hw_20230810;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserDatabaseTest {
  private final UserDatabase db = new UserDatabase();
  private final User user1 = new User(1, "user1", "email1");
  private final User user2 = new User(2, "user2", "email2");

  @Test
  void getUserByIdTest() {
    db.addUser(user1);
    db.addUser(user2);

    Assertions.assertEquals(user1, db.getUserById(user1.getId()).orElse(null));
  }

  @Test
  void getUserByUsernameTest() {
    db.addUser(user1);
    db.addUser(user2);

    Assertions.assertEquals(user1, db.getUserByUsername(user1.getUserName()).orElse(null));
  }

  @Test
  void addUserNullWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> db.addUser(null));
  }

  @Test
  void addSameUserWithExceptionTest() {
    User userMock = Mockito.mock(User.class);
    db.addUser(userMock);
    db.addUser(userMock);
    int excepted = 1;

    Assertions.assertEquals(excepted,
            db.getUsers().stream()
                    .filter(e -> e.equals(userMock))
                    .count());
  }

  @Test
  void addUserTest() {
    User user = new User(3, "user3", "email3");
    db.addUser(user);

    Assertions.assertEquals(user,
            db.getUsers().stream()
                    .filter(e -> e.getId() == user.getId())
                    .findFirst().orElse(null));
  }
}