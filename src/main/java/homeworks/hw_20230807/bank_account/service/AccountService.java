package homeworks.hw_20230807.bank_account.service;

import homeworks.hw_20230807.bank_account.enums.CurrencyCode;
import homeworks.hw_20230807.bank_account.models.Account;

public class AccountService {

  public Account createAccountUSD(){
    return new Account(CurrencyCode.USD);
  }

  public Account createAccountEUR(){
    return new Account(CurrencyCode.EUR);
  }

  public Account createAccountUAH(){
    return new Account(CurrencyCode.UAH);
  }
}


/*
*
 StringBuilder result = new StringBuilder();

         for (int i = 0; i < CARD_NUMBER_LENGTH; i++) {
             result.append(RANDOM.nextInt(10));
         }

         LocalDate currentDate = LocalDate.now();
         int randomDayOffset = RANDOM.nextInt(1825);
         LocalDate cardExpireDate = currentDate.plusDays(randomDayOffset).minusYears(2);
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
         result.append(cardExpireDate.format(formatter));

         for (int i = 0; i < CVV_CODE_LENGTH; i++) {
             result.append(RANDOM.nextInt(10));
         }

         return result.toString();
* */