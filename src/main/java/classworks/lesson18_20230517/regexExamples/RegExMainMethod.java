package classworks.lesson18_20230517.regexExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMainMethod {
  public void regExmyMethod(String inputString, String regEx) {
//    String inputString = "code for learn java regex";
//
//    String regEx = "[a-j]+";

    Pattern pattern = Pattern.compile(regEx);
    Matcher matcher = pattern.matcher(inputString);

    int matchCount = 0;
    while (matcher.find()) {
      matchCount++;
      System.out.println("'" + inputString.substring(matcher.start(), matcher.end()) + "'");
      System.out.println("Start : " + matcher.start());
      System.out.println("End : " + matcher.end());
      System.out.println("Number of match: " + matchCount);
      System.out.println("-----------------------------------------");
    }
  }
}
