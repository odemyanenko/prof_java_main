package classworks.lesson22_20230605.lessonCode;

/*
Cоздать метод для расчета суммы налога
        В качестве параметра в метод передается сумма дохода

        1) income = 0, tax = 0
        2) income up to 20000 is tax rate is 25%
        3) income > 20000, tax rate = 40%

        income = 30000
        на сумму до 20000 ставка налога будет 25%, а
        на сумму от 20001 до 30000 - ставка 40%
*/

public class TaxCalculatorImpl implements TaxCalculator{
  @Override
  public double calculatorTax(double income) {

    double taxAmount = 0;

    if (income < 0) {
      throw new NegativeIncomeException("Income cannot be negative");
    }

    if (income <= 20000) {
      taxAmount = income * 0.25;
    } else {
      taxAmount = 20000 * 0.25 + (income - 20000) * 0.4;
    }

    return taxAmount;
  }
}