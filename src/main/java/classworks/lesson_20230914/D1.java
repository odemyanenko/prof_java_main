package classworks.lesson_20230914;

import java.util.List;

public class D1 {
  public double calculateAverageValueForGivenList(List<Double> listOfNumbers) {
    double sumOfAllValues = 0;
    for (double currentValue : listOfNumbers) {
      sumOfAllValues += currentValue;
    }
    return sumOfAllValues / listOfNumbers.size();
  }
}

class D1_Impl {
  public double calculateAverageValueForGivenList(List<Double> list) {
    return list.stream()
            .mapToDouble(n -> n)
            .average()
            .orElse(0);
  }
}
