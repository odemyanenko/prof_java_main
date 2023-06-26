package tests.module5.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task1Test {

  @Test
  void testValidateEmail_ValidEmail() {
    String email = "user@domain.com";
    assertDoesNotThrow(() -> Task1.validateEmail(email));
  }

  @Test
  void testValidateEmail_InvalidEmail() {
    String email = "user@domain";
    assertThrows(EmailValidationException.class, () -> Task1.validateEmail(email));
  }
}