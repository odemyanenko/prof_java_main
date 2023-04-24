package classworks.lesson6_20230327.shapes.entity;

public class Square extends Shape{
  private double sideA;

  @Override
  public double calculateArea() {
    return sideA*sideA;
  }

  @Override
  public double calculatePerimetr() {
    return 2*2*sideA;
  }

  public Square(String title, double sideA) {
    super(title);
    this.sideA = sideA;
  }

  @Override
  public String toString() {
    return "Square{" +
            "sideA=" + sideA +
            '}';
  }
}
