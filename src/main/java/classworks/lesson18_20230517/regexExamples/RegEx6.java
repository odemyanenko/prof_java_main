package classworks.lesson18_20230517.regexExamples;

public class RegEx6 {
  public static void main(String[] args) {
    RegExMainMethod regExMain = new RegExMainMethod();

    String inputString = "mycat ourcat23 yourcat23_super theycattti5_5e cat7.6 cat333";

    String regEx = "(\\w*)cat\\S*";

    regExMain.regExmyMethod(inputString, regEx);
  }
}
