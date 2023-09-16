package classworks.lesson_20230914;

import java.util.List;

public class DataProcessor {
  public void processData(List<Integer> data) {
    int sum = 0;
    for (int num : data) {
      sum += num;
    }
    System.out.println("Sum: " + sum);

    double average = (double) sum / data.size();
    System.out.println("Average: " + average);
  }

  public void processUserData(List<User> users) {
    int totalAge = 0;
    for (User user : users) {
      //totalAge += user.getAge();
    }
    System.out.println("Total Age: " + totalAge);

    double averageAge = (double) totalAge / users.size();
    System.out.println("Average Age: " + averageAge);
  }
}

class DataProcessor_Impl {
  public void printInfoListNumbers(String title, List<Integer> data) {
    int sum = getSumListData(data);
    System.out.println("Sum " + title + " : " + sum);

    double average = (double) sum / data.size();
    System.out.println("Average " + title + " : " + average);
  }

  public void printInfoAboutAgesUsers(List<User_Impl> users) {
    List<Integer> listAges = users.stream()
            .map(User_Impl::getAge).toList();
    printInfoListNumbers("Age", listAges);
  }

  private int getSumListData(List<Integer> list) {
    return list.stream()
            .mapToInt(n -> n)
            .sum();
  }
}
