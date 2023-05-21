package classworks.lesson18_20230517.regexExamples;

public class RegEx5 {
  public static void main(String[] args) {
    RegExMainMethod regExMain = new RegExMainMethod();

    String inputString = "cat cat23 cat23_super cattti5_5e cat7.6";

//    String regEx = "cat\\w*\\.*\\w*";
    String regEx = "cat\\S*";

    regExMain.regExmyMethod(inputString, regEx);
  }
}
