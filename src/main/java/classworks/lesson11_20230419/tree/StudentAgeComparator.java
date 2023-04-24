package classworks.lesson11_20230419.tree;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
  @Override
  public int compare(Student o1, Student o2) {
    int compareResult =  o1.getAge() - o2.getAge();
    if (compareResult == 0) {
      compareResult = o1.getName().compareTo(o2.getName());
    }
    return compareResult;
  }
}
