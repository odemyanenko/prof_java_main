package classworks.lesson22_20230605.lessonCode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorImplTest {

  @Test
  public void calculatorTaxBelowZeroIncome(){
    TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();
    double income = -100;
    assertThrows(NegativeIncomeException.class, () -> taxCalculator.calculatorTax(income));
  }

  @Test
  void calculatorTaxLess20000() {

    TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();

    double income = 100;
    double expectedTax = 25;
    double actualTax = taxCalculator.calculatorTax(income);

    assertEquals(expectedTax, actualTax);
  }

  @Test
  void calculatorTaxMore20000() {
    TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();

    double income = 40000;
    double expectedTax = 5000 + 8000;
    double actualTax = taxCalculator.calculatorTax(income);

    assertEquals(expectedTax, actualTax);
  }
}