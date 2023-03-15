package lesson3_20230315.moveable;

public class Mouse extends Device{
  @Override
  public void moveRight() {
    super.moveRight();
    System.out.println("Mouse is moving on the right!");
  }

  @Override
  public void moveLeft() {
    System.out.println("Mouse is moving on the left!");
  }
}
