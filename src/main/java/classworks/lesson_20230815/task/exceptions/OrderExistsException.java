package classworks.lesson_20230815.task.exceptions;

public class OrderExistsException extends RuntimeException{
  public OrderExistsException(String message) {
    super(message);
  }
}

