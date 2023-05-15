package classworks.lesson16_20230510.streamPractice.sortRevers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortRevers {
  public static void main(String[] args) {
    // создадим список объектов

    List<Person> persons = new ArrayList<>();

    persons.add(new Person("Alice", 30));
    persons.add(new Person("Bob", 25));
    persons.add(new Person("John", 40));
    persons.add(new Person("Charlie", 35));
    persons.add(new Person("Dave", 18));

    // Сортируем список по полю age в обратном порядке

    List<Person> sortedPersons = persons.stream()
            .sorted(Comparator.comparingInt(Person::getAge).reversed())
            .toList();

    System.out.println(sortedPersons);
  }
}