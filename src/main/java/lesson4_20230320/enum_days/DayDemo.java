package lesson4_20230320.enum_days;

public class DayDemo {
  public static void main(String[] args) {
    Day current = Day.Friday;
    Catalog catalog = new Catalog();
    catalog.setDay(current);
    catalog.setDescription("Meeting about Java lesson");
  }
}
