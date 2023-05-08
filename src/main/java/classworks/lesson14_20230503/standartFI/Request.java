package classworks.lesson14_20230503.standartFI;

public class Request {
  private String message;
  private int number;

  public Request(String message, int number) {
    this.message = message;
    this.number = number;
  }

  public String getMessage() {
    return message;
  }

  public int getNumber() {
    return number;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return "Request{" +
            "message='" + message + '\'' +
            ", number=" + number +
            '}';
  }
}
