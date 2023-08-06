package classworks.lesson30_20230703.annotation.annotation1;

public class DeprecatedDemo {

  @Deprecated(since="4.5", forRemoval = true)
  public void testLegacyFunction(){
    System.out.println("This is legacy function");
  }
}