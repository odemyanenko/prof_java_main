package classworks.lesson5_20230322.linkedlist.core;

import classworks.lesson5_20230322.linkedlist.entity.Author;
import classworks.lesson5_20230322.linkedlist.entity.Book;
import classworks.lesson5_20230322.linkedlist.service.InputData;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class LibraryUtil {
  public List<Book> createLibrary() {
    return new LinkedList<>();
  }

  public void fillLibrary(List<Book> ourLibrary, int numberOfElementsAdd, InputData inputData, boolean isHead) {
    for (int i = 0; i < numberOfElementsAdd; i++) {
      Book book = inputData.inputNewBook();
      addElementIntoLibrary(ourLibrary, book, isHead);
    }
  }

  private void addElementIntoLibrary(List<Book> ourLibrary, Book newBook, boolean isHead) {
    if (isHead) {
      ourLibrary.add(0, newBook);
    } else {
      ourLibrary.add(newBook);
    }
  }

  public Book searchBook(List<Book> ourLibrary, String searchCriteria) {
    Book bookAfterSearch = new Book(0, new Author(0, ""), "");
    for (int i = 0; i < ourLibrary.size(); i++) {
      if (Objects.equals(ourLibrary.get(i).getNameOfBook(), searchCriteria)){
        bookAfterSearch = ourLibrary.get(i);
      }
    }
    return bookAfterSearch;
  }

  public void deleteBook(List<Book> ourLibrary, Book bookForDelete) {
    ourLibrary.remove(bookForDelete);
  }

  public List<Book> createDuplicateLibrary(List<Book> ourLibrary) {
    return null;
  }

  public void sortOurLibrary(List<Book> ourLibrary, boolean isGrow) {
  }
}
