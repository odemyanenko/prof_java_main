package homeworks.hw1_20230322;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
3)
- создать List наполнить его 10М> элементами
  При наполнении списка  сохраняем i- тый элемент в переменную temp
- перебрать коллекцию с помощью
  a) for-each loop и  вызываем list.size() для каждой итерации
  b) classic for и вызываем list.size() для каждой итерации
  c) classic for, но list.size() определяем в переменную
  d) classic for, list.size() определяем в переменную, перебираем с конца (i--)
для всех задач сделать замер времени выполнения цикла и результат вывести в консоль
*/

public class Task3Demo {
  public static void main(String[] args) {
    //создать List наполнить его 10М> элементами
    List<Integer> list = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();

    doFillList(list);
    doFillList(list2);

    //a) for-each loop и  вызываем list.size() для каждой итерации
    System.out.println("------------------------------------------------");
    doTask_a(list);
    doTask_a(list2);

    //b) classic for и вызываем list.size() для каждой итерации
    System.out.println("------------------------------------------------");
    doTask_b(list);
    doTask_b(list2);

    //c) classic for, но list.size() определяем в переменную
    System.out.println("------------------------------------------------");
    doTask_c(list);
    doTask_c(list2);

    //d) classic for, list.size() определяем в переменную, перебираем с конца (i--)
    System.out.println("------------------------------------------------");
    doTask_d(list);
    doTask_d(list2);
  }

  private static void doFillList(List<Integer> list) {
    long start = System.currentTimeMillis();
    ListUtil.fillListRandomNumbers(list, 15000000, 20);
    long finish = System.currentTimeMillis();
    long result = finish - start;
    System.out.println("Create list " + list.getClass() + " = " + result + " ms");
  }

  private static void doTask_d(List<Integer> list) {
    long start = System.currentTimeMillis();
    for (int i = list.size(); i >= 0; i--) {
      int temp = list.size();
    }
    long finish = System.currentTimeMillis();
    long result = finish - start;
    System.out.println("d) Result " + list.getClass() + " = " + result + " ms");
  }

  private static void doTask_c(List<Integer> list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < list.size(); i++) {
      int temp = list.size();
    }
    long finish = System.currentTimeMillis();
    long result = finish - start;
    System.out.println("c) Result " + list.getClass() + " = " + result + " ms");
  }

  private static void doTask_b(List<Integer> list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < list.size(); i++) {
      list.size();
    }
    long finish = System.currentTimeMillis();
    long result = finish - start;
    System.out.println("b) Result " + list.getClass() + " = " + result + " ms");
  }

  private static void doTask_a(List<Integer> list) {
    long start = System.currentTimeMillis();
    for (Integer elem : list
    ) {
      list.size();
    }
    long finish = System.currentTimeMillis();
    long result = finish - start;
    System.out.println("a) Result " + list.getClass() + "= " + result + " ms");
  }
}
