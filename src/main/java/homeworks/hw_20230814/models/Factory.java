package homeworks.hw_20230814.models;

public class Factory {
  private int id;
  private String name;
  private boolean isDept;
  private static int idCounter;

  {
    idCounter = 0;
  }

  public Factory(String name) {
    this.name = name;
  }
}
