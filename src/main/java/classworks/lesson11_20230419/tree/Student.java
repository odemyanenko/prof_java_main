package classworks.lesson11_20230419.tree;

public class Student implements Comparable<Student> {
  private int age;
  private String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Student{" +
            "age=" + age +
            ", name='" + name + '\'' +
            '}';
  }

  @Override
  public int compareTo(Student o) {
    int compareResult = this.age - o.age;
    if (compareResult == 0) {
      return name.compareTo(o.name);
    } else {
      return compareResult;
    }
  }
}
