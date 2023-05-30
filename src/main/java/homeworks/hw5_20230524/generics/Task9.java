package homeworks.hw5_20230524.generics;

/*
Создайте класс Map для хранения пар ключ-значение. Реализуйте методы
put(), get() и remove(). Используйте Generics для обеспечения
типобезопасности и возможности хранения в Map объектов разных типов.
*/

public class Task9 {
  public static void main(String[] args) {
    MyMap<String, Integer> map1 = new MyMap<>();
    map1.put("one", 1);
    map1.put("two", 2);
    map1.put("three", 3);

    System.out.println(map1.toString());
    System.out.println("one value: " + map1.get("one"));
    map1.remove("two");
    System.out.println(map1.toString());

    System.out.println("---------------------------------------------");

    MyMap<Integer, String> map2 = new MyMap<>();
    map2.put(1, "one");
    map2.put(2, "two");
    map2.put(3, "three");

    System.out.println(map2.toString());
    System.out.println("1 value: " + map2.get(1));
    map2.remove(2);
    System.out.println(map2.toString());
  }
}
