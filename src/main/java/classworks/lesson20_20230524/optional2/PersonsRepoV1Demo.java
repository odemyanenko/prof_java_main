package classworks.lesson20_20230524.optional2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonsRepoV1Demo {
  public static void main(String[] args) {
    Map<Long, Person> ourDB = new HashMap<>();

    PersonRepoV1 personRepoV1 = new PersonRepoV1(ourDB);

    personRepoV1.addPerson(1, new Person("John", "12345"));
    personRepoV1.addPerson(2, new Person(null, ""));

    printPersonFromDatabase(1,personRepoV1);
    printPersonFromDatabase(2,personRepoV1);
    printPersonFromDatabase(3,personRepoV1);

  }

  public static void printPersonFromDatabase(long id, PersonRepoV1 personRepoV1){
    Optional<Person> optPerson = personRepoV1.findById(id);

    if (optPerson.isPresent()) {
      Person person = optPerson.get();
      String personName = person.getName();
      if (personName != null) {
        System.out.println("Имя пользователя: " + person.getName());
        System.out.println("Длина имени: " + person.getName().length());
      } else {
        System.out.println("Please make validation database! Field is null!");
      }
    } else {
      System.out.println("User not found!");
    }

  }
}
