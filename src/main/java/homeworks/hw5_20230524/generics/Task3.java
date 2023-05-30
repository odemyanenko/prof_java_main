package homeworks.hw5_20230524.generics;

/*
Создайте класс Pair с двумя полями - first и second, и реализуйте
методы getFirst() и getSecond() для доступа к этим полям.
Используйте Generics для возможности хранения в Pair объектов
разных типов.
*/

public class Task3 {
  public static void main(String[] args) {
    Pair<Integer> pair1 = new Pair<>(12, 30);
    Pair<String> pair2 = new Pair<>("asd", "zxc");

    System.out.println(pair1);
    System.out.println(pair1.getFirst());
    System.out.println(pair1.getSecond());

    System.out.println(pair2);
    System.out.println(pair2.getFirst());
    System.out.println(pair2.getSecond());
  }
}


