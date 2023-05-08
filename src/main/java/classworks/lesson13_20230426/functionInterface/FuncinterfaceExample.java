package classworks.lesson13_20230426.functionInterface;

public interface FuncinterfaceExample {

  interface Interface1 extends FuncInterface {

  }

  interface Interface2 extends FuncInterface {
    @Override
    public void abstractMethod();
  }

  interface Interface3 extends FuncInterface {
    public default void defMethod() {
      //....
    }
  }

}
