package homeworks.hw_20230801.task1;

//Вам дан текстовый файл, содержащий список email-адресов.
//        Извлечь все уникальные домены электронной почты и подсчитать,
//        сколько раз каждый домен встречается в списке.
//        john.doe@example.com
//jane.smith@example.org
//james.bond@example.com
//jane.smith@example.org
//jane.smith@example.net

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<String> emailList = getEmailFromFile("src/main/java/homeworks/hw_20230801/task1/emails.txt");
    emailList.forEach(System.out::println);

    System.out.println("--------------------------");
    Set<String> emailSet = getUniqueEmails(emailList);
    emailSet.forEach(System.out::println);

    System.out.println("--------------------------");
    Map<String, Long> emailCount = getEmailCount(emailList);
    emailCount.entrySet().forEach(System.out::println);
  }

  public static List<String> getEmailFromFile(String filePath) {
    String regex = "^([a-z]+[.]*)+@([a-z]+).(org|com|net)$";
    List<String> list = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String strLine;
      while ((strLine = reader.readLine()) != null) {
        if (Pattern.matches(regex, strLine)) {
          list.add(strLine);
        }
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return list;
  }

  public static Set<String> getUniqueEmails(List<String> emailList) {
    return new HashSet<>(emailList);
  }

  public static Map<String, Long> getEmailCount(List<String> emailList) {
    return emailList.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }

}