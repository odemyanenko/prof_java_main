package homeworks.hw5_20230524.generics;

/*
Напишите метод sortByProperty, который принимает список объектов и
имя поля, по которому нужно сортировать список. Используйте Generics
для обеспечения возможности передачи в метод списка объектов любого
типа и получения значения поля по имени.
*/

import java.lang.reflect.Field;
import java.util.*;

public class Task10 {
  public static void main(String[] args) {
    List<Person> list = new ArrayList<>();

    list.add(new Person("Petro", "Ivanov", 54));
    list.add(new Person("Olga", "Petrova", 24));
    list.add(new Person("Anna", "Sydorenko", 34));
    list.add(new Person("Oleg", "Komarov", 43));

    System.out.println("Original list: " + list);
    sortByProperty(list, "age");
    System.out.println("Sorted list by age: " + list);
    sortByProperty(list, "firstName");
    System.out.println("Sorted list by firstName: " + list);
  }

  public static <E> void sortByProperty(List<E> list, String propertyName) {
    list.sort(Comparator.comparing(obj -> {
      try {
        Field field = obj.getClass().getDeclaredField(propertyName);
        field.setAccessible(true);
        return (Comparable) field.get(obj);
      } catch (Exception e) {
        throw new IllegalArgumentException("Failed to access property: " + propertyName, e);
      }
    }));
  }
}

class Person {
  private String firstName;
  private String lastName;
  private Integer age;

  public Person(String firstName, String lastName, Integer age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Integer getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Person{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            '}';
  }
}
