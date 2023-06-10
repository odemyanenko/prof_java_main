package classworks.lesson23_20230607.multithreading;

public class CarApp {
  public static void main(String[] args) throws InterruptedException {
    var ferrari = new Car("Ferrari");
    Car bmw = new Car("BMW");

    ferrari.start();
    bmw.start();

    Thread.sleep(200);

    System.out.println("Method continues execution... " +
            "Main method is executing by thread " + Thread.currentThread().getName());

  }
}