package homeworks.hw7_20230619.task1;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

  public static int[] createWithSize(int size) {
    return new int[size];
  }

  public static int[] fillRandomNumber(int[] array, int start, int end) {
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(start, end + 1);
    }
    return array;
  }

  public static int[] createAndFillRandomNumber(int size, int start, int end) {
    int[] array = createWithSize(size);
    return fillRandomNumber(array, start, end);
  }

  public static int getCountNumber(int[] array, int findNumber) {
    return (int) Arrays.stream(array)
            .boxed()
            .filter(e -> e == findNumber)
            .count();
  }

  public static int getCounterNumberByMultiThreads(int[] array, int size, int findNumber) {
    int delta = size / 3;

    CounterNumberTask task1 = new CounterNumberTask(array, 1, delta, findNumber);
    CounterNumberTask task2 = new CounterNumberTask(array, delta, delta * 2, findNumber);
    CounterNumberTask task3 = new CounterNumberTask(array, delta * 2, size, findNumber);

    Thread thread1 = new Thread(task1);
    Thread thread2 = new Thread(task2);
    Thread thread3 = new Thread(task3);

    thread1.start();
    thread2.start();
    thread3.start();

    try {
      thread1.join();
      thread2.join();
      thread3.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    return task1.getResult() + task2.getResult() + task3.getResult();
  }
}
