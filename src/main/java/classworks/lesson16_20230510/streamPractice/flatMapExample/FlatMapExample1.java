package classworks.lesson16_20230510.streamPractice.flatMapExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample1 {
  public static void main(String[] args) {
    List<Human> humans = Arrays.asList(
            new Human("Ruslan", Arrays.asList("+25473473457", "+34673467", "+452724572457")),
            new Human("Victor", Arrays.asList("+5638647", "+2362356", "+245624572")),
            new Human("Olga", Arrays.asList("+34673467", "+25672457", "+25474574")),
            new Human("Petr", Arrays.asList("+3565474357", "+34673467", "+2457246245")),
            new Human("Sem", Arrays.asList("+34673474", "+43563456", "+24572457425"))
    );

    List<String> phonesNumber = new ArrayList<>();

    for (Human human : humans) {
      phonesNumber.addAll(human.getPhones());
    }

    System.out.println(phonesNumber);

    List<String> phonesNumberWithStream = humans.stream()
            .map(human -> human.getPhones())
            .flatMap(phonesCollection -> phonesCollection.stream())
            .collect(Collectors.toList());
  }

}