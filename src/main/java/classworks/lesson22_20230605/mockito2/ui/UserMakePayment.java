package classworks.lesson22_20230605.mockito2.ui;

import classworks.lesson22_20230605.mockito2.developerNumber1.BankServiceDB;
import classworks.lesson22_20230605.mockito2.developerNumber2.developerNumber1.BankServiceCommertzBank;

public class UserMakePayment {
  public void userPayment(){

    String employeeCity = "Berlin";
    if (employeeCity == "Berlin") {
      BankServiceDB bankServiceDB = new BankServiceDB();

      //PayRoll payRoll = new PayRoll(bankServiceDB)
    }
    if (employeeCity == "Vienna") {
      BankServiceCommertzBank serviceCommertzBank = new BankServiceCommertzBank();

      //PayRoll payRoll = new PayRoll(serviceCommertzBank)
    }
  }
}