package classworks.lesson21_20230531.junit.test2Example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverse {
    public String transformString(String text){
      return Arrays.stream(text.split(" "))
              .map(word -> new StringBuilder(word).reverse().toString())
              .collect(Collectors.joining(" "));
    }
}
