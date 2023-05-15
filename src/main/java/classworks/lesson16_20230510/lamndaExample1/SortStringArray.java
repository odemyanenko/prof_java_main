package classworks.lesson16_20230510.lamndaExample1;

public class SortStringArray {
  public static void main(String[] args) {
    ISortString ref;

    ref = (stringArray) -> {
      String tmp;
      for (int i = 0; i < stringArray.length - 1; i++) {
        for (int j = i; j >= 0; j--) {
          if (stringArray[j].compareTo(stringArray[j + 1]) > 0) {
            tmp = stringArray[j];
            stringArray[j] = stringArray[j + 1];
            stringArray[j + 1] = tmp;
          }
        }
      }
    };

    String[] strings = {"DDD", "HHH", "EEE", "FFF", "BBB", "DDD", "CCC", "AAA", "GGG", "RRR"};

    sortString(strings, ref);
  }
  public static void sortString (String[]arrayString, ISortString ref){
    ref.ourSort(arrayString);

    for (String arrayElement : arrayString) {
      System.out.println(arrayElement);
    }
  }
}