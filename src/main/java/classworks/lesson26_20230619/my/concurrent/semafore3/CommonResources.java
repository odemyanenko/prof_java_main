package classworks.lesson26_20230619.my.concurrent.semafore3;

public class CommonResources {
  private int x = 0;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void increment(){
    x++;
  }
}
