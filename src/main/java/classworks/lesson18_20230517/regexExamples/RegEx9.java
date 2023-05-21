package classworks.lesson18_20230517.regexExamples;

public class RegEx9 {
  public static void main(String[] args) {
    RegExMainMethod regExMain = new RegExMainMethod();

    String inputString = "java Java JAVA j.a.v.a JaaaVa JavaSE";

    String regEx = "[jJ]\\.?[aA]\\.?[vV]\\.?[aA](SE)?";

    regExMain.regExmyMethod(inputString, regEx);
  }
}
