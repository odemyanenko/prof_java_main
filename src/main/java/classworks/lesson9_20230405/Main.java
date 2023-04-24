package classworks.lesson9_20230405;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    //HashMap<Integer, Integer> map = new HashMap<>();
    Set<String> myTeeSet = new TreeSet<>();

    myTeeSet.add("AAA");
    myTeeSet.add("BBB");
    myTeeSet.add("CCC");
    myTeeSet.add("EEE");
    myTeeSet.add("AAA");
    myTeeSet.add("QQQ");
    myTeeSet.add("WWW");
    myTeeSet.add("AAA");
    myTeeSet.add("SSS");

    System.out.println(myTeeSet);

  }
}
