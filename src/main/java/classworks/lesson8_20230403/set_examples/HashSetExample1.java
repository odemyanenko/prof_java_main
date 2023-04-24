package classworks.lesson8_20230403.set_examples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
  public static void main(String[] args) {
    Set<String> mySet = new HashSet<>();

    mySet.add("A");
    mySet.add("B");
    mySet.add("C");
    mySet.add("A");
    System.out.println(mySet);
  }
}
