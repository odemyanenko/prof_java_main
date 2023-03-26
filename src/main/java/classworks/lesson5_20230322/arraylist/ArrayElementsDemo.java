package classworks.lesson5_20230322.arraylist;

import java.util.ArrayList;

public class ArrayElementsDemo {
  public static void main(String[] args) {
    ArrayList<ArrayElement> arrayElements = new ArrayList<>();
    arrayElements.add(new ArrayElement(25, "John", 54));
    System.out.println(arrayElements);
  }
}
