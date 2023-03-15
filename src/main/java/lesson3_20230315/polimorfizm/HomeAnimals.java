package lesson3_20230315.polimorfizm;

public class HomeAnimals {
  public static void main(String[] args) {
    BigDog myDog = new BigDog();
    Cat myCat = new Cat();

    Util1[] myAnimals = {myDog, myCat};
    for (int i = 0; i < myAnimals.length; i++) {
      myAnimals[i].voice();
    }
  }
}
