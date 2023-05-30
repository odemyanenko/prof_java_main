package homeworks.hw5_20230524.optional;

/*
Напишите метод, который получает значение типа String и
возвращает его длину, если оно не равно null, используя Optional.
*/

import java.util.Optional;

public class Task4 {
  public static void main(String[] args) {
    String text = "I love Java!";
    int textLength = getLength(text);
    System.out.println("Length if (" +text+ ") : " + textLength);

    String nullString = null;
    int nullLength = getLength(nullString);
    System.out.println("Length if (" +nullString+ ") : " + nullLength);
  }

  public static int getLength(String text) {
    return Optional.ofNullable(text)
            .map(String::length)
            .orElse(0)
            ;
  }
}
