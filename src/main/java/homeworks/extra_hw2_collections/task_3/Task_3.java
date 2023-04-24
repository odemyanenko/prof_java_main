package homeworks.extra_hw2_collections.task_3;

/*
В классе IntegerListDemo создайте список целых чисел.
  Продемонстрируйте как:
  - добавить в список элемент (в начало и в конец)
  - узнать длину списка
  - удалить элемент из списка (по интексу и без)
  - узнать пустой список или нет
  - обойти список и вывести на консоль каждый элемент.
*/

public class Task_3 {
  public static void main(String[] args) {
    IntegerListDemo demo = new IntegerListDemo();

    System.out.println("1) добавить в список элемент (в начало и в конец)--------------------------------------------");
    demo.addElements(1, 2);
    demo.addElements(3, 4);
    demo.printElements();
    System.out.println("---------------------------------------------------------------------------------------------");

    System.out.println("2) узнать длину списка ----------------------------------------------------------------------");
    System.out.println("Count elements: " + demo.getList().size());
    System.out.println("---------------------------------------------------------------------------------------------");

    System.out.println("3) удалить элемент из списка (по интексу и без) ---------------------------------------------");
    demo.printElements();
    System.out.println("Delete by Index (2): " + demo.deleteElement(2));
    demo.printElements();
    System.out.println("Delete by Object (3): " + demo.deleteElement((Integer)3));
    demo.printElements();
    System.out.println("---------------------------------------------------------------------------------------------");

    System.out.println("4) узнать пустой список или нет -------------------------------------------------------------");
    System.out.println("Is list empty: " + demo.getList().isEmpty());
    System.out.println("---------------------------------------------------------------------------------------------");

    System.out.println("5) обойти список и вывести на консоль каждый элемент ----------------------------------------");
    demo.printElements();
    System.out.println("---------------------------------------------------------------------------------------------");
  }
}


