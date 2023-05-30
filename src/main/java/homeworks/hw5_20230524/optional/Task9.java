package homeworks.hw5_20230524.optional;

/*
Напишите метод, который получает HashSet и функцию преобразования,
и возвращает HashSet, в котором все значения преобразованы с помощью
функции преобразования, если HashSet не пустой. Если HashSet пустой,
метод возвращает пустой HashSet.
*/


import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Task9 {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();

    set.add(1);
    set.add(2);
    set.add(3);

    Set<String> transformedSet = transformSet(set, integer -> "(" + integer.toString() + ")");
    System.out.println("Original set: " + set);
    System.out.println("Transformed set: " + transformedSet);

    System.out.println("----------------------------------------------");

    Set<Integer> emptySet = new HashSet<>();
    Set<String> transformedEmptySet = transformSet(emptySet, Object::toString);
    System.out.println("Original set: " + emptySet);
    System.out.println("Transformed empty set: " + transformedEmptySet);
  }

  public static <E, R> Set<R> transformSet(Set<E> set, Function<E, R> function) {
    Set<R> transformedSet = new HashSet<>();
    for (E item : set) {
      R transformedItem = function.apply(item);
      transformedSet.add(transformedItem);
    }
    return transformedSet;
  }
}
