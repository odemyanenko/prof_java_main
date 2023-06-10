package classworks.lesson21_20230531.junit.test1Example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

  Calculator calculator = new Calculator();

  int x;
  int y;

  @Test
  public void add() {
    x = 5;
    y = 10;
    int expectedResult = 15;
    int actualResult = calculator.add(x, y);

    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void multipl() {
    x = 5;
    y = 10;
    int expectedResult = 50;
    int actualResult = calculator.multipl(x, y);

    assertEquals(expectedResult, actualResult);
  }
}