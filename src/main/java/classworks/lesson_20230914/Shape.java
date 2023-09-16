package classworks.lesson_20230914;

public class Shape {
  public enum Type {CIRCLE, SQUARE}

  private Type type;

  public Shape(Type type) {
    this.type = type;
  }

  public double calculateArea() {
    if (type == Type.CIRCLE) {
    } else if (type == Type.SQUARE) {
    }
    return 0.0;
  }
}

class Shape_Impl {
  public enum Type {CIRCLE, SQUARE}

  private Type type;

  public Shape_Impl(Type type) {
    this.type = type;
  }

  public double calculateArea() {
    switch (type) {
      case CIRCLE -> {
        return 1.00;//calc
      }
      case SQUARE -> {
        return 2.00;//calc
      }
      default -> {
        return 0.00;
      }
    }
  }
}