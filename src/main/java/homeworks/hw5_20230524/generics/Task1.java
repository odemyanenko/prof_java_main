package homeworks.hw5_20230524.generics;

/*
Создайте класс Box для хранения любых объектов и реализуйте методы
get() и put() для чтения и записи объектов в коробку.
Используйте Generics для обеспечения типобезопасности.
*/

import java.util.ArrayList;
import java.util.List;

public class Task1 {
  public static void main(String[] args) {
    Box<Integer> boxInteger = new Box<>("Box with Integer");
    Box<String> boxString = new Box<>("Box with Strings");

    boxInteger.put(10);
    boxInteger.put(11);
    boxInteger.put(12);
    boxInteger.put(13);
    boxInteger.put(14);

    boxString.put("One");
    boxString.put("Two");
    boxString.put("Three");
    boxString.put("Four");
    boxString.put("Five");

    System.out.println("Info: " + boxInteger.toString());
    System.out.println("Element with index = 2 : " + boxInteger.get(2));
    System.out.println("Info: " + boxString.toString());
    System.out.println("Element with index = 2 : " + boxString.get(2));
  }
}

