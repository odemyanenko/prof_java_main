package classworks.lesson_20230801;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re2 {
  public static void main(String[] args) {
//    String s = "ABCD ABCD ABCDJKJLKJLLJLKLKLJK";
    String s = "KJLALTJLLKA3TJKGGFAST";
//    Pattern pattern = Pattern.compile("ABCD");
//    Pattern pattern = Pattern.compile("[ABCD]");
//    Pattern pattern = Pattern.compile("A[^0-9A-Z]T");
//    Pattern pattern = Pattern.compile("A(G|S)T");
//    Pattern pattern = Pattern.compile("A[0-9A-Z]T.");
    Pattern pattern = Pattern.compile("^AGT");
    Matcher matcher = pattern.matcher(s);
    while (matcher.find()){
//      System.out.println(matcher.group());
      System.out.println("Pos: " + matcher.start() + " : " + matcher.group());
    }
  }
}
