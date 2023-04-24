package classworks.lesson10_20230417;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CatListIteratorExample {
  public static void main(String[] args) {
    List<Cat> cats = new ArrayList<>();

    Cat cat1 = new Cat("Cat1");
    Cat cat2 = new Cat("Cat2");
    Cat cat3 = new Cat("Cat3");
    Cat cat4 = new Cat("Cat4");
    Cat cat5 = new Cat("Cat5");

    cats.add(cat1);
    cats.add(cat2);
    cats.add(cat3);
    cats.add(cat4);
    cats.add(cat5);

    ListIterator<Cat> catListIterator = cats.listIterator();

    while (catListIterator.hasNext()) {
      Cat tempCat = catListIterator.next();
      if (tempCat.name.equals("Cat4")) {
        System.out.println("equal");
        catListIterator.remove();
        catListIterator.add(new Cat("Cat6"));
      }
    }
    System.out.println(cats);

    while (catListIterator.hasPrevious()) {
      System.out.println(catListIterator.previous());
    }
  }
  //Spliterator - use in multithread
}
