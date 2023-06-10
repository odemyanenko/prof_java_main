package classworks.lesson21_20230531.junit.test1Example;

public class CalculatorTestOurVersion {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int param1 = 5;
    int param2 = 10;

    int expectedResultedAdd = 15;
    int expectedResultedMult = 50;

    int actualResultAdd = calculator.add(param1, param2);
    int actualResultMult = calculator.multipl(param1, param2);

    isTestPassed("Test 1. Method 'Add'", expectedResultedAdd, actualResultAdd);
    isTestPassed("Test 2. Method 'Mult'", expectedResultedMult, actualResultMult);
  }

  public static void isTestPassed(String message, int expectedResult, int actualResult) {
    System.out.println(message);
    if (actualResult == expectedResult) {
      System.out.println("Test is passed OK!");
    } else {
      System.out.println("Test is FAIL!");
      System.out.printf("Expected: %d, but received: %d\n", expectedResult, actualResult);
    }
  }
}
