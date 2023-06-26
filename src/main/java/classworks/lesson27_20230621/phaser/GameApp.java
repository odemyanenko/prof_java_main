package classworks.lesson27_20230621.phaser;

import java.util.concurrent.Phaser;

public class GameApp {
  public static void main(String[] args) throws InterruptedException {
    Phaser phaser = new Phaser(1);

    for (int i = 0; i < 3; i++) {

      Thread thread = new Thread(new Player(i, phaser));
      thread.start();
    }

    phaser.arriveAndAwaitAdvance();

    System.out.println("Игра началась!");

    Thread.sleep(5000);

    phaser.arriveAndDeregister();

    System.out.println("Игра закончилась!");

    while (phaser.getRegisteredParties() > 0) {
      System.out.println("игроков осталось " + phaser.getRegisteredParties());
    }

    System.out.println("Все игроки отключились");
  }
}