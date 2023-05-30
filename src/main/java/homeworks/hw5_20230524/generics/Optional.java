package homeworks.hw5_20230524.generics;

public class Optional<T> {
  private final T value;

  public Optional(T value) {
    this.value = value;
  }

  public boolean isPresent(){
    return value != null;
  }

  public T get(){
    return value;
  }

  public T orElse(T defaultValue){
    return value != null ? value : defaultValue;
  }
}
