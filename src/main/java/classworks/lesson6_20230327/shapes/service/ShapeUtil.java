package classworks.lesson6_20230327.shapes.service;

import classworks.lesson6_20230327.shapes.entity.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeUtil {
  private Shape createRandomShape(int range) {
    CreateShape createShape = new CreateShape();
    Random random = new Random();

    int randomChoice = random.nextInt(4);
    if (randomChoice == 0) {
      return createShape.createCircle(random.nextInt(range) + 1);
    } else if (randomChoice == 1) {
      return createShape.createRectangle(random.nextInt(range) + 1, random.nextInt(range) + 1);
    } else if (randomChoice == 2) {
      return createShape.createSquare(random.nextInt(range) + 1);
    } else {
      return createShape.createTriangle(random.nextInt(range) + 1);
    }
  }

  public List<Shape> createRandomShapeList(int numberOfShapes, int range) {
    List<Shape> randomShapeList = new ArrayList<>();
    for (int i = 0; i < numberOfShapes; i++) {
      randomShapeList.add(createRandomShape(range));
    }
    return randomShapeList;
  }

  public double calculateTotalShapesArea(List<Shape> shapes) {
    double allShapesArea = 0;
    for (Shape shape : shapes
    ) {
      allShapesArea = allShapesArea + shape.calculateArea();
    }
    return allShapesArea;
  }

  public double calculateTotalShapesPerimetr(List<Shape> shapes) {
    double allShapesArea = 0;
    for (Shape shape : shapes
    ) {
      allShapesArea = allShapesArea + shape.calculatePerimetr();
    }
    return allShapesArea;
  }
}
