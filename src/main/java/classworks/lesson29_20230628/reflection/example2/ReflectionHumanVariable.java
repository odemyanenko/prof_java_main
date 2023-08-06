package classworks.lesson29_20230628.reflection.example2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionHumanVariable {
  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    Human john = new Human("John", "London");

    System.out.println(john);

    Field[] fields = Human.class.getDeclaredFields();

    for (Field field : fields) {
      System.out.println(field);

      if (field.getName().equals("name")){
        System.out.println("Privet field 'name' found!");
        field.setAccessible(true);
        field.set(john,"Bill");
      }

    }

    System.out.println(john);

  }
}