package classworks.lesson18_20230517.regexExamples;

import java.util.Arrays;

public class RegEx7 {
  public static void main(String[] args) {
    RegExMainMethod regExMain = new RegExMainMethod();

    String inputString = "java, programming  language? the. best% in the World!";

//    String[] words = inputString.split("[%,\\?!,\\.]?\\s+[%,\\?!,\\.]?");
    String[] words = inputString.split("\\w\n");
//    String[] words = inputString.split("[^a-zA-Z0-9]+\n");
    System.out.println(Arrays.toString(words));

//    String regEx = "(\\w*)cat\\S*";
//
//    regExMain.regExmyMethod(inputString, regEx);
  }
}
