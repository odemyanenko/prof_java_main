package classworks.lesson5_20230322.linkedlist.service;

import classworks.lesson5_20230322.linkedlist.entity.Author;
import classworks.lesson5_20230322.linkedlist.entity.Book;

public class InputData {
  int count = 0;
  int countOfBook = 0;

  public Book inputNewBook() {
    count++;
    if (count % 2 == 0){
      countOfBook++;
    }
    String nameOfBook = "Book name " + count;
    Author author = new Author(0, "Author " + countOfBook);
    return new Book(count, author, nameOfBook);
  }

  public int inputNumberOfElements() {
    return 10;
  }
  public String inputSearchCriteria(){
    return "Book name 5";
  }
}
