package classworks.lesson_20230831.task3;

import java.util.concurrent.Exchanger;

/*Вы хотите реализовать систему обмена данными между двумя потоками.
        Один поток генерирует числа, а другой поток обрабатывает эти числа и возвращает результат обратно.

        Создайте класс DataProducer, который генерирует случайные числа и обменивается ими с помощью Exchanger.
        Создайте класс DataProcessor, который получает числа от DataProducer с помощью Exchanger,
        выполняет какую-то обработку (например, вычисление квадрата числа) и отправляет результат обратно.
        Реализуйте код, который запускает оба потока и демонстрирует обмен данными между ними.
*/
public class Main {
  public static void main(String[] args) {
    Exchanger<Integer> exchanger = new Exchanger<>();

    Thread dataProducerThread = new Thread(new DataProducer(exchanger));
    Thread dataProcessorThread = new Thread(new DataProcessor(exchanger));

    dataProducerThread.start();
    dataProcessorThread.start();
  }
}

class DataProducer implements Runnable{
  private Exchanger<Integer> exchanger;

  public DataProducer(Exchanger<Integer> exchanger) {
    this.exchanger = exchanger;
  }

  @Override
  public void run() {
    int result = 0;
    for (int i = 1; i <= 10; i++) {
      try {
        result = exchanger.exchange(i);
        System.out.println("Producer after exchanged: " + result);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

class DataProcessor implements Runnable{
  private Exchanger<Integer> exchanger;

  public DataProcessor(Exchanger<Integer> exchanger) {
    this.exchanger = exchanger;
  }

  @Override
  public void run() {
//    int data = 0;
//    for (int i = 0; i < 10; i++) {
//      data = exchanger.exchange()
//    }
  }
}
