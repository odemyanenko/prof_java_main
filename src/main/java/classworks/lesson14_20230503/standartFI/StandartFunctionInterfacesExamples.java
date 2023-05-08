package classworks.lesson14_20230503.standartFI;

import java.util.Scanner;
import java.util.function.*;

public class StandartFunctionInterfacesExamples {
  public static void main(String[] args) {
    Predicate<Integer> isPositive = x -> x > 0;

    Predicate<Integer> isPositiveFullText = new Predicate<Integer>() {
      @Override
      public boolean test(Integer integer) {
        return integer > 0;
      }
    };

//    --------------------------------------------
    Consumer<Integer> printer = x -> System.out.println("print from consumer: " + x);
    printer.accept(234);

    Consumer<Integer> printerFullText = new Consumer<Integer>() {
      @Override
      public void accept(Integer integer) {
        System.out.println("print from fullconsumer: " + integer);
      }
    };
    printerFullText.accept(234);

//    --------------------------------------------
    Function<Integer, String> convert = x -> String.valueOf(x + "$");
    System.out.println(convert.apply(34));

//    --------------------------------------------
    Supplier<User> userFactory = () -> {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter user name: ");
      String name = scanner.nextLine();
      return new User(name);
    };

    User user1 = userFactory.get();
    User user2 = userFactory.get();

    System.out.println(user1);
    System.out.println(user2);

//    --------------------------------------------
    UnaryOperator<Integer> square = x -> x * x;
    System.out.println(square.apply(34));

//    --------------------------------------------
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    System.out.println(multiply.apply(2, 4));

  }
}
