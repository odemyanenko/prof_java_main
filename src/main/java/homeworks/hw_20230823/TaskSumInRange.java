package homeworks.hw_20230823;

public class TaskSumInRange implements Runnable {
  private final int startRange;
  private final int endRange;
  private int result = 0;

  public int getResult() {
    return result;
  }

  public TaskSumInRange(int startRange, int endRange) {
    this.startRange = startRange;
    this.endRange = endRange;
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " start");
    for (int i = startRange; i <= endRange; i++) {
      result += i;
    }
    System.out.println(Thread.currentThread().getName() + " - sum (" + startRange + ".." + endRange + "): " + result);
  }
}
