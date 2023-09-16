package classworks.lesson_20230905;

import java.lang.reflect.Field;

public class RefEx1 {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
//    Class managerClass = Class.forName("classworks.lesson_20230905.Manager");
    Class managerClass = Class.forName(Manager.class.getName());
    Field field = managerClass.getField("id");
    System.out.println("Field: " + field.getType());
    System.out.println("------------------------------");

    Field[] fields = managerClass.getFields();
    for (Field f : fields) {
      System.out.println("Field name: " + f.getName() + " | Field type: " + f.getType());
    }
    System.out.println("------------------------------");

    Field[] fieldsWithPrivate = managerClass.getDeclaredFields();
    System.out.println("All fields (include private fields)");
    for (Field f : fieldsWithPrivate) {
      System.out.println("Field name: " + f.getName() + " | Field type: " + f.getType());
    }
    System.out.println("------------------------------");
  }
}
