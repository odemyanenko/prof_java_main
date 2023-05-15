package classworks.lesson17_20230515.standartInputOutput;

import java.io.IOException;
import java.io.InputStreamReader;

public class Example4 {
  public static void main(String[] args) throws IOException {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);

    System.out.println("Enter character or '0' for exit");
    char symbol;

    do {
      symbol = (char) inputStreamReader.read();
      System.out.println(symbol + ", ");
    } while (symbol != '0');
  }
}
