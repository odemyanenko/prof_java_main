package classworks.lesson21_20230531.dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date3Example {
  public static void main(String[] args) {
    GregorianCalendar calendar = new GregorianCalendar(2022, Calendar.DECEMBER, 20);
    int month = calendar.get(Calendar.MONTH);
    System.out.println(month);

    calendar.set(1976, Calendar.FEBRUARY, 28);
    System.out.println(calendar.get(Calendar.MONTH));

    calendar = new GregorianCalendar(1975, Calendar.DECEMBER, 23);
    calendar.add(Calendar.MONTH, 2);
    System.out.println(calendar);

    SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
    String dateString = formatter.format(new Date());
    System.out.println(dateString);

    Calendar calendar1 = Calendar.getInstance();
    formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    dateString = formatter.format(calendar1.getTime());
    System.out.println(dateString);
  }
}
