package classworks.lesson_20230815.task.exceptions;

public class OrderIsNullException extends RuntimeException{
  public OrderIsNullException(String message) {
    super(message);
  }
}
