package classworks.lesson6_20230327.shapes.entity;

public class Circle extends Shape {
  private double radius;

  public Circle(String title, double radius) {
    super(title);
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI*radius*radius;
  }

  @Override
  public String toString() {
    return "Circle{" +
            "radius=" + radius +
            '}';
  }

  @Override
  public double calculatePerimetr() {
    return 2*Math.PI*radius;
  }
}
