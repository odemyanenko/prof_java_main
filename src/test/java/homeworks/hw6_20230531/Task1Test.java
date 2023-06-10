package homeworks.hw6_20230531;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

  String originalString = "I love my family!";

  @Test
  public void toUpperCase() {
    String expectedResult = "I LOVE MY FAMILY!";
    String actualResult = Task1.toUpperCase(originalString);

    assertEquals(expectedResult, actualResult);
  }
}