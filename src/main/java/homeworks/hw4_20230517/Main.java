package homeworks.hw4_20230517;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    UserInput input = new UserInput();

    String operation = input.getText("Please, enter type operation:\n" +
            "1 - email\n" +
            "2 - string with latin and numbers\n" +
            "3 - phone\n" +
            "4 - replace 12345 to number\n" +
            "5 - check string begin Aa\n" +
            "6 - get List<String> include in Text\n" +
            "other - exit)");
    switch (operation) {
      case "1" : {
        String stringEMail = input.getText("Please, enter your email...");
        System.out.println("Is email correct? - " + isEMailCorrect(stringEMail));
        break;
      }
      case "2" : {
        String inputString = input.getText("Please, enter string...");
        System.out.println("Is string exists only latin symbols und numbers? - " + isWordsCharsString(inputString));
        break;
      }
      case "3" : {
        String stringPhone = input.getText("Please, enter phone...");
        System.out.println("Is phone correct? - " + isPhoneCorrect(stringPhone));
        break;
      }
      case "4" : {
        String stringNumbers = input.getText("Please, enter string with 12345...");
        System.out.println("Result string (12345 -> number) - " + replaceNumbers(stringNumbers));
        break;
      }
      case "5" : {
        String stringA = input.getText("Please, enter string with A...");
        System.out.println("Check string from Aa - " + checkBeginA(stringA));
        break;
      }
      case "6" : {
        String text = input.getText("Please, enter text...");
        System.out.println("Include in text - " + getStringsIncludeInText(text));
        break;
      }
      default: return;
    };
  }

  /**
   *     Напишите программу, которая получает на вход текст и проверяет,
   *     вхождения определенных строк в текст. Строки заданы в виде коллекции.
   *     Используйте регулярное выражение для проверки текста.
   *     Верните в качестве результата работы коллекцию из строк,
   *     которые входят в текст.
   */
  public static List<String> getStringsIncludeInText(String text){
    List<String> list = Arrays.asList("pen", "lamp", "bad", "I", "you");

    return Arrays.stream(text.split("\\W+"))
            .filter(list::contains)
            .distinct()
            .collect(Collectors.toList());
  }

  /**
   *    Напишите программу, которая запрашивает у пользователя строку
   *     и проверяет, начинается ли эта строка с буквы "A" (большой или маленькой).
   *     Используйте регулярное выражение для проверки начала строки.
   */
  private static boolean checkBeginA(String text) {
    return text.matches("[Aa].*");
  }

  /**
   *     Напишите программу, которая запрашивает у пользователя строку
   *     и заменяет все вхождения чисел в строке на слово "number".
   *     Например, если строка содержит "12345", то программа должна
   *     заменить это на "number". Используйте регулярное выражение
   *     для поиска чисел в строке.
   */
  public static String replaceNumbers(String text){
//    "\\d+"
    return text.replaceAll("12345", "number");
  }

  /**
   * Напишите программу, которая запрашивает у пользователя строку
   *   и проверяет, является ли эта строка действительным номером телефона.
   *   Действительный номер телефона должен начинаться с символа "+"
   *   и содержать девять цифр. Используйте регулярное выражение
   *   для проверки номера телефона.
   */

  public static boolean isPhoneCorrect(String text){
    return text.matches("[+]\\d{9}");
  }
  /**
   Напишите программу, которая запрашивает у пользователя строку
   и проверяет, состоит ли эта строка только из букв и цифр.
   Используйте регулярное выражение для проверки,
   что в строке содержатся только символы латинского алфавита
   (большие и/или маленькие) и цифры.
   */
  public static boolean isWordsCharsString(String text) {
    return text.matches("[a-zA-Z0-9]+");
  }

  /**
   * Напишите программу, которая запрашивает у пользователя строку и проверяет,
   *     является ли эта строка действительным email-адресом.
   *     Действительный email-адрес должен содержать символ "@",
   *     доменное имя и доменное расширение (например, ".com" или ".org").
   *     Используйте регулярное выражение для проверки email-адреса.
   */
  public static boolean isEMailCorrect(String text){
    //"^[A-Z0-9+_.-]+@[A-Z0-9.-]+$"
    //"^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"
    return text.matches("\\w+@\\w+(.com|.org)");
  }
}
