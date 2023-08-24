package classworks.lesson_20230824.task1;

public class MainApp {
  public static void main(String[] args) {
    Sender sender = new Sender();
    Receiver receiver = new Receiver();

    Thread senderThread = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        sender.sendData(i);
        receiver.receiveData(sender.getDataToSend());
      }
    });
    senderThread.setName("senderThread");

    Thread receiverThread = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        receiver.receiveData(i);
        sender.sendData(receiver.getReceivedData());
      }
    });
    receiverThread.setName("receiverThread");

    Thread mainThread = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        int data = receiver.getReceivedData();
        System.out.println("Main thread received data: " + data);
      }
    });
    mainThread.setName("mainThread");

    senderThread.start();
    receiverThread.start();
    mainThread.start();
  }
}