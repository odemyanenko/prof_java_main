package classworks.lesson_20230905;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefEx4 {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Class managerClass = Class.forName(Manager.class.getName());

    Constructor<Manager> constructor = managerClass.getConstructor();
    Manager objMan = constructor.newInstance();

    Method method = managerClass.getMethod("setSalary", double.class);
    method.invoke(objMan, 800.00);
    System.out.println(objMan.getSalary());
  }
}
