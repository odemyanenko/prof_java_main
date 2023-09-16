package classworks.lesson_20230914;

import java.util.regex.Pattern;

public class EmailValidator {
//  public static boolean validateEmail(String email) {
//    String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
//    boolean c = checkEmail(emailRegex);
//    return c;
//  }
}

class EmailValidator_Impl {
  private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";

  public static boolean validateEmail(String email) {
    Pattern pattern = Pattern.compile(EMAIL_REGEX);
    return pattern.matcher(email).matches();
  }
}