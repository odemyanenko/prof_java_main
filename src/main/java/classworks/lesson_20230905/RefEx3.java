package classworks.lesson_20230905;

import java.lang.reflect.Constructor;

public class RefEx3 {
  public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
    Class managerClass = Class.forName(Manager.class.getName());
    Constructor constructor = managerClass.getConstructor();
    System.out.println("HAS PARAMETERS: " + constructor.getParameterCount());
    System.out.println("--------------------------------------");

    Constructor[] constructors = managerClass.getConstructors();
    for (Constructor c : constructors
         ) {
      System.out.println("NAME: " + c.getName() + " : PARAM COUNT: " + c.getParameterCount() + " : PARAM TYPE: " + c.getParameterTypes());
    }
  }
}
