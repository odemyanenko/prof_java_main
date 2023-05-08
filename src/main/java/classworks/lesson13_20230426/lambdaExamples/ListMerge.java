package classworks.lesson13_20230426.lambdaExamples;

import java.util.ArrayList;
import java.util.List;

public class ListMerge {
  public static void main(String[] args) {
    IListMerge listMerger = (list1,list2) -> {
      List<String> merge = new ArrayList<>();
      merge.addAll(list1);
      merge.addAll(list2);
      return merge;
    };

    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();

    list1.add("1q");
    list1.add("2w");
    list1.add("3e");
    list1.add("4r");

    list2.add("q1");
    list2.add("s2");
    list2.add("e3");
    list2.add("r4");

    List<String> merge = listMerger.merge(list1, list2);
    System.out.println(merge.toString());
  }
}
