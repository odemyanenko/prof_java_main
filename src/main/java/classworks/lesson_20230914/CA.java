package classworks.lesson_20230914;

public class CA {
  public double calculateArea(int shapeType, double... params) {
    if (shapeType == 1) { // 1 - круг
      double radius = params[0];
      return Math.PI * radius * radius;
    } else if (shapeType == 2) { // 2 - квадрат
      double side = params[0];
      return side * side;
    } else if (shapeType == 3) { // 3 - треугольник
      double a = params[0];
      double b = params[1];
      double c = params[2];
      double s = (a + b + c) / 2;
      return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    return 0.0;
  }
}

class CA_Impl {
  public double calculateArea(ShapeType shapeType, double... params) {
    switch (shapeType) {
      case CIRCLE -> {
        return calculateCircle(params[0]);
      }
      case SQUARE -> {
        return calculateSquare(params[0]);
      }
      case TRIANGLE -> {
        return calculateTriangle(params[0], params[1], params[2]);
      }
      default -> {
        return 0.00;
      }
    }
  }

  public double calculateCircle(double radius) {
    return Math.PI * radius * radius;
  }

  public double calculateSquare(double side) {
    return side * side;
  }

  public double calculateTriangle(double a, double b, double c) {
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }
}

enum ShapeType{
  CIRCLE,
  SQUARE,
  TRIANGLE
}