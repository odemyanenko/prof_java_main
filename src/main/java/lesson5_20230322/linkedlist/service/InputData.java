package lesson5_20230322.linkedlist.service;

import lesson5_20230322.linkedlist.entity.Author;
import lesson5_20230322.linkedlist.entity.Book;

public class InputData {
  int count = 0;

  public Book inputNewBook() {
    count++;
    String nameOfBook = "Book name " + count;
    Author author = new Author(0, "Author " + count);
    return new Book(count, author, nameOfBook);
  }

  public int inputNumberOfElements() {
    return 10;
  }
  public String inputSearchCriteria(){
    return "Book name 5";
  }
}
