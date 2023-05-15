package classworks.lesson15_20230508.streamPrictice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example4 {
  public static void main(String[] args) {
    two();
  }


  public static void one(){
    int[][] arr = {{1,2,3},{17,13,15},{7,9,23}};

    System.out.println(Arrays.toString(arr));
    System.out.println("=============");

    int[] newArr = Arrays.stream(arr)
            .flatMapToInt(Arrays::stream)
            // преобразование в одномерный поток который мы потом сбрасываем в массив
            .toArray();

    // или мы могли бы получить на выходе коллекцию

    List<Integer> list = Arrays.stream(arr)
            .flatMapToInt(Arrays::stream)
            .boxed() // этот метод нужен для превращения примитивных типов в объект
            .toList();


    System.out.println(Arrays.toString(newArr));

  }


  public static void two(){

    String[][] stringArray = new String[][]{{"a","b"},{"c","d"},{"a","f"}};

    Arrays.stream(stringArray)
            .flatMap(subArray -> Arrays.stream(subArray))
            .filter(x -> !x.equals("a"))
            .forEach(x -> System.out.print(x + ", "));


    // или если мы хотим получить на выходе коллекцию

    System.out.println();

    List<String> stringCollection =
            Stream.of(stringArray)          // создали Stream<String[]>
                    .flatMap(Stream::of)            // преобразовали в Stream<String>
                    .filter(x -> !x.equals("a"))    // отфильтровали "а"
                    .toList();                      // вернули как List

    stringCollection.forEach(System.out::print);

  }
}