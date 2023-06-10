package homeworks.hw6_20230531;

/*
Напишите тест, который проверяет, что:
- метод toUpperCase() возвращает верное значение для строки "hello"
(ожидаемый результат - "HELLO").
*/

public class Task1 {
  public static void main(String[] args) {
    String text = "I love Java!";
    System.out.println("Original text: " + text);
    System.out.println("Modified text: " + toUpperCase(text));
  }

  public static String toUpperCase(String text){
    return text.toUpperCase();
  }
}
