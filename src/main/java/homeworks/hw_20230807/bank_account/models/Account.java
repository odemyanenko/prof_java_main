package homeworks.hw_20230807.bank_account.models;

import homeworks.hw_20230807.bank_account.enums.AccountStatus;
import homeworks.hw_20230807.bank_account.enums.CurrencyCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Account {
  private UUID id;
  private String data;
  private CurrencyCode currencyCode;
  private AccountStatus status;

  public Account(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    this.status = AccountStatus.ACTIVE;
  }
}
