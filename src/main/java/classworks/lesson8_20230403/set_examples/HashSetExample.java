package classworks.lesson8_20230403.set_examples;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
  public static void main(String[] args) {
    PersonSet person1 = new PersonSet("Vasya", 34);
    PersonSet person2 = new PersonSet("Vasya", 30);
    PersonSet person3 = new PersonSet("Ivan", 13);

    System.out.println(person1.hashCode());
    System.out.println(person2.hashCode());
    System.out.println(person3.hashCode());


    System.out.println("----------------");
    Set<PersonSet> myTableSet = new HashSet<>();

    myTableSet.add(person1);
    myTableSet.add(person2);
    myTableSet.add(person3);

    System.out.println(myTableSet);

  }
}
