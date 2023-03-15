package lesson3_20230315.moveable;

public class Transport implements Moveable{
  @Override
  public void moveRight() {
    System.out.println("Transport is moving on the right!");
  }

  @Override
  public void moveLeft() {
    System.out.println("Transport is moving on the left!");
  }

  public void stop(){
    System.out.println("Transport is stopping!");
  }

  public void start(){
    System.out.println("Transport is starting!");
  }
}
