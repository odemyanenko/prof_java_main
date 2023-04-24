package classworks.lesson10_20230417.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonRepositoryDemo {
  public static void main(String[] args) {
    Map<Integer, Person> repository = new HashMap<>();

    Person person1 = new Person("John");
    Person person2 = new Person(null);

    repository.put(1, person1);
    repository.put(2, person2);

    Set<Integer> allKeys = repository.keySet();
    for (int i: allKeys
         ) {
      System.out.println(repository.get(i));

      int personNameLength = repository.get(i).getName().length();
      System.out.println("len:" + personNameLength);
    }
  }
}
