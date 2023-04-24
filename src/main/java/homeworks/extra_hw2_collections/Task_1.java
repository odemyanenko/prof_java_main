package homeworks.extra_hw2_collections;

import java.util.*;

/*
  Какие реализации интерфейса java.util.List вы знаете?
  Напишите программу, которая демонстрирует создание разных списков.
  PS: чем они отличаются друг от друга?
*/

public class Task_1 {
  public static void main(String[] args) {
    demoCreateArrayList();
    demoCreateLinkedList();
    demoCreateStack();
    demoCreateVector();
    demoInfoList();
  }

  private static void demoCreateVector() {
    List<String> vector = new Vector<>();

    vector.add("Eins");
    vector.add("Zwei");
    vector.add("Drei");
    vector.add("Vier");
    vector.add("Fünf");

    System.out.println("Demo \"Vector\": " + vector);
  }

  private static void demoCreateStack() {
    List<String> stack = new Stack<>();

    stack.add("One");
    stack.add("Two");
    stack.add("Three");

    System.out.println("Demo \"Stack\": " + stack);
  }

  private static void demoCreateLinkedList() {
    List<String> list = new LinkedList<>();

    list.add("Ivan");
    list.add("Olga");
    list.add("Petr");
    list.add("Anna");

    System.out.println("Demo \"LinkedList\": " + list);
  }

  private static void demoCreateArrayList() {
    List<Integer> array = new ArrayList<>();

    array.add(5);
    array.add(2);
    array.add(3);
    array.add(5);

    System.out.println("Demo \"ArrayList\": " + array);
  }

  private static void demoInfoList() {
    System.out.println("Реализации java.util.List являются упорядоченными структурами данных, разрешающими дубликаты.\n" +
            "\n" +
            "Интерфейс позволяет доставать элементы списка по индексу(позиции в списке), \n" +
            "добавлять элемент по определенному индексу и узнавать индекс элемента.\n" +
            "\n" +
            "Другими словами, реализации java.util.List предоставляют пользователю контроль над позицией элемента в списке.\n" +
            "\n" +
            "Нумерация индексов, как и у массивов, начинается с 0.\n" +
            "\n" +
            "Java существует четыре наиболее популярных стандартных реализации java.util.List:\n" +
            "java.util.ArrayList - на основе массива\n" +
            "java.util.LinkedList - на основе двусвязного списка\n" +
            "java.util.Vector - также построена на основе массива, но синхронизирована\n" +
            "java.util.Stack - расширение java.util.Vector\n" +
            "\n" +
            "Реализации java.util.Vector и java.util.Stack сейчас практически не используются.\n" +
            "Виной тому является то, что java.util.Vector синхронизована, из-за чего она является более медленной, \n" +
            "чем java.util.ArrayList или java.util.LinkedList.\n" +
            "\n" +
            "Вместо java.util.Stack же лучше использовать реализации java.util.Dequeue.\n" +
            "\n" +
            "Сложность алгоритмов основных операций для реализаций:\n" +
            "МЕТОД\t      JAVA.UTIL.ARRAYLIST\t JAVA.UTIL.LINKEDLIST\n" +
            "get(index)\t     O(1)\t                O(N)\n" +
            "add(E)\t         O(N)\t                O(1)\n" +
            "add(E, index)\t   O(N)\t                O(N)\n" +
            "remove(index)\t   O(N)\t                O(N)\n" +
            "\n" +
            "https://vectree.ru/text/136/2/0\n");
  }
}
