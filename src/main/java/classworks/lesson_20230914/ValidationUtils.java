package classworks.lesson_20230914;

import java.util.regex.Pattern;

public class ValidationUtils {
//    public boolean isEmailValid(String email) {
//        String emailRegex = "^[A-Za-z0-9+_.-]+@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,}$";
//        boolean b = checker(emailRegex);
//        return b;
//    }

  public boolean isPhoneNumberValid(String phoneNumber) {
    String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");

    if (digitsOnly.length() != 10) {
      return false;
    }

    if (!digitsOnly.startsWith("+1")) {
      return false;
    }

    return true;
  }

  public boolean isPasswordValid(String password) {
    if (password.length() < 8) {
      return false;
    }

    if (!password.matches(".*[A-Z].*")) {
      return false;
    }

    if (!password.matches(".*[a-z].*")) {
      return false;
    }

    if (!password.matches(".*\\d.*")) {
      return false;
    }

    if (!password.matches(".*[!@#$%].*")) {
      return false;
    }

    if (password.contains(" ")) {
      return false;
    }
    return true;
  }
}

class ValidationUtils_Impl {
  private static final String USERNAME_REGEX = "^(?=.*[A-Z].*)(?=.*[a-z].*)(?=.*\\d.*)(?=.*[!@#$%].*)[A-Za-z\\d!@#$%]{8,}$";
  private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,}$";
  private static final String PHONE_REGEX = "^\\+1[0-9]{9}$";

  public boolean isEmailValid(String email) {
    Pattern pattern = Pattern.compile(EMAIL_REGEX);
    return pattern.matcher(email).matches();
  }

  public boolean isPhoneNumberValid(String phoneNumber) {
    Pattern pattern = Pattern.compile(PHONE_REGEX);
    return pattern.matcher(phoneNumber).matches();
  }

  public boolean isPasswordValid(String password) {
    Pattern pattern = Pattern.compile(USERNAME_REGEX);
    return pattern.matcher(password).matches();
  }
}

