package classworks.lesson14_20230503.standartFI;

import java.util.function.Function;

public class Example3 {
  public static void main(String[] args) {
    Handler handler = new Handler();
    String result = handler.apply(new Request("sdfsdfsdfsdf", 1));
    System.out.println(result);

    Function<Request, String> funcExample = (s) -> "Message is "+s.getMessage()+", number is "+s.getNumber();
    System.out.println(funcExample.apply(new Request("sdfafdasdfasd", 3)));
  }
}
