package classworks.lesson_20230831.task1;

/*
Вы хотите организовать соревнование, где несколько
        участников будут стартовать одновременно, как только все они будут готовы.

        Создайте класс Participant, представляющий участника.
        Создайте класс Race, который будет организовывать соревнование с использованием CountDownLatch.
        Реализуйте код, который создает участников и запускает соревнование.
*/

import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CDL {
  public static void main(String[] args) {
    CountDownLatch countDownLatch = new CountDownLatch(3);

    List<Participant> participants = List.of(
            new Participant("Ivan", countDownLatch),
            new Participant("Petro", countDownLatch),
            new Participant("Lena", countDownLatch)
            );

    Race race = new Race(participants, countDownLatch);
    race.start();
  }
}

class Participant extends Thread {
  private String name;
  private CountDownLatch countDownLatch;

  public Participant(String name, CountDownLatch countDownLatch) {
    this.name = name;
    this.countDownLatch = countDownLatch;
    this.start();
  }

  @Override
  public void run() {
    try {
      System.out.println(name + " ready to start...");
      countDownLatch.await();
      Thread.sleep(new Random().nextInt(3000, 6000));
      System.out.println(name + " finished");
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}

class Race {
  private List<Participant> participants;
  private CountDownLatch countDownLatch;

  public Race(List<Participant> participants, CountDownLatch countDownLatch) {
    this.participants = participants;
    this.countDownLatch = countDownLatch;
  }

  public void start() {
//    prepareToStart();
    try {
      countDown();
      System.out.println("start...");
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  private void countDown() throws InterruptedException {
    for (int i = 3; i > 0; i--) {
      System.out.println(i);
      countDownLatch.countDown();
      Thread.sleep(1000);
    }
  }

  private void prepareToStart() {
    for (Participant participant : participants) {
      participant.start();
    }
  }
}
