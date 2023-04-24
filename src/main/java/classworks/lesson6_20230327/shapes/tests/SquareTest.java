package classworks.lesson6_20230327.shapes.tests;

import classworks.lesson6_20230327.shapes.entity.Square;

public class SquareTest {
  public static void main(String[] args) {
    int sideA = 10;

    String title = "Square";

    Square square = new Square(title, sideA);

    double expectedAreaResult = 100;
    double realAreaResult = square.calculateArea();

    double expectedPerimeterResult = 40;
    double realPerimeterResult = square.calculatePerimetr();

    printTestResult("Square calculate area", expectedAreaResult, realAreaResult);
    printTestResult("Square calculate perimeter", expectedPerimeterResult, realPerimeterResult);
  }

  public static void printTestResult(String message, double expectedResult, double realResult){
    if (expectedResult == realResult) {
      System.out.println("Test " + message + " passed OK!");
    }
    else{
      System.out.println("Test " + message + " passed FAIL!");
      System.out.println("Expected result: " + expectedResult + " but real result: " + realResult);
    }
  }
}
