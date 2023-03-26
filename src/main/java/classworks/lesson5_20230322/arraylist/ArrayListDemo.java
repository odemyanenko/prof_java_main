package classworks.lesson5_20230322.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> stringArrayList = new ArrayList<>();
    System.out.println(stringArrayList.size());
    System.out.println("-----------------------");
    stringArrayList.add("AAA");
    System.out.println(stringArrayList.size());

    System.out.println("-----------------------");
    stringArrayList.add("BBB");
    stringArrayList.add("CCC");
    stringArrayList.add(0, "DDD");
    System.out.println(stringArrayList);

    System.out.println("-----------------------");
    for (int i = 0; i < stringArrayList.size(); i++) {
      String tempString = stringArrayList.get(i);
      System.out.println(i + " - element ArrayList : " + tempString);
    }

    System.out.println("-----------------------");
    stringArrayList.remove(0);
    System.out.println(stringArrayList);
    stringArrayList.remove("BBB");
    System.out.println(stringArrayList);

    System.out.println("-----------------------");
//    stringArrayList.clear();

//    for (String str: stringArrayList) {
//      stringArrayList.remove(0);
//    }
//    System.out.println(stringArrayList);

    for (int i = 0; i < stringArrayList.size(); i++) {
      stringArrayList.remove(i);
    }
    System.out.println(stringArrayList);
  }
}
