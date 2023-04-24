package classworks.lesson6_20230327.shapes.core;

import classworks.lesson6_20230327.shapes.entity.Shape;
import classworks.lesson6_20230327.shapes.service.ShapeUtil;

import java.util.List;

public class ShapeCore {
  public void run() {
    ShapeUtil shapeUtil = new ShapeUtil();
    List<Shape> randomShapeList = shapeUtil.createRandomShapeList(10, 50);

    for (int i = 0; i < randomShapeList.size(); i++) {
      System.out.print("Our shape: ");
      System.out.println(randomShapeList.get(i));
      System.out.print("Shape area: ");
      System.out.println(randomShapeList.get(i).calculateArea());
      System.out.print("Shape perimeter: ");
      System.out.println(randomShapeList.get(i).calculatePerimetr());
      System.out.println("-----------------------------------------");
    }
    System.out.println("Our shapes areas : " + shapeUtil.calculateTotalShapesArea(randomShapeList));
    System.out.println("Our shapes perimeter : " + shapeUtil.calculateTotalShapesPerimetr(randomShapeList));
  }
}
