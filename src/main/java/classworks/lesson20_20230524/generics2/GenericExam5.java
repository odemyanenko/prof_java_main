package classworks.lesson20_20230524.generics2;

public class GenericExam5 {
  public static void main(String[] args) {
    OnlyNumbers<Integer> numbers1 = new OnlyNumbers<>(1);
    OnlyNumbers<Long> numbers2 = new OnlyNumbers<>(123L);
    OnlyNumbers<Double> numbers3 = new OnlyNumbers<>(1.2);
//    OnlyNumbers<String> numbers4 = new OnlyNumbers<>("sdfsdfsd");

    numbers3.printSquare();
  }

  static class OnlyNumbers<T extends Number> {
    private T number;

    public OnlyNumbers(T number) {
      this.number = number;
    }

    public void print() {
      System.out.println(number);
    } public void printSquare() {
      System.out.println(number.doubleValue() * number.doubleValue());
    }
  }
}
