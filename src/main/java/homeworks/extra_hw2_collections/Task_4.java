package homeworks.extra_hw2_collections;

/*
Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)? Напишите код программы, который демонстрирует
ответ на этот вопрос.
*/

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(1);
    list.add(3);

    System.out.println(list);
  }
}
