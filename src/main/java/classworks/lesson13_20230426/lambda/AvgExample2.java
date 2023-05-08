package classworks.lesson13_20230426.lambda;

public class AvgExample2 {
  public static void main(String[] args) {
    printAverage((a, b, c) -> (a + b + c) / 3.0, 2, 4, 6);
  }

  public static void printAverage(IAverage ref, double a, double b, double c) {
    System.out.println("Average = " + ref.avg(a, b, c));
  }
}
