package tests.module4;

/*
Создайте консольное приложение,
в котором выведите в консоль вычисление следующих примеров: 10L/4, 10L/2, 10L/0.

Если в программе возникает исключение,
то сообщение об исключении нужно вывести в файл err.log.
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
  public static void main(String[] args) {
    System.out.println("10L/4 = " + calc(10L, 4));
    System.out.println("10L/2 = " + calc(10L, 2));
    System.out.println("10L/0 = " + calc(10L, 0));
  }

  private static long calc(long num1, int num2) {
    long result = 0;
    try {
      result = num1 / num2;
    } catch (ArithmeticException e) {
      addToLogFile(String.format("Error calculation %2d / %2d : %s\n",  num1, num2, e.toString()));
    }

    return result;
  }

  private static void addToLogFile(String message) {
    String LOG_FILE = "err.log";
    String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    Date date = new Date();
    SimpleDateFormat dmyFormat = new SimpleDateFormat(DATE_FORMAT);

    message = dmyFormat.format(date) + " : "+ message;

    File file = new File(LOG_FILE);
    if (!file.exists()) {
      try {
        if (!file.createNewFile()) {
          return;
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    try (FileOutputStream fileOutputStream = new FileOutputStream(LOG_FILE, true);) {
      byte[] byteArray =  message.getBytes();
      fileOutputStream.write(byteArray);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
