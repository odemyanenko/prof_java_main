package classworks.lesson13_20230426.lambda;

public class AvgExample1 {
  public static void main(String[] args) {
    IAverage ref;
    ref = (a, b, c) -> (a + b + c) / 3.0;

    System.out.println("Average = " + ref.avg(2, 3, 5));
  }
}
