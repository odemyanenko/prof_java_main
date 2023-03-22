package lesson5_20230322.linkedlist.entity;

public class Book {
  private int bookId;
  private Author author;
  private String nameOfBook;

  public Book(int bookId, Author author, String name) {
    this.bookId = bookId;
    this.author = author;
    this.nameOfBook = name;
  }

  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public String getNameOfBook() {
    return nameOfBook;
  }

  public void setNameOfBook(String nameOfBook) {
    this.nameOfBook = nameOfBook;
  }

  @Override
  public String toString() {
    return "Book{" +
            "bookId=" + bookId +
            ", author=" + author +
            ", name='" + nameOfBook + '\'' +
            '}';
  }
}
