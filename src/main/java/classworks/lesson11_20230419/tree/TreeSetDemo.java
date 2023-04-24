package classworks.lesson11_20230419.tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    Student student1 = new Student(23, "Dima");
    Student student2 = new Student(33, "Anna");
    Student student3 = new Student(43, "Ivan");
    Student student4 = new Student(22, "Kolya");
    Student student5 = new Student(23, "Sem");

    System.out.println("------------------");
    Set<Student> ourSetStudent = new HashSet<>();
    ourSetStudent.add(student1);
    ourSetStudent.add(student2);
    ourSetStudent.add(student3);
    ourSetStudent.add(student4);
    ourSetStudent.add(student5);

    System.out.println(ourSetStudent);

    System.out.println("------------------");
    Set<Student> ourTreeStudent = new TreeSet<>();
    ourTreeStudent.add(student1);
    ourTreeStudent.add(student2);
    ourTreeStudent.add(student3);
    ourTreeStudent.add(student4);
    ourTreeStudent.add(student5);

    System.out.println(ourTreeStudent);

    System.out.println("------------------");
    TreeMap<Integer, Student> ourTreeMapStudent = new TreeMap<>();
    ourTreeMapStudent.put(1, student1);
    ourTreeMapStudent.put(12, student2);
    ourTreeMapStudent.put(3, student3);
    ourTreeMapStudent.put(14, student4);
    ourTreeMapStudent.put(5, student5);

    System.out.println(ourTreeMapStudent);

    System.out.println("------------------");
    TreeMap<Student, Integer> ourTreeMapStudentbyAge = new TreeMap<>(new StudentAgeComparator());
    ourTreeMapStudentbyAge.put(student1, 1);
    ourTreeMapStudentbyAge.put(student2, 12);
    ourTreeMapStudentbyAge.put(student3, 3);
    ourTreeMapStudentbyAge.put(student4, 14);
    ourTreeMapStudentbyAge.put(student5, 5);

    System.out.println(ourTreeMapStudentbyAge);
  }
}
