package classworks.lesson22_20230605.lessonCode;

public class TaxCalculator2 {
  public static void main(String[] args) {
    double income = 234.56;
  }
  public double calculateTax(double income){
////    if (income < 0) {
////      new IllegalArgumentException("Value less Zero!");
//    }
    if (income <= 20000) {
      return 0;
    } else {
      return 0.25;
    }
  }
}
