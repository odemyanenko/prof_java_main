package lesson5_20230322.linkedlist.entity;

public class Author {
  private int AuthorId;
  private String AuthorName;

  public Author(int authorId, String authorName) {
    AuthorId = authorId;
    AuthorName = authorName;
  }

  public int getAuthorId() {
    return AuthorId;
  }

  public void setAuthorId(int authorId) {
    AuthorId = authorId;
  }

  public String getAuthorName() {
    return AuthorName;
  }

  public void setAuthorName(String authorName) {
    AuthorName = authorName;
  }

  @Override
  public String toString() {
    return "Author{" +
            "AuthorId=" + AuthorId +
            ", AuthorName='" + AuthorName + '\'' +
            '}';
  }
}
