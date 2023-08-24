package classworks.lesson_20230824.task1;

/*
* Создайте переменную dataToSend с типом int для хранения данных, которые будут отправлены.
Создайте метод sendData(int data), который принимает данные в качестве аргумента и сохраняет
их в переменную dataToSend.
Создайте метод getDataToSend(), который возвращает текущие данные для отправки.
* */
public class Sender {
  private volatile int dataToSend;

  public void sendData(int data){
    dataToSend = data;
    System.out.println(Thread.currentThread().getName() + " (sendData) : " + dataToSend);
//    System.out.println("Sending data: " + data);
  }

  public int getDataToSend(){
    System.out.println(Thread.currentThread().getName() + " (getDataToSend) : " + dataToSend);
    return dataToSend;
  }
}
