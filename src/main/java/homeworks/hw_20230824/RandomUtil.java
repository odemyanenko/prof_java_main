package homeworks.hw_20230824;

import java.util.Random;

public class RandomUtil {
  private static final Random random = new Random();

  public static int getNumberByMaxValue(int maxValue) {
    return random.nextInt(1, maxValue);
  }
}
