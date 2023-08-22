package homeworks.hw_20230823;

public class SumNumbersWithThreads {
  public static void main(String[] args) throws InterruptedException {
    TaskSumInRange task1 = new TaskSumInRange(1, 2500);
    TaskSumInRange task2 = new TaskSumInRange(2501, 5000);
    TaskSumInRange task3 = new TaskSumInRange(5001, 7500);
    TaskSumInRange task4 = new TaskSumInRange(7501, 10000);

    Thread thread1 = new Thread(task1);
    thread1.setName("TR_1");

    Thread thread2 = new Thread(task2);
    thread2.setName("TR_2");

    Thread thread3 = new Thread(task3);
    thread3.setName("TR_3");

    Thread thread4 = new Thread(task4);
    thread4.setName("TR_4");

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();

    thread1.join();
    thread2.join();
    thread3.join();
    thread4.join();

    int totalSum = task1.getResult() + task2.getResult() + task3.getResult() + task4.getResult();
    System.out.println("sum (1..10_000): " + totalSum);
  }
}
