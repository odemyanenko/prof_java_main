package classworks.lesson10_20230417;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatIteratorExample {
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

    System.out.println(cats.toString());

    cats.remove(cat3);

    System.out.println(cats.toString());

//    for (Cat tempCat : cats
//    ) {
//      if (tempCat.name.equals("Cat4")) {
//        cats.remove(tempCat);
//      }
//    }


//    with iterator
    Iterator<Cat> catIterator = cats.iterator();
    while (catIterator.hasNext()){
      System.out.println(catIterator.next());
    }

    Iterator<Cat> catIterator2 = cats.iterator();
    while (catIterator2.hasNext()){
      Cat tempCat = catIterator2.next();
      if (tempCat.name.equals("Cat4")){
        System.out.println("equal");
        catIterator2.remove();
      }
    }
    System.out.println(cats);


  }
}
