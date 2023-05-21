package classworks.lesson18_20230517.regexExamples;

import java.util.Arrays;

public class RegEx8 {
  public static void main(String[] args) {
    RegExMainMethod regExMain = new RegExMainMethod();

    String inputString = "sdgv'sgv name245@gmail.com dffs name@cyprus.com fdaf name@fahho.com";

    String regEx = "\\w+@\\w+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2,3})?";

    regExMain.regExmyMethod(inputString, regEx);
  }
}
