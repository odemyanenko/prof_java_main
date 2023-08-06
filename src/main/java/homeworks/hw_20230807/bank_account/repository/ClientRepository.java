package homeworks.hw_20230807.bank_account.repository;

import homeworks.hw_20230807.bank_account.enums.AccountStatus;
import homeworks.hw_20230807.bank_account.models.Client;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ClientRepository {
  //- Map (храниться минимум 25 Клиентов. Ключ -> Клиент, Значение -> баланс)
  private Map<Client, BigDecimal> clients = new HashMap<>();

  //  - Выводят всех клиентов, у которых определенный статус карты.
  public void printClientsByStatus(Map<Client, BigDecimal> clients, AccountStatus status) {

  }

  //  - Группируют по балансу: у кого больше или меньше какой-то суммы.
  public Map<Client, BigDecimal> getClientsGroupByBalance(Map<Client, BigDecimal> clients, BigDecimal balance, boolean isTypeFilter) {
    return null;

  }

  //- Средний баланс по клиентам.
  public BigDecimal getAverageBalance(Map<Client, BigDecimal> clients) {
    return new BigDecimal(0);
  }

  //  - Выводят только номера карт всех клиентов в формате имя -> номер.
  public void printAllAccounts(Map<Client, BigDecimal> clients) {

  }

  //  - Выводят всех клиентов, у кого закончился срок действия карт.
  public void printAccountsWithExpireDate(Map<Client, BigDecimal> clients) {

  }

  //- Сортируют по балансу.
  public Map<Client, BigDecimal> getClientsSortedByBalance(Map<Client, BigDecimal> clients) {
    return null;
  }

//  - Группируют: у кого закончился срок карт, а у кого нет.
  public Map<Client, BigDecimal> getClientsGroupByExpireDate(Map<Client, BigDecimal> clients) {
    return null;
  }
}