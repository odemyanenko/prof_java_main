package homeworks.hw1_20230322;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
2)
Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)? Напишите код программы, который демонстрирует ответ на этот вопрос.
*/

public class DuplicateDemo {
  public static void main(String[] args) {
    List<Person> listArray = new ArrayList<>();
    List<Person> listLinked = new LinkedList<>();

    Person person1 = new Person(1, "Maria", 23);
    Person person2 = new Person(2, "Anon", 25);
    Person person3 = new Person(3, "Kuzma", 35);

    listArray.add(person1);
    listArray.add(person2);
    listArray.add(person3);
    listArray.add(person1);
    listArray.add(person2);

    listLinked.add(person1);
    listLinked.add(person2);
    listLinked.add(person3);
    listLinked.add(person1);
    listLinked.add(person2);

    System.out.println(listArray);
    System.out.println(listLinked);

    person1.setAge(34);
    System.out.println(listArray);
    System.out.println(listLinked);
  }
}
