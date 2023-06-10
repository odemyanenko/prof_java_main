package homeworks.hw6_20230531;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test {

  int[] array = {1, 2, 3, 4, 5};

  @Test
  public void getAverage() {
    double expectedResult = 3;
    double actualResult = Task4.getAverage(array);

    assertEquals(expectedResult, actualResult, 0);
  }
}