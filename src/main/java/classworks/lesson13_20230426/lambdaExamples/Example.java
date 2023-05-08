package classworks.lesson13_20230426.lambdaExamples;

public class Example {
  public static void main(String[] args) {
    IStringConvert stringConvert = (inputText -> inputText.toUpperCase());
    IStringConvert stringConvert2 = (inputText -> inputText.toLowerCase());

    String myText = "Hello, World!";

    System.out.println(stringConvert.convertText(myText));
    System.out.println(stringConvert2.convertText(myText));
  }
}
