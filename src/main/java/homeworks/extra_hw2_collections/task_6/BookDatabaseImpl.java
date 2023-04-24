package homeworks.extra_hw2_collections.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {
  List<Book> books = new ArrayList<>();
  Long id = 0L;

  @Override
  public Long save(Book book) {
    book.setId(++id);
    books.add(book);

    return id;
  }

  @Override
  public boolean delete(Long bookId) {
    for (Book book : books) {
      if (book.getId().equals(bookId)) {
        books.remove(book);
        return true;
      }
    }

    return false;
  }

  @Override
  public boolean delete(Book book) {
    if (books.contains(book)) {
      books.remove(book);
      return !books.contains(book);
    }

    return false;
  }

  @Override
  public Optional<Book> findById(Long bookId) {
    for (Book book : books) {
      if (book.getId().equals(bookId)) {
        return Optional.of(book);
      }
    }

    return Optional.empty();
  }

  @Override
  public List<Book> findByAuthor(String author) {
    return null;
  }

  public void printBooks() {
    for (int i = 0; i < books.size(); i++) {
      System.out.println(books.get(i));
    }
  }
}
