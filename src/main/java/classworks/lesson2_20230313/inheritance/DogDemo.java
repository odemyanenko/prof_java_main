package classworks.lesson2_20230313.inheritance;

public class DogDemo {
  public static void main(String[] args) {
    BigDog bigDog = new BigDog();
    SmallDog smallDog  = new SmallDog();

    bigDog.voice();
    bigDog.voiceBigDog();
    System.out.println("---------------------------");
    smallDog.voice();
  }
}
