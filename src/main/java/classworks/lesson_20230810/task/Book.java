package classworks.lesson_20230810.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Book {
  private String title;
  private String author;
  private int year;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Book book)) return false;
    return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, author, year);
  }
}
