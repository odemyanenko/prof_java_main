package classworks.lesson15_20230508.methodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example4User {
  public static void main(String[] args) {
    List<User> user = new ArrayList<>();

    user.add(new User("John", "Smith"));
    user.add(new User("Fill", "Collins"));
    user.add(new User("Elton", "John"));

    user.sort((user1, user2) -> user1.getSurname().compareTo(user2.getSurname()));
    user.sort(Comparator.comparing(User::getSurname));

    user.forEach(System.out::println);
  }
}