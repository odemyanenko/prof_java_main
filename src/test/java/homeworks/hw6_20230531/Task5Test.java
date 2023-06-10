package homeworks.hw6_20230531;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Task5Test {

  List<Integer> originalList = Arrays.asList(-1, 2, -3, 4, -5);

  @Test
  public void getMax() {
    int expectedResult = 4;
    int actualResult = Task5.getMax(originalList);

    assertEquals(expectedResult, actualResult);
  }
}