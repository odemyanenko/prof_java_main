package homeworks.hw6_20230531;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

  String originalString = "hello world";
  String findString = "world";

  @Test
  public void contains() {
    boolean actualResult = Task2.contains(originalString, findString);

    assertTrue(actualResult);
  }
}