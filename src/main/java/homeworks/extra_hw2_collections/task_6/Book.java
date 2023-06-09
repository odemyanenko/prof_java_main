package homeworks.extra_hw2_collections.task_6;

import java.util.Objects;

public class Book {
  private Long id;
  private String title;
  private String author;

  Book(String author, String title) {
    this.author = author;
    this.title = title;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return this.id;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Book book = (Book) o;
    return id.equals(book.id) && title.equals(book.title) && author.equals(book.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, author);
  }

  @Override
  public String toString() {
    return "Book{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            '}';
  }
}
