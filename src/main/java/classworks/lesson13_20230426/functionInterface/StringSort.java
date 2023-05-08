package classworks.lesson13_20230426.functionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {
  public static void main(String[] args) {
    List<String> myList = new ArrayList<>();

    myList.add("DDDDDD");
    myList.add("BAD");
    myList.add("SSS");
    myList.add("AWW");
    myList.add("JWEW");
    myList.add("MDFE");

    System.out.println(myList.toString());

    Collections.sort(myList);
    System.out.println(myList.toString());
  }
}
