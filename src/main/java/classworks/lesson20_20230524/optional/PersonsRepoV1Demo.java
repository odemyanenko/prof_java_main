package classworks.lesson20_20230524.optional;

import java.util.HashMap;
import java.util.Map;

public class PersonsRepoV1Demo {
  public static void main(String[] args) {
    Map<Long, Person> ourDB = new HashMap<>();

    PersonRepoV1 personRepoV1 = new PersonRepoV1(ourDB);

    personRepoV1.addPerson(1, new Person("John", "12345"));
    personRepoV1.addPerson(2, new Person(null, ""));

    Person person1 = personRepoV1.findById(1L);

    System.out.println("Имя пользователя: " + person1.getName());
    System.out.println("Длина имени: " + person1.getName().length());

    Person person2 = personRepoV1.findById(3L);

    if (person2 != null) {

      System.out.println("Имя пользователя: " + person2.getName());
      System.out.println("Длина имени: " + person2.getName().length());
    } else {
      System.out.println("User not found in database");
    }

    Person person3 = personRepoV1.findById(2L);

    if (person3 != null) {

      System.out.println("Имя пользователя: " + person3.getName());
      System.out.println("Длина имени: " + person3.getName().length());
    } else {
      System.out.println("User not found in database");
    }
  }
}