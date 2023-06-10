package homeworks.hw6_20230531.task6;

/*
Создайте класс Database, который имеет методы connect() и disconnect(),
которые открывают и закрывают соединение с базой данных.
Напишите тест, который проверяет, что методы connect() и disconnect()
работают правильно.
*/

public class Task6 {
  public static void main(String[] args) {
    Database db = new Database();

    System.out.println("Connect to db? - " + db.isConnect());

    db.connect();
    System.out.println("Connect to db? - " + db.isConnect());

    db.disconnect();
    System.out.println("Connect to db? - " + db.isConnect());
  }
}
