package classworks.lesson_20230914;

public class CircleQ {
  private double radius;

  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  public double calculateCircumference() {
    return 2 * Math.PI * radius;
  }
}

class CircleQ_Impl {
  private double radius;

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getCircumference() {
    return 2 * Math.PI * radius;
  }
}