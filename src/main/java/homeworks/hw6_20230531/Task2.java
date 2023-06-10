package homeworks.hw6_20230531;

/*
Напишите тест, который проверяет, что:
- метод contains() возвращает true для строки "hello world", когда
  мы ищем подстроку "world".
*/

public class Task2 {
  public static void main(String[] args) {
    String text = "hello world";

    System.out.println("Original text: " + text);
    System.out.println("Is exists 'world' in string? : " + contains(text, "world"));
  }

  public static boolean contains(String text, String findText) {
    return text.contains(findText);
  }
}
