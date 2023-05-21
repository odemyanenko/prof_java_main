package classworks.lesson18_20230517.regexExamples;

public class RegEx4 {
  public static void main(String[] args) {
    RegExMainMethod regExMain = new RegExMainMethod();

    String inputString = "привет Антон Александр Алла Андрей";

    String regEx = "А.+а";

    regExMain.regExmyMethod(inputString, regEx);
  }
}
