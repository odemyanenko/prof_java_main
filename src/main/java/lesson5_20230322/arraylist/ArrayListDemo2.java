package lesson5_20230322.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
  public static void main(String[] args) {
    ArrayList<Integer> integerArrayList = new ArrayList<>();
    ArrayList<Double> doubleArrayList = new ArrayList<>();
    for (double i = 0; i < 10; i++) {
      doubleArrayList.add(0, i);
    }
    System.out.println(doubleArrayList);

    for (int i = 0; i < 10; i++) {
//      integerArrayList.add(i);
      integerArrayList.add(0, i);
    }
    System.out.println(integerArrayList);

    System.out.println("------------------------------");
    integerArrayList.remove((Integer)4);
//    Integer datafordelete = 4;
//    integerArrayList.remove(datafordelete);
//    integerArrayList.remove(Integer.valueOf(4));
    System.out.println(integerArrayList);

    doubleArrayList.remove(4.0);
    System.out.println(doubleArrayList);
  }
}
