package homeworks.hw5_20230524.generics;

/*
Создайте класс Optional для представления значения, которое может
отсутствовать. Реализуйте методы isPresent(), get() и orElse().
Используйте Generics для возможности хранения в Optional объектов
разных типов.
*/


public class Task7 {
  public static void main(String[] args) {
    Optional<String> stringOptional = new Optional<>("I love Java!");

    System.out.println("Is present: " + stringOptional.isPresent());
    System.out.println("Value: " + stringOptional.get());
    System.out.println("Value or else: " + stringOptional.orElse("Empty"));

    System.out.println("-----------------------------------------");

    Optional<Integer> integerOptional = new Optional<>(234);

    System.out.println("Is present: " + integerOptional.isPresent());
    System.out.println("Value: " + integerOptional.get());
    System.out.println("Value or else: " + integerOptional.orElse(-1));
  }
}


