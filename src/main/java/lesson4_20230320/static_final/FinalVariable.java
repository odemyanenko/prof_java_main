package lesson4_20230320.static_final;

public class FinalVariable {
  public final static String somestring= "somestring";
  public static void print(final double data){
    final String str;
    str = "someString";

    System.out.println(str);
    System.out.println(data);
    System.out.println(somestring);
  }

  public static void main(String[] args) {
    print(3);
  }
}
