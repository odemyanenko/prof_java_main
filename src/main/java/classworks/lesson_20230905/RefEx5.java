package classworks.lesson_20230905;

import java.lang.reflect.Field;

public class RefEx5 {
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    Manager manager = new Manager(1, "Nik", "IT");
    Class managerClass = manager.getClass();
    Field field = managerClass.getDeclaredField("salary");

    field.setAccessible(true);//set access to private field

    double salaryValue = (double) field.get(manager);
    System.out.println("SALARY: " + salaryValue);

    field.set(manager, 777.0);
    System.out.println("SALARY: " + manager);
  }
}
