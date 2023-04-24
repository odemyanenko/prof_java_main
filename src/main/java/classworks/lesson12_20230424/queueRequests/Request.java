package classworks.lesson12_20230424.queueRequests;

public class Request {
  private int id;
  private String name;

  public Request(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Request{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
