package classworks.lesson20_20230524.generics;

public interface GarbageHandler<T, S> {
  void handle(T what, S how);

//  <E> void transfer(E dangerousWaste);
}
