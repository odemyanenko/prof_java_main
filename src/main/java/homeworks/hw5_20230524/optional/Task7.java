package homeworks.hw5_20230524.optional;

/*
Напишите метод, который получает значение типа Double и возвращает
его квадратный корень, если оно не равно null и положительное, или
бросит исключение IllegalArgumentException в противном случае,
используя Optional.
*/

import java.util.Optional;

public class Task7 {
  public static void main(String[] args) {
    System.out.println("SquareRoot 25 = " + getSquareRoot(25));
    System.out.println("SquareRoot null = " + getSquareRoot(null));
  }

  public static double getSquareRoot(Integer num){
    return Optional.ofNullable(num)
            .filter(e -> e > 0)
            .map(Math::sqrt)
            .orElseThrow(IllegalArgumentException::new);
  }
}
