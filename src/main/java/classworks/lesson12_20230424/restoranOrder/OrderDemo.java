package classworks.lesson12_20230424.restoranOrder;
/*
Описание:
Вам необходимо разработать класс, который будет представлять коллекцию заказов в ресторане,
используя структуру данных LinkedList в Java.
Заказы должны быть представлены в виде объектов Order,
которые содержат информацию о наименовании блюда, количестве порций и стоимости.

Класс должен иметь следующие методы:
        addOrder(Order order): Добавляет заказ в конец коллекции.
        removeOrder(Order order): Удаляет указанный заказ из коллекции.
        getTotalCost(): Возвращает общую стоимость всех заказов в коллекции.
        getOrdersCount(): Возвращает количество заказов в коллекции.
        getOrderById(int id): Возвращает заказ по указанному идентификатору.
*/

public class OrderDemo {
  public static void main(String[] args) {
    OrderDataBaseImpl db = new OrderDataBaseImpl();

    Order order1 = new Order(1, "Pasta", 2, 33.54);

    db.addOrder(order1);
    db.addOrder(new Order(2, "Borsch", 2, 23.45));
    db.addOrder(new Order(3,"Pizza", 1, 12.5));
    db.printOrders();

    db.removeOrder(order1);
    db.printOrders();

    System.out.println("Total cost: " + db.getTotalCost());
    System.out.println("Count dishes: " + db.getOrdersCount());

    System.out.println("Find Order id = 1: " + db.getOrderById(1));
    System.out.println("Find Order id = 3: " + db.getOrderById(3));
  }
}
