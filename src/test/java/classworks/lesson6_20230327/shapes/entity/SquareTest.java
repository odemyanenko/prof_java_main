package classworks.lesson6_20230327.shapes.entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

  Square square = new Square("Square", 10);

  @Test
  public void calculateArea() {
    double expectedArea = 100;
    double realArea = square.calculateArea();

    assertEquals(expectedArea, realArea, 2);
  }

  @Test
  public void calculatePerimetr() {
    double expectedPerimeter = 40;
    double realPerimeter = square.calculatePerimetr();

    assertEquals(expectedPerimeter, realPerimeter, 2);
  }
}