package classworks.lesson_20230810.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;

public class LibraryTest {

  private Library library = new Library();
  private final Book book1 = new Book("Title1", "Author1", 1988);
  private final Book book2 = new Book("Title2", "Author2", 1956);
  private final Book book3 = new Book("Title3", "Author2", 1956);

//  @BeforeAll
//  void SetUp(){
//
//  }

  @Test
  void addBookTest() {
    Book bookMock = Mockito.mock(Book.class);
    library.addBook(bookMock);

    int excepted = 1;

    Assertions.assertEquals(excepted, library.getBooks().size());
  }

  @Test
  void addBookWithExceptionTest() {
    Assertions.assertThrows(NullPointerException.class, () -> library.addBook(null));
  }

  @Test
  void removeBookTest() {
    library.addBook(book1);
    library.removeBook(book1);

    Assertions.assertFalse(library.getBooks().contains(book1));
  }

  @Test
  void searchByAuthorTest() {
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    Assertions.assertEquals(List.of(book1), library.searchByAuthor("Author1"));
    Assertions.assertEquals(List.of(book2, book3), library.searchByAuthor("Author2"));
  }

  @Test
  void searchByTitleTest() {
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    Assertions.assertEquals(List.of(book1), library.searchByTitle("Title1"));
  }

  @Test
  void searchByYearTest() {
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    Assertions.assertEquals(List.of(book1), library.searchByYear(1988));
    Assertions.assertEquals(List.of(book2, book3), library.searchByYear(1956));
  }
}