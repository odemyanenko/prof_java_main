package classworks.lesson18_20230517.regexExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx11 {
  public static void main(String[] args) {
        /*
        написать регулярное выражение которое соответствует любому номеру телефона
        представленному в виде:
        1) 7 последовательных цифр
        2) 3 цифры  пробел  4 цифры
        3) 3 цифры пробел или '-' и еще 4 цифры
        4) +(от 1 до 4 цифр кода) "пробел" 3 цифры "пробел" или '-' 4 цифры
        5) + одна цифра "пробел" (от 1 до 3 цифр кода) "пробел" 3 цифры "пробел" или '-' 4 цифры

         */

    String telNumber1 = "1231234";
    String telNumber2 = "123 1234";
    String telNumber3 = "123-1234";
    String telNumber4 = "+(1234) 123-1234";
    String telNumber5 = "+1 (123) 123-1234";


    String regEx = "(\\+(\\d\\s\\(\\d{1,3}\\)|\\(\\d{1,4}\\))\\s)?\\d{3}[-\\s]?\\d{4}";
    //========= "((\\+\\d\\s)?(\\+\\(\\d{1,4}\\)\\s)?)?\\d{3}[-\\s]?\\d{4}"

    Pattern pattern = Pattern.compile(regEx);

    Matcher matcher = pattern.matcher(telNumber1);
    System.out.println(telNumber1 + " is correct? - " + matcher.matches());

    matcher = pattern.matcher(telNumber2);
    System.out.println(telNumber2 + " is correct? - " + matcher.matches());

    matcher = pattern.matcher(telNumber3);
    System.out.println(telNumber3 + " is correct? - " + matcher.matches());

    matcher = pattern.matcher(telNumber4);
    System.out.println(telNumber4 + " is correct? - " + matcher.matches());

    matcher = pattern.matcher(telNumber5);
    System.out.println(telNumber5 + " is correct? - " + matcher.matches());
  }
}
