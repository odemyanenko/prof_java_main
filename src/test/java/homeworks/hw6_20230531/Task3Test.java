package homeworks.hw6_20230531;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

  String originalString = "hello";
  int startIndex = 2;
  int endIndex = 4;

  @Test
  public void substring() {
    String expectedResult = "ll";
    String actualResult = Task3.substring(originalString, startIndex, endIndex);

    assertEquals(expectedResult, actualResult);
  }
}