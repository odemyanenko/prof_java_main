package homeworks.extra_hw2_collections.task_6;

import java.util.Optional;

public class BooksCore {
  public void run() {
    BookDatabaseImpl books = new BookDatabaseImpl();

    books.save(new Book("Raoul-Gabriel Urma", "Java 8 in Action"));
    books.save(new Book("Kathy Sierra", "Head First Java"));
    books.save(new Book("Cay S. Horstmann", "Core Java 2, Volume I--Fundamentals"));

    System.out.println("Created books:");
    books.printBooks();

    System.out.println("-----------------------------------------");
    System.out.println("Delete book with id = 2: " + books.delete(2L));
    System.out.println("Delete book with id = 11: " + books.delete(11L));
    System.out.println("Books after delete with id = 2:");
    books.printBooks();

    System.out.println("-----------------------------------------");
    Optional<Book> book3 = books.findById(3L);
    book3.ifPresent(book -> System.out.println("Delete book with id = 3: " + books.delete(book)));
    Optional<Book> book11 = books.findById(11L);
    book11.ifPresent(book -> System.out.println("Delete book with id = 11: " + books.delete(book)));
    System.out.println("-----------------------------------------");
    System.out.println("Books after delete with id = 3:");
    System.out.println("-----------------------------------------");
    books.printBooks();
  }
}
