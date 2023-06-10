package classworks.lesson21_20230531.lessoncode;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSortDemo {
  public static void main(String[] args) {
    List<Person> personList = new ArrayList<>();

    personList.add(new Person("Ruslan", 23));
    personList.add(new Person("Olga", 13));
    personList.add(new Person("Anna", 35));
    personList.add(new Person("Ivan", 56));

    System.out.println("Original list : " + personList);
    sortByParam(personList, "age");
    System.out.println("Sorted list : " + personList);
  }

  public static <T> void sortByParam(List<T> list, String paramName) {
    Collections.sort(list, new Comparator<T>() {
      @Override
      public int compare(T o1, T o2) {
        try {
          Field field = o1.getClass().getDeclaredField(paramName);
          field.setAccessible(true);
          Comparable type1 = (Comparable) field.get(o1);
          Comparable type2 = (Comparable) field.get(o2);

          return type1.compareTo(type2);
        } catch (NoSuchFieldException e) {
          System.out.println("Incorrect field name!");
        } catch (IllegalAccessException e) {
          System.out.println("Incorrect field to compare!");
        }
        return 0;
      }
    });
  }
}
