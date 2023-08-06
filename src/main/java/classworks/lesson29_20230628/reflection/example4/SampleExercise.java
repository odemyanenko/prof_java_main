package classworks.lesson29_20230628.reflection.example4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class SampleExercise {
    /*
    1) создать новый объект
    2) получить имя конструктора
    3)получить публичные методы класса
    4) создать объект из метода2 и запустить его
    5) создать объект из поля s и заменить его значение на "группа 48m"
    6) создать объект из методов 1 и 3 и их запустить
     */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
      //1
      Sample sample = new Sample();
      Class<? extends Sample> sampleClass = sample.getClass();

      //2
      Constructor<? extends Sample> constructor = sampleClass.getConstructor();
      Method[] sampleClassMethods = sampleClass.getMethods();
      Arrays.stream(sampleClassMethods).forEach(e-> System.out.println(e.getName()));

      //3
      Sample sample1 = constructor.newInstance();
      sample1.method1();

      //4
      Method method2 = sampleClass.getMethod("method2", int.class);
      method2.invoke(sample, 2);

      //5
      Field sampleClassField = sampleClass.getDeclaredField("s");
      sampleClassField.setAccessible(true);
      System.out.println(sample);
      sampleClassField.set(sample, "group_48m");
      System.out.println(sample);

      //6
      Method method1 = sampleClass.getMethod("method1");
      Method method3 = sampleClass.getDeclaredMethod("method3");
      method3.setAccessible(true);
      method1.invoke(sample);
      method3.invoke(sample);
    }
}