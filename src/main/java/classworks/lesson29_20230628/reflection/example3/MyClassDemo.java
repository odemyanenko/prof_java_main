package classworks.lesson29_20230628.reflection.example3;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClassDemo {
  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    MyClass myClass = new MyClass();

    int number = myClass.getNumber();
    String name  = null;

    System.out.println(number + name); //0null

    try {
      Field field = myClass.getClass().getDeclaredField("name");
      field.setAccessible(true);
      name = (String) field.get(myClass);
    } catch (NoSuchFieldException | IllegalAccessException e) {

    }

    System.out.println(number + name); //0default


    Method method = myClass.getClass().getDeclaredMethod("printData");
    method.setAccessible(true);
    method.invoke(myClass);

  }
}