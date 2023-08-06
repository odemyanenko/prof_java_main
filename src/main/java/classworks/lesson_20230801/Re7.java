package classworks.lesson_20230801;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re7 {
  public static void main(String[] args) {
    String cardNumber = "1321354354634645634564563464";
    String regex = "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(cardNumber);

    String newCardNumber = matcher.replaceAll("CARD NUMBER:[$1 $2 $3 $4] EXP:[$5/$6] CVV:[$7]");
    System.out.println(newCardNumber);
  }
}
