package homeworks.hw_20230810;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;

@ExtendWith(MockitoExtension.class)
public class UserTest {
  private static User user;
  @Mock
  private static Role role;

  @BeforeEach
  void init() {
    user = new User(1, "user1", "email1");
  }

  @Test
  void getUserInfoTest() {
    String excepted = "[user1] - email1";
    Assertions.assertEquals(excepted, user.getUserInfo());
  }

  @Test
  void addNullRoleWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> user.addRole(null));
  }

  @Test
  public void addRoleTest() {
    user.addRole(role);
    int excepted = 1;
    Assertions.assertEquals(excepted, user.getRoles().size());
  }

  @Test
  void addSameRoleTest() {
    user.addRole(role);
    user.addRole(role);
    int excepted = 1;
    Assertions.assertEquals(excepted, user.getRoles().size());
  }

  @Test
  void removeNullRoleWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> user.removeRole(null));
  }

  @Test
  void removeUnExistsRoleWithExceptionTest() {
    Role roleMock = Mockito.mock(Role.class);
    Assertions.assertThrows(NoSuchElementException.class, () -> user.removeRole(roleMock));
  }

  @Test
  void removeRoleTest() {
    user.addRole(role);
    user.removeRole(role);
    int excepted = 0;
    Assertions.assertEquals(excepted, user.getRoles().size());
  }
}