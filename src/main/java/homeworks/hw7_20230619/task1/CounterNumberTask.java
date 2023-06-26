package homeworks.hw7_20230619.task1;

public class CounterNumberTask implements Runnable {
  private int[] array;
  private int start;
  private int finish;
  private int numberSearch;

  private int result = 0;

  public int getResult() {
    return result;
  }

  public CounterNumberTask(int[] array, int start, int finish, int numberSearch) {
    this.array = array;
    this.start = start;
    this.finish = finish;
    this.numberSearch = numberSearch;
  }

  @Override
  public void run() {
    for (int i = start; i < finish; i++) {
      if (array[i] == numberSearch) {
        result++;
      }
    }
//    System.out.println(Thread.currentThread().getName() + " result: " + result);
  }
}
