package classworks.lesson15_20230508.streamPrictice;

import java.util.function.Function;

public class Example3 {
  public static void main(String[] args) {


    Function<String, String> function1 = s -> s + " One ";
    Function<String, String> function2 = s -> s + " Two ";
    Function<String, String> function3 = s -> s + " Three ";
    Function<String, String> function4 = s -> s + " Four ";

    System.out.println(
            function1
                    .andThen(function2)
                    .compose(function3)
                    .compose(function4)
                    .apply(" -> Compose ")
    );

    System.out.println(
            function1
                    .andThen(function2)
                    .andThen(function3)
                    .andThen(function4)
                    .apply(" -> And then ")
    );

  }

}