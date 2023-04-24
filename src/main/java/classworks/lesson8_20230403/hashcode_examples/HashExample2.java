package classworks.lesson8_20230403.hashcode_examples;

import java.util.HashMap;

public class HashExample2 {
  public static void main(String[] args) {
    Person person1 = new Person("Vasya", 34);
    Person person2 = new Person("Vasya", 30);
    Person person3 = new Person("Ivan", 13);

    System.out.println(person1.hashCode());
    System.out.println(person2.hashCode());
    System.out.println(person3.hashCode());


    System.out.println("----------------");
    HashMap<Person, String> myTable = new HashMap<>();

    myTable.put(person1, "String1");
    myTable.put(person2, "String2");
    myTable.put(person3, "String3");

    System.out.println(myTable);

    for (Person person: myTable.keySet()
         ) {
      System.out.println(person);
    }
  }
}
