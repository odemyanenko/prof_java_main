package homeworks.hw1_20230322;

import java.util.List;
import java.util.Random;

/*
1)
В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
  - добавить в список элемент (в начало и в конец)
  - узнать длину списка
  - удалить элемент из списка (по индексу и без)
  - узнать пустой список или нет
  - обойти список и вывести на консоль каждый элемент.
2)
Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)?
Напишите код программы, который демонстрирует ответ на этот вопрос.
3)
создать List наполнить его 10М> элементами
При наполнении списка  сохраняем i- тый элемент в переменную temp
перебрать коллекцию с помощью
  a) for-each loop и  вызываем list.size() для каждой итерации
  b) classic for и вызываем list.size() для каждой итерации
  c) classic for, но list.size() определяем в переменную
  d) classic for, list.size() определяем в переменную, перебираем с конца (i--)
для всех задач сделать замер времени выполнения цикла и результат вывести в консоль
*/

public class IntegerListDemo {
  public static void main(String[] args) {
    Random random = new Random();

    System.out.println("Task 1");
    List<Integer> integerList;
    integerList = ListUtil.createArrayList();
    ListUtil.fillListRandomNumbers(integerList, 20);
    System.out.println("Created list:\n" + integerList);

    //- добавить в список элемент (в начало и в конец)
    integerList.add(1);
    System.out.println("Added element teil (1):\n" + integerList);
    integerList.add(0, 2);
    System.out.println("Added element head (2):\n" + integerList);

    //- узнать длину списка
    System.out.println("Length list:\n" + integerList.size());

    //- удалить элемент из списка (по индексу и без)
    integerList.remove(1);
    System.out.println("Deleted element (index = 1):\n" + integerList);
    integerList.remove((Integer) 1);
    System.out.println("Deleted element (1):\n" + integerList);

    //- узнать пустой список или нет
    System.out.printf("Is list empty?\n%b\n", integerList.isEmpty());

    //- обойти список и вывести на консоль каждый элемент.
    ListUtil.printElements(integerList);
  }
}
