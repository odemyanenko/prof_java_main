package classworks.lesson23_20230607.multithreading;

public class CarAppWithRunnamle {
  public static void main(String[] args) throws InterruptedException {
    CarWithRunnable ferrari = new CarWithRunnable("Ferrari");
    CarWithRunnable bmw = new CarWithRunnable("BMW");

    Thread ferrariThread = new Thread(ferrari);
    Thread bmwThread = new Thread(bmw);

    ferrariThread.start();
    bmwThread.start();

    Thread.sleep(200);

    System.out.println("Method continues execution... " +
            "Main method is executing by thread " + Thread.currentThread().getName());

  }
}