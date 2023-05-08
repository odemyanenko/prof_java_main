package classworks.lesson13_20230426.functionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortSpecialSolution {
  public static void main(String[] args) {
    List<String> myList = new ArrayList<>();

    myList.add("DDDDDD");
    myList.add("BAD");
    myList.add("SSS");
    myList.add("AWW");
    myList.add("JWEW");
    myList.add("MDFE");

    System.out.println(myList.toString());
// 1)--------------------------------------------------------------------
//    StringLengthComparator myComparator = new StringLengthComparator();
//    Collections.sort(myList, myComparator);

// 2)--------------------------------------------------------------------
//    Collections.sort(myList, new StringLengthComparator());

// 3)--------------------------------------------------------------------
//    Comparator<String> comparator = new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//      }
//    };
//    Collections.sort(myList, comparator);

// 4)--------------------------------------------------------------------
/*    Collections.sort(myList, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.length() - o2.length();
      }
    });*/

// 5)--------------------------------------------------------------------
//    Comparator<String> comparator = (String o1, String o2) -> {return o1.length() - o2.length();};
//    Collections.sort(myList, comparator);

// 6)--------------------------------------------------------------------
//    Collections.sort(myList, (o1, o2) -> o1.length() - o2.length());
    myList.sort((o1, o2) -> o1.length() - o2.length());


    System.out.println(myList.toString());
  }
}
