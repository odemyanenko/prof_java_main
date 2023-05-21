package classworks.lesson18_20230517.regexExamples;

public class RegEx10 {
  public static void main(String[] args) {
    RegExMainMethod regExMain = new RegExMainMethod();

    String inputString = "A(a,b,c)(x,y,z)Z 1 2 3 4 5";

    String regEx = "[^\\s\\d]+";

    regExMain.regExmyMethod(inputString, regEx);
  }
}
