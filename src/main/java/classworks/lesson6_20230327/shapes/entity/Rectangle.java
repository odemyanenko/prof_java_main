package classworks.lesson6_20230327.shapes.entity;

public class Rectangle extends Shape {
  private double sideA;
  private double sideB;

  @Override
  public double calculateArea() {
    return sideA*sideB;
  }

  @Override
  public double calculatePerimetr() {
    return 2 * (sideA+sideB);
  }

  public Rectangle(String title, double sideA, double sideB) {
    super(title);
    this.sideA = sideA;
    this.sideB = sideB;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
            "sideA=" + sideA +
            ", sideB=" + sideB +
            '}';
  }
}
