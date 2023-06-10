package classworks.lesson21_20230531.dateAndTime;

import java.util.Calendar;
import java.util.TimeZone;

public class Date4Example {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();

    System.out.println("Local time " + calendar.getTime());
    TimeZone timeZone = TimeZone.getTimeZone("Asis/Shanghai");
    calendar.setTimeZone(timeZone);

    calendar.set(calendar.HOUR_OF_DAY, 24);
    calendar.set(calendar.MINUTE, 10);
    calendar.set(calendar.SECOND, 10);

    System.out.println("China time " + calendar.getTime());
  }
}
