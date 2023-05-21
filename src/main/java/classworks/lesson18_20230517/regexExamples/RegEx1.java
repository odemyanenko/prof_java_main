package classworks.lesson18_20230517.regexExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
  public static void main(String[] args) {
    String inputString = "java jana jav2";

    String regEx = "jav";

    Pattern pattern = Pattern.compile(regEx);
    Matcher matcher = pattern.matcher(inputString);

    int matchCount = 0;
    while (matcher.find()){
      matchCount++;
      System.out.println("'" + inputString.substring(matcher.start(), matcher.end()) + "'");
      System.out.println("Start : " + matcher.start());
      System.out.println("End : " + matcher.end());
      System.out.println("Number of match: " + matchCount);
      System.out.println("-----------------------------------------");
    }
  }
}
