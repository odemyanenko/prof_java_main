package homeworks.hw8_20230703.task2;

import java.lang.reflect.Method;

//Попробуйте создать свою сообственную аннотацию.

public class MyAnnotationDemo {
  public static void main(String[] args) throws NoSuchMethodException {
    MyClass myObject = new MyClass();
    Class<? extends MyClass> objectClass = myObject.getClass();
    Method myMethod = objectClass.getMethod("myMethod");
    MyAnnotation myAnnotation = myMethod.getAnnotation(MyAnnotation.class);

    String defaultValue = myAnnotation.defaultValue();
    System.out.println(defaultValue);
  }
}
