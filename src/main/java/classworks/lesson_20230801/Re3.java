package classworks.lesson_20230801;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re3 {
  public static void main(String[] args) {
    String s = "ABCD ABCD ABCDJKJLKJLLJ23LKLKLJK";
//    Pattern pattern = Pattern.compile("\\D");
//    Pattern pattern = Pattern.compile("\\W");
//    Pattern pattern = Pattern.compile("\\w+");
    Pattern pattern = Pattern.compile("\\w{3}");

    Matcher matcher = pattern.matcher(s);
    while (matcher.find()){
      System.out.println("Pos: " + matcher.start() + " : " + matcher.group());
    }
  }
}
