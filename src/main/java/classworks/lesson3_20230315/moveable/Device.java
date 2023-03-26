package classworks.lesson3_20230315.moveable;

abstract class Device implements Moveable{
  @Override
  public void moveRight() {
    System.out.println("Device is moving on the right!");
  }

}
