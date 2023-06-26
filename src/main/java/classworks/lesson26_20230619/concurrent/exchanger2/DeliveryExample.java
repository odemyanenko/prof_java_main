package classworks.lesson26_20230619.concurrent.exchanger2;

import java.util.concurrent.Exchanger;
/*
  A  _ _ _ _             _ _ _ _ B
          \          /
          - - E - -
  _ _ _ _ /          \ _ _ _ _
  C                              D

          E - точка обмена

          необходимо доставить посылки двумя грузовиками
          грузовик 1: посылка A -> C и A -> D
          грузовик 2: посылка B -> C и B -> D

          создать пункт E для обмена конечными посылками, чтобы итоговые конечные точки были одинаковые, то есть
          грузовик 1: посылка A -> C и A -> D, после обмена: A -> D и B -> D
          грузовик 2: посылка B -> C и B -> D, после обмена: B -> C и A -> C



 */

public class DeliveryExample {


  public static void main(String[] args) {

    Exchanger<String> exchanger = new Exchanger<>();

    // создадим список товаров для грузовика 1,2
    String[] goods1 = new String[] {"Посылка A->D","Посылка A->C"};
    String[] goods2 = new String[] {"Посылка B->D","Посылка B->C"};

    Truck truck1 = new Truck(1,"Factory A", "Warehouse C", goods1, exchanger);
    Truck truck2 = new Truck(2,"Factory B", "Warehouse D", goods2, exchanger);

    new Thread(truck1).start();
    new Thread(truck2).start();




  }
}