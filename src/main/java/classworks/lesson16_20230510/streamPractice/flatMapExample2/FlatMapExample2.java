package classworks.lesson16_20230510.streamPractice.flatMapExample2;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapExample2 {
  public static void main(String[] args) {
    List<Human> humans = Arrays.asList(
            new Human("Ruslan", Arrays.asList("+25473473457", "+467347432","+452724572457")),
            new Human("Victor", Arrays.asList("+5638647", "+2362356","+245624572")),
            new Human("Olga", Arrays.asList("+11111", "+25672457","+25474574")),
            new Human("Petr", Arrays.asList("+3565474357", "+11111","+2457246245")),
            new Human("Sem", Arrays.asList("+11111", "+43563456","+24572457425"))
    );



    Map<String,List<String>> phonesNumbersMap = humans.stream()
            .flatMap(human -> human.getPhones().stream().map (phone ->  new AbstractMap.SimpleEntry<>(phone, human.getName())))
            .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())));


    System.out.println(phonesNumbersMap);




    Map<String, List<String>> phoneToNamesMap = new HashMap<>();

    humans.forEach(human -> human.getPhones().forEach(phone -> {
      List<String> names = phoneToNamesMap.computeIfAbsent(phone, k -> new ArrayList<>());
      names.add(human.getName());
    }));

    System.out.println(phonesNumbersMap);

  }
}