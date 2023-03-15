package lesson3_20230315.moveable;

public class MoveableDemo {
  public static void main(String[] args) {
    Moveable moveable = new Transport();
    Transport transport = new Transport();
    Moveable robot = new Robot();
    Moveable mouse = new Mouse();

    Moveable[] allDevices = {transport, robot, mouse, moveable};
    for (int i = 0; i < allDevices.length; i++) {
      System.out.println(allDevices[i].getClass());
      allDevices[i].moveRight();
      allDevices[i].moveLeft();
      if (allDevices[i].getClass() == Transport.class) {
        ((Transport)allDevices[i]).start();
        ((Transport)allDevices[i]).stop();
      }
      System.out.println("----------------------------------");

    }
  }
}
