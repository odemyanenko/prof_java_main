package classworks.lesson4_20230320.objectCopy;

public class PinokkioDemo {
  public static void main(String[] args) throws CloneNotSupportedException {
    Book pinokkio = new Book("Pinokkio", 1958);

    Book mirracle = pinokkio;///Copy Address in Memory
    mirracle.setName("Mirracle");

    System.out.println(pinokkio);
    System.out.println(mirracle);
    System.out.println("------------------");
    Book buratino = pinokkio.clone();
    buratino.setName("Buratino");
    System.out.println(pinokkio);
    System.out.println(buratino);
  }
}
