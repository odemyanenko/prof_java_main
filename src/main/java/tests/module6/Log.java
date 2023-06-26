package tests.module6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
  public static void setInLog(String name, Product product, String event){
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = now.format(formatter);

    System.out.printf("%s : %s : %s : %s\n", formattedDateTime, name, product, event);
  }
}
