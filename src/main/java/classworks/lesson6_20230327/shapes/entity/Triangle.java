package classworks.lesson6_20230327.shapes.entity;

public class Triangle extends Shape{
  private double side;

  public Triangle(String title, double side) {
    super(title);
    this.side = side;
  }

  @Override
  public double calculateArea() {
    return side*side*(Math.sqrt(3)/4);
  }

  @Override
  public double calculatePerimetr() {
    return 3*side;
  }

  @Override
  public String toString() {
    return "Triangle{" +
            "side=" + side +
            '}';
  }
}
