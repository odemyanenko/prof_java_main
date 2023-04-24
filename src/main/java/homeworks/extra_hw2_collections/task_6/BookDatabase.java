package homeworks.extra_hw2_collections.task_6;

import java.util.List;
import java.util.Optional;

public interface BookDatabase {
  Long save(Book book);

  boolean delete(Long bookId);
  boolean delete(Book book);
  Optional<Book> findById(Long bookId);
  List<Book> findByAuthor(String author);
}
