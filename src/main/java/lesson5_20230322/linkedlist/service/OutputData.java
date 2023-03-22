package lesson5_20230322.linkedlist.service;

import lesson5_20230322.linkedlist.entity.Book;

import java.util.List;

public class OutputData {
  public void printOurLibrary(String message, List<Book> ourLibrary){
    System.out.println(message);
    for (Book book: ourLibrary
         ) {
      System.out.println(book);
    }
  }
}
