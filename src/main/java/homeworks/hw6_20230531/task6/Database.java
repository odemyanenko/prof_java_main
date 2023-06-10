package homeworks.hw6_20230531.task6;

public class Database {
  private boolean isConnect;

  public Database() {
    this.isConnect = false;
  }

  public boolean isConnect() {
    return isConnect;
  }

  public void connect(){
    isConnect = true;
  }
  public void disconnect(){
    isConnect = false;
  }
}
