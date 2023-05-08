package classworks.lesson13_20230426.lambdaExamples;

import java.util.List;

@FunctionalInterface
public interface IListMerge {
  List<String> merge (List<String> list, List<String> list2);
}
