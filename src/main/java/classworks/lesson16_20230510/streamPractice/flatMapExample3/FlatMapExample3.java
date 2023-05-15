package classworks.lesson16_20230510.streamPractice.flatMapExample3;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapExample3 {
  public static void main(String[] args) {

    List<Person> persons = Arrays.asList(
            new Person("John", Arrays.asList("1", "2", "3", "4")),
            new Person("Henry", Arrays.asList("5", "6", "1")),
            new Person("Mark", Arrays.asList("9", "2", "3")),
            new Person("Lara", Arrays.asList("9", "10", "1", "2", "3")),
            new Person("Jim", Arrays.asList("11", "3", "4", "12")));

    findMaxCommonFriends(persons);


  }

  public static List<Person> findMaxCommonFriends(List<Person> persons) {
    List<Person> maxFriednsList = new ArrayList<>();

    Map<String, Set<String>> mapFriends = new HashMap<>();

    for (Person person : persons) {
      mapFriends.put(person.getName(), new HashSet<>(person.getFriends()));
    }


    System.out.println(mapFriends);

    for (Person person : persons) {
      Set<String> friends = new HashSet<>();

      for (Person anotherPerson : persons) {
        friends.retainAll(mapFriends.get(anotherPerson));
      }

    }
    return maxFriednsList;
  }
}