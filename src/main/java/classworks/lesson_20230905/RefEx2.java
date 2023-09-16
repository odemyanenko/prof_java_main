package classworks.lesson_20230905;

import java.lang.reflect.Method;
import java.util.Arrays;

public class RefEx2 {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
    Class managerClass = Class.forName(Manager.class.getName());
    Method method = managerClass.getMethod("increaseSalary");
    System.out.println("RETURN TYPE: " + method.getName() + " : " + method.getReturnType());
    System.out.println("--------------------------------------------");

    Method method1 = managerClass.getMethod("setSalary", double.class);
    System.out.println("RETURN TYPE: " + method.getName() + " : " + method.getReturnType());
    System.out.println(Arrays.toString(method1.getParameterTypes()));
    System.out.println("--------------------------------------------");

    Method[] methods = managerClass.getMethods();
    for (Method m: methods) {
      System.out.println("METHOD NAME: " + m.getName() + " : RETURN TYPE: " + m.getReturnType() + " : PARAM TYPE: " + m.getParameterTypes());
    }
  }
}
