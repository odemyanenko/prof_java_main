package classworks.lesson25_20230614.synhronizedExample;

public class TestThread extends Thread{
  BankAccount bankAccount;

  public TestThread(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  @Override
  public void run(){
    this.bankAccount.increaseBalance();
  }
}