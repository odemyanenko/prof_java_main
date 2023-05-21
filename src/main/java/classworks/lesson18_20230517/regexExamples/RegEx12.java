package classworks.lesson18_20230517.regexExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx12 {
  public static void main(String[] args) {
    System.out.println(checkMail("google.com"));
    System.out.println(checkMail("reference.ua"));
    System.out.println(checkMail("reference.ua.com"));
    System.out.println(checkMail("reference2.lv"));
    System.out.println(checkMail("reference2.lv22"));
    System.out.println(checkMail("reference3.org"));
  }

  public static boolean checkMail(String textMail){
    String regEx = "\\w+\\.(com|ua(\\.com)?|lv(\\d{1,2})?)";

    Pattern pattern = Pattern.compile(regEx);
    Matcher matcher = pattern.matcher(textMail);
    return matcher.matches();

  }
}