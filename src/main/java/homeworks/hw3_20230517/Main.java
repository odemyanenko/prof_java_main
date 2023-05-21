package homeworks.hw3_20230517;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Map<String, String> monthToSeason = Arrays.stream(java.time.Month.values()).collect(Collectors.toMap(Enum::name, m -> switch (m.ordinal()) {
      case 1, 2, 12 -> "Winter";
      case 3, 4, 5 -> "Spring";
      case 6, 7, 8 -> "Summer";
      case 9, 10, 11 -> "Autumn";
      default -> "";
    }));
    System.out.println(monthToSeason.get("June"));
  }
}
