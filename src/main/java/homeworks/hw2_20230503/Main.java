package homeworks.hw2_20230503;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {

    List<Book> books = new ArrayList<>();
    books.add(new Book("New", 33.5));
    books.add(new Book("City", 14));
    books.add(new Book("Window", 13));
    books.add(new Book("Phone", 43));

    List<Integer> randList = new Random()
            .ints(20, 1, 11)
            .boxed().toList();
    ;

    //Найдите среднюю длину слов в списке строк, используя Java Stream API.
    task1();

    //Используя Java Stream API, отсортируйте список объектов по одному из их полей в обратном порядке.
    task2(books);

    //Найдите количество уникальных элементов в списке, используя Java Stream API.
    task3();

    //Переведите список строк в список чисел, содержащих длины этих строк, с использованием Java Stream API.
    task4();

    //Используя Java Stream API, найдите сумму всех чисел в списке, удовлетворяющих определенному условию.
    task5();

    //Отфильтруйте список объектов, исключив из него все объекты, не соответствующие определенному критерию, с использованием Java Stream API.
    task6(books);

    //-------------------------------------------------------
    //Сгруппируйте список объектов по определенному полю, используя Java Stream API, и выполните определенную операцию на каждой группе.
    task7();///////////

    //Используя Java Stream API, найдите максимальное и минимальное значение в списке чисел одновременно.
    task8(randList);

    //Отобразите список объектов на новый список, применив к каждому объекту определенное преобразование, с использованием Java Stream API.
    task9();

    //Отобразите список объектов на новый список, применив к каждому объекту определенное преобразование, с использованием Java Stream API.
    task10();

    //Используя Java Stream API, выполните операцию "свертки" (reduce) на списке чисел, чтобы найти сумму, произведение или другую агрегатную функцию.
    task11();

    //Реализуйте алгоритм поиска всех уникальных элементов в двух массивах и их объединение в новый массив с использованием Java Stream API.
    task12();
  }

  private static void task12() {
    System.out.println("Task12. Реализуйте алгоритм поиска всех уникальных элементов в двух массивах и их объединение в новый массив с использованием Java Stream API.");
  }

  private static void task11() {
    System.out.println("Task11. Используя Java Stream API, выполните операцию \"свертки\" (reduce) на списке чисел, чтобы найти сумму, произведение или другую агрегатную функцию.");
  }

  private static void task10() {
    System.out.println("Отобразите список объектов на новый список, применив к каждому объекту определенное преобразование, с использованием Java Stream API.");
  }

  private static void task9() {
    System.out.println("Task9. Отобразите список объектов на новый список, применив к каждому объекту определенное преобразование, с использованием Java Stream API.");
  }

  private static void task8( List<Integer> list) {
    System.out.println("Task8. Используя Java Stream API, найдите максимальное и минимальное значение в списке чисел одновременно.");
    System.out.println(list);
    Stream<Integer> sorted = list.stream()
            .sorted();

  }

  private static void task7() {
    System.out.println("Task7. Сгруппируйте список объектов по определенному полю, используя Java Stream API, и выполните определенную операцию на каждой группе.");
  }

  private static void task6(List<Book> books) {
    System.out.println("Task6. Отфильтруйте список объектов, исключив из него все объекты, не соответствующие определенному критерию, с использованием Java Stream API.");
    System.out.println(books);
    List<Book> booksFiltered = books.stream()
            .filter(b -> b.getPrice() < 15)
            .toList();
    System.out.println(booksFiltered);
  }

  private static void task5() {
    System.out.println("Task5. Используя Java Stream API, найдите сумму всех чисел в списке, удовлетворяющих определенному условию.");
    List<Integer> randList = new Random()
            .ints(20, 1, 11)
            .boxed().collect(Collectors.toList());
    ;
    System.out.println(randList);
    Integer sum = randList.stream()
            .filter(e -> e < 3)
            .reduce(0, Integer::sum);
    System.out.println(sum);
  }

  private static void task4() {
    List<String> list = Arrays.asList("Phone", "Note", "Music");
    System.out.println("Переведите список строк в список чисел, содержащих длины этих строк, с использованием Java Stream API.");
    System.out.println(list);
    List<Integer> listLength = list.stream()
            .map(String::length)
            .toList();
    System.out.println(listLength);
  }

  private static void task3() {
    System.out.println("Task3. Найдите количество уникальных элементов в списке, используя Java Stream API.");
    List<Integer> randList = new Random()
            .ints(20, 1, 11)
            .boxed().collect(Collectors.toList());
    ;
    System.out.println(randList);
    List<Integer> listUniq = randList.stream()
            .distinct()
            .sorted()
            .toList();
    System.out.println(listUniq);
  }

  private static void task2(List<Book> bookList) {
    System.out.println("Task2. Используя Java Stream API, отсортируйте список объектов по одному из их полей в обратном порядке.");
    System.out.println("Normal List:");
    System.out.println(bookList);
    List<Book> sortedBooks = bookList.stream()
            .sorted((o1, o2) -> (-1) * Double.compare(o1.getPrice(), o2.getPrice()))
            .toList();
    System.out.println("Sorted List:");
    System.out.println(sortedBooks);
  }

  private static void task1() {
    List<String> list = Arrays.asList("Phone", "Note", "Music");
    System.out.println("Task1. Найдите среднюю длину слов в списке строк, используя Java Stream API.");
    double average = list.stream()
            .mapToInt(String::length)
            .average()
            .orElse(0);
    System.out.println(average);
  }
}

class Book {
  private String title;
  private double price;

  public String getTitle() {
    return title;
  }

  public Book(String name, double price) {
    this.title = name;
    this.price = price;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book{" +
            "title='" + title + '\'' +
            ", price=" + price +
            '}';
  }
}