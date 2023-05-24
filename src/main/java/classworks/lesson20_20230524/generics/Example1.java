package classworks.lesson20_20230524.generics;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
  public static void main(String[] args) {
    List list1 = new ArrayList<>();

    list1.add("adfadf");
    list1.add("sdfsddf");
    list1.add("ad34534fadf");
    list1.add("addfsdfgff");

    List list2 = new ArrayList<>();
    list2.add("adfgdgdsfg");
    list2.add(234234);

    printCollection(list1);
    printCollection(list2);
  }

  public static void printCollection(List list){
    System.out.println("Print list:\n-----------------------------");
    for (int i = 0; i < list.size(); i++) {
      String item = (String)list.get(i);
      System.out.println(item);

    }
  }
}
