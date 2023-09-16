package classworks.lesson_20230914;

import java.util.stream.Collectors;

public class StringUtils {
  public static String toUpperCase(String input) {

    return input.chars()
            .mapToObj(Character::toString)
            .map(s -> {
              if (s.equals(" ")) {
                return " ";
              } else {
                return s.toUpperCase();
              }
            })
            .collect(Collectors.joining());
  }
}

class StringUtils_Impl {
  //я бы это тоже убрала вообще
  public static String toUpperCase(String input) {
    return input.toUpperCase();
  }
}
