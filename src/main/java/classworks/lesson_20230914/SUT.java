package classworks.lesson_20230914;

public class SUT {
  public static String toUpperCase1(String input) {
    return input.toUpperCase();
  }

  public static String toLowerCase2(String input) {
    return input.toLowerCase();
  }

  public static char[] toCharArray2(String input) {
    char[] result = new char[input.length()];
    for (int i = 0; i < input.length(); i++) {
      result[i] = input.charAt(i);
    }
    return result;
  }
}

//Я бы все три дублирующие функции вообще бы не пислала
class SUT_Impl {
  public static String convertToUpperCase(String text) {
    return text.toUpperCase();
  }

  public static String convertToLowerCase(String text) {
    return text.toLowerCase();
  }

  public static char[] convertToCharArray(String text) {
    return text.toCharArray();
  }
}