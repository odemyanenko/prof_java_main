package homeworks.hw_20230810;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AuthenticationServiceTest {
  @Mock
  private UserDatabase userDatabase;
  @Mock
  private static User user;
  @InjectMocks
  private final AuthenticationService service = new AuthenticationService(userDatabase);

  @Test
  void authenticateWithNullUserNameCauseExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> service.authenticate(null, null));
  }

  @Test
  void authenticateWithEmptyUserNameCauseExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> service.authenticate("", null));
  }

  @Test
  void authenticateWithNullPasswordCauseExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> service.authenticate("user1", null));
  }

  @Test
  void authenticateWithEmptyPasswordCauseExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> service.authenticate("user1", ""));
  }

  @Test
  void authenticateUserNotFoundWithSuchUserNameCauseExceptionTest() {
    when(userDatabase.getUserByUsername("user1")).thenReturn(Optional.empty());
    Assertions.assertThrows(NoSuchElementException.class, () -> service.authenticate("user1", "password1"));
  }

  @Test
  void authenticateUserPasswordMismatchWithExceptionTest() {
    User user = new User(1, "user1", "email1");
    user.setPassword("password");
    when(userDatabase.getUserByUsername("user1")).thenReturn(Optional.of(user));
    Assertions.assertThrows(NoSuchElementException.class, () -> service.authenticate("user1", "password1"));
  }

  @Test
  void authenticateUserTest() {
    User user = new User(1, "user1", "email1");
    user.setPassword("password1");
    when(userDatabase.getUserByUsername("user1")).thenReturn(Optional.of(user));
    Assertions.assertTrue(service.authenticate("user1", "password1"));
  }

  @Test
  void grantAccessNullUserWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> service.grantAccess(null));
  }

  @Test
  void grantAccessNotFoundUserInDBWithExceptionTest() {
    when(userDatabase.getUserById(user.getId())).thenReturn(Optional.empty());
    Assertions.assertThrows(NoSuchElementException.class, () -> service.grantAccess(user));
  }

  @Test
  void grantAccessTest() {
    when(userDatabase.getUserById(user.getId())).thenReturn(Optional.of(user));
    service.grantAccess(user);
    verify(user, times(1)).setAccess(true);
  }

  @Test
  void revokeAccessNullUserWithExceptionTestTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> service.revokeAccess(null));
  }

  @Test
  void revokeAccessNotFoundUserInDBWithExceptionTest() {
    when(userDatabase.getUserById(user.getId())).thenReturn(Optional.empty());
    Assertions.assertThrows(NoSuchElementException.class, () -> service.revokeAccess(user));
  }

  @Test
  void revokeAccessTest() {
    when(userDatabase.getUserById(user.getId())).thenReturn(Optional.of(user));
    service.revokeAccess(user);
    verify(user, times(1)).setAccess(false);
  }
}