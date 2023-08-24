package classworks.lesson_20230824.task1;

/*
Класс Receiver (Получатель):
Этот класс представляет получателя данных.

Создайте переменную receivedData с типом int для хранения принятых данных.
Создайте метод receiveData(int data), который принимает данные в качестве аргумента
сохраняет их в переменную receivedData.
Создайте метод getReceivedData(), который возвращает текущие принятые данные.
* */

public class Receiver {
  private volatile int receivedData;

  public synchronized void receiveData(int data){
    receivedData = data;
    System.out.println(Thread.currentThread().getName() + " (getReceivedData) : " + receivedData);
//    System.out.println("Received data: " + data);
  }

  public synchronized int getReceivedData(){
    System.out.println(Thread.currentThread().getName() + " (getReceivedData) : " + receivedData);
    return receivedData;
  }
}
