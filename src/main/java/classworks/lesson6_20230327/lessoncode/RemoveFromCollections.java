package classworks.lesson6_20230327.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class RemoveFromCollections {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
    integerList.add((Integer) 1);
    integerList.add((Integer) 2);
    integerList.add((Integer) 3);
    integerList.add((Integer) 1);
    integerList.add((Integer) 2);
    integerList.add((Integer) 3);
    integerList.add((Integer) 1);
    integerList.add((Integer) 2);
    integerList.add((Integer) 3);

    System.out.println(integerList);
    integerList.remove((Integer) 1);
    System.out.println(integerList);

    System.out.println("--------------------------------");
    List<Integer> integerList1 = new ArrayList<>();
    integerList1.add((Integer) 1);
    integerList1.add((Integer) 1);
    integerList1.add((Integer) 2);

    System.out.println(integerList1);
    for (int i = 0; i < integerList1.size(); i++) {
      integerList.remove(integerList1.get(i));
    }
    System.out.println(integerList);
  }
}
