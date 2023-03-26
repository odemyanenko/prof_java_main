package classworks.lesson4_20230320.enum_example;

public class EnumEx1 {
  public void printRedColor(){
    System.out.println("Red color is " + Color.red);
  }
  public void printBlueColor(){
    System.out.println("Blue color is " + Color.blue);
  }
  public enum Color{
    red,
    blue,
    green
  }
}
