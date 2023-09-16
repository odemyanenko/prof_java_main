package classworks.lesson_20230914;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
  public static String formatDateForDisplay(Date date) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    return sdf.format(date);
  }

  public static String formatTimeForDisplay(Date date) {
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    return sdf.format(date);
  }

  public static String formatDateTimeForDisplay(Date date) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    return sdf.format(date);
  }
}

class DateUtils_Impl {
  public static String formatDateForDisplay(Date date) {
    return formatDateTimeWithPattern(date, "dd/MM/yyyy");
  }

  public static String formatTimeForDisplay(Date date) {
    return formatDateTimeWithPattern(date, "HH:mm:ss");
  }

  public static String formatDateTimeForDisplay(Date date) {
    return formatDateTimeWithPattern(date, "dd/MM/yyyy HH:mm:ss");
  }

  private static String formatDateTimeWithPattern(Date date, String pattern) {
    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    return sdf.format(date);
  }
}