package classworks.lesson_20230914;

import java.util.regex.Pattern;

public class UserValidation {
  public boolean validateUsername(String username) {
    if (username.length() < 6 || username.length() > 20) {
      return false;
    }

    if (!username.matches("^[a-zA-Z0-9]+$")) {
      return false;
    }

    return true;
  }

  public boolean validateEmail(String email) {
    if (email.length() < 6 || email.length() > 50) {
      return false;
    }

    if (!email.contains("@")) {
      return false;
    }

    return true;
  }
}


class UserValidation_Impl {
  private static final String USERNAME_REGEX = "^[a-zA-Z0-9]{6,20}$";
  private static final String EMAIL_REGEX = "^(?=.{5,50}$)[A-Za-z0-9+_.-]+@(.+)$";

  public boolean validateUsername(String username) {
    Pattern pattern = Pattern.compile(USERNAME_REGEX);
    return pattern.matcher(username).matches();
  }

  public boolean validateEmail(String email) {
    Pattern pattern = Pattern.compile(EMAIL_REGEX);
    return pattern.matcher(email).matches();
  }
}
