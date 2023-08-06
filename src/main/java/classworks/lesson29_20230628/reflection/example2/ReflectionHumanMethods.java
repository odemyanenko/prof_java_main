package classworks.lesson29_20230628.reflection.example2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionHumanMethods {
  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    Human john = new Human("John", "London");

    Method[] methods = Human.class.getDeclaredMethods();

    for (Method method : methods) {
      System.out.println(method);

      if (method.getName().equals("generateSecret")){
        System.out.println("Find private method!");
        method.setAccessible(true);
        int secretCode = (int) method.invoke(john, " Our method is broken");
        System.out.println(secretCode);
      }

    }

  }
}