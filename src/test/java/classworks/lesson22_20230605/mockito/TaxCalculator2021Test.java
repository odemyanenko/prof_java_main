package classworks.lesson22_20230605.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TaxCalculator2021Test {

  @Test
  public void calculatorTaxCurrentYear() {
    CurrentYearProvider currentYearProvider = new CurrentYearProviderImpl();

    TaxCalculator2021 calculator2021 = new TaxCalculator2021(currentYearProvider);

    double income = 1000;

    double expectedTax = 1000 * 0.25;

    double actualTax = calculator2021.calculatorTax(income);

    assertEquals(expectedTax, actualTax);

  }

  @Test
  public void calculatorTaxFor2021(){
    CurrentYearProvider currentYearProvider = mock(CurrentYearProvider.class);

    TaxCalculator2021 calculator2021 = new TaxCalculator2021(currentYearProvider);

    when(currentYearProvider.getYear()).thenReturn(2021);

    double income = 1000;

    double expectedTax = 1000 * 0.22;

    double actualTax = calculator2021.calculatorTax(income);

    assertEquals(expectedTax, actualTax);

  }
}