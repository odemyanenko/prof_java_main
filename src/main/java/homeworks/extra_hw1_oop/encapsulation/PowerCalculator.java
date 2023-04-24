package homeworks.extra_hw1_oop.encapsulation;

public class PowerCalculator {
  public int powerUp(int base, int rate) {
    if (base < 0 || rate < 0) {
      return -1;
    }
    if (base == 0) {
      return 0;
    }

    int result = 1;

    for (int i = 0; i < rate; i++) {
      result *= base;
    }

    return result;
  }
}
