package classworks.lesson12_20230424.queueRequests;

/*
Туристическое агентство имеет очередь ожидания для обработки заявок на бронирование туров. Когда клиенты подают заявку, их заявки добавляются в конец очереди. Когда тур становится доступным, первая заявка в очереди обрабатывается, и клиент получает подтверждение о бронировании.

        Требования:

        Очередь должна поддерживать добавление заявок в конец очереди и удаление заявок из начала очереди.
        Если в очереди нет заявок, метод удаления из очереди должен возвращать null.
        Очередь должна быть ограничена по размеру, чтобы ограничить количество заявок, которые могут находиться в очереди одновременно.
        Очередь должна быть реализована с использованием коллекции Queue из библиотеки Java.

*/

public class RequestApplication {
  public static void main(String[] args) {
    Request request1 = new Request(1, "Request1");
    Request request2 = new Request(2, "Request2");
    Request request3 = new Request(3, "Request3");
    Request request4 = new Request(4, "Request4");

    RequestManager manager = new RequestManager(3);

    manager.addRequest(request1);
    manager.addRequest(request2);
    manager.addRequest(request3);
    manager.addRequest(request4);

    System.out.println(manager.requests);

    System.out.println(manager.deleteRequest(request2));
    System.out.println(manager.requests);

    manager.processRequest();
    System.out.println(manager.requests);

    manager.processRequest();
    System.out.println(manager.requests);
  }
}
