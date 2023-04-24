package classworks.lesson6_20230327.shapes.service;

import classworks.lesson6_20230327.shapes.entity.Circle;
import classworks.lesson6_20230327.shapes.entity.Rectangle;
import classworks.lesson6_20230327.shapes.entity.Square;
import classworks.lesson6_20230327.shapes.entity.Triangle;

public class CreateShape {
  public Circle createCircle(double radius){
    return new Circle("Circle", radius);
  }

  public Square createSquare(double side){
    return new Square("Square", side);
  }

  public Rectangle createRectangle(double sideA, double sideB){
    return new Rectangle("Rectangle", sideA, sideB);
  }

  public Triangle createTriangle(double side){
    return new Triangle("Triangle", side);
  }
}
