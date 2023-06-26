package tests.module5.task1;

/*
Создайте программу, которая будет проверять введённый из консоли email на корректность.
Email должен содержать имя ящика (например, bubble123), затем символ @, далее домен второго уровня (например, gmail) и
домен первого уровня (например, com), разделённые точкой.
Постарайтесь использовать регулярное выражение для проверки.
Если адрес не прошёл проверку, то метод проверки должен выбросить исключение EmailValidationException
(данный класс Вам нужно создать) с соответствующим текстом ошибки. В основной программе необходимо перехватить такое исключение.
Пользователь может вводить некорректный email не более 3 раз, после чего программа завершает работу.

Все попытки ввода неправильного email должны быть выведены перед завершением программы в консоль.
В консоли должны отобразиться номер попытки, введённый email, а также дата и время попытки.
Используя JUnit, напишите тесты для проверки метода: должны быть проверены минимум 5 различных адресов для
положительного случая работы метода и минимум 5 адресов для отрицательного случая (выбрасывание исключения).
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
  private static final int MAX_TRY = 3;

  public static void main(String[] args) {
    int count = 0;
    StringBuilder invalidEmails = new StringBuilder();
    while (count < MAX_TRY) {
      String email = inputEMail("Please, enter email...");
      try {
        validateEmail(email);
        System.out.println("Email is valid.");
        break;
      } catch (EmailValidationException e) {
        count++;
        System.out.println("Invalid email: " + e.getMessage());
        invalidEmails.append(count).append(") ").append(getCurrentTime()).append(" : ").append(email).append("\n");
      }
    }
    if (invalidEmails.length() > 0) {
      System.out.println("-----------------------------------");
      System.out.println("Invalid emails:");
      System.out.println(invalidEmails.toString());
    }
  }

  private static String getCurrentTime() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return LocalDateTime.now().format(formatter);
  }

  public static void validateEmail(String email) throws EmailValidationException {
    String regex = "^[\\w.-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$";
    Pattern pattern = Pattern.compile(regex);

    if (!pattern.matcher(email).matches()) {
      throw new EmailValidationException("Invalid email format");
    }
  }

  public static String inputEMail(String message) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(message);
    return scanner.nextLine();
  }
}