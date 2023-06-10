package homeworks.hw6_20230531;

/*
Напишите тест, который проверяет, что:
- метод substring() правильно обрезает строку. Например, когда мы
вызываем substring(2, 4) для строки "hello", мы ожидаем получить "ll".
*/

public class Task3 {
  public static void main(String[] args) {
    String text = "hello";

    System.out.println("Original text: " + text);
    System.out.println("Substring Text (2,4): " + substring(text, 2, 4));
  }

  public static String substring(String original, int startIndex, int endIndex) {
    return original.substring(startIndex, endIndex);
  }
}
