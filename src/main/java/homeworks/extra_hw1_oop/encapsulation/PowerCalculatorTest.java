package homeworks.extra_hw1_oop.encapsulation;

public class PowerCalculatorTest {

  public static void main(String[] args) {
    PowerCalculator calculator = new PowerCalculator();

    int expectedResult = 1;
    int realResult = calculator.powerUp(2, 0);
    printTestResult("Power calculate with rate = 0", expectedResult, realResult);

    expectedResult = 8;
    realResult = calculator.powerUp(2, 3);
    printTestResult("Power calculate with correct parameters", expectedResult, realResult);

    expectedResult = 0;
    realResult = calculator.powerUp(0, 3);
    printTestResult("Power calculate with base 0", expectedResult, realResult);

    expectedResult = -1;
    realResult = calculator.powerUp(3, -3);
    printTestResult("Power calculate with rate negative", expectedResult, realResult);

    expectedResult = -1;
    realResult = calculator.powerUp(-3, 3);
    printTestResult("Power calculate with base negative", expectedResult, realResult);
  }

  public static void printTestResult(String message, int expectedResult, int realResult){
    if (expectedResult == realResult) {
      System.out.println("Test " + message + " passed OK!");
    }
    else{
      System.out.println("Test " + message + " passed FAIL!");
      System.out.println("Expected result: " + expectedResult + " but real result: " + realResult);
    }
  }
}
