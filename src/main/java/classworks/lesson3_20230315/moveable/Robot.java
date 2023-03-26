package classworks.lesson3_20230315.moveable;

public class Robot implements Moveable{
  @Override
  public void moveRight() {
    System.out.println("Robot is moving on the right!");
  }

  @Override
  public void moveLeft() {
    System.out.println("Robot is moving on the left!");
  }
}
