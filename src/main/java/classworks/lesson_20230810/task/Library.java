package classworks.lesson_20230810.task;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
  private List<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  public List<Book> getBooks() {
    return books;
  }

  public void addBook(Book book) {
    if (book == null) {
      throw new NullPointerException();
    }
    books.add(book);
  }

  public void removeBook(Book book) {
    books.remove(book);
  }

  public List<Book> searchByAuthor(String author) {
    return books.stream()
            .filter(e -> e.getAuthor().equals(author))
            .collect(Collectors.toList());
  }

  public List<Book> searchByTitle(String title) {
    return books.stream()
            .filter(e -> e.getTitle().equals(title))
            .collect(Collectors.toList());
  }

  public List<Book> searchByYear(int year) {
    if (year <= 0) {
      throw new IllegalArgumentException();
    }
    return books.stream()
            .filter(e -> e.getYear() == year)
            .collect(Collectors.toList());
  }
}
