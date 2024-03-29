package classworks.lesson_20230914;

import java.util.List;

public class DAta {
  public double calculateAverage(List<Double> numbers) {
    double sum = 0;
    for (double num : numbers) {
      sum += num;
    }

    double average = sum / numbers.size();

    double variance = 0;
    for (double num : numbers) {
      variance += Math.pow(num - average, 2);
    }
    double standardDeviation = Math.sqrt(variance / numbers.size());

    return standardDeviation;
  }
}

class DAta_Impl {
  public double calculateAverage(List<Double> numbers) {
    double average = numbers.stream()
            .mapToDouble(n -> n)
            .average().orElse(0);;

    double variance = numbers.stream()
            .mapToDouble(n-> Math.pow(n - average, 2)).sum();

    return Math.sqrt(variance / numbers.size());
  }
}
