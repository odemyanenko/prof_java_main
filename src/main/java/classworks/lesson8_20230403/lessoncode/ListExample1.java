package classworks.lesson8_20230403.lessoncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample1 {
  public static void main(String[] args) {
    int[] arr1 = {1,7,6,5};
    int[] arr2 = {1,6,7,5};

    printResult(checkEqualArray(arr1, arr2));
  }

  private static void printResult(Boolean isSame) {
    if (isSame){
      System.out.println("=");
    }
    else System.out.println("!=");
  }

  private static Boolean checkEqualArray(int[] arr1, int[] arr2) {
    boolean isSame = true;

    if (arr1.length != arr2.length) {
      return false;
    }

    List<Integer> arrList = Arrays.stream(arr1).boxed().toList();

    System.out.println(arrList);


    return isSame;
  }
}
