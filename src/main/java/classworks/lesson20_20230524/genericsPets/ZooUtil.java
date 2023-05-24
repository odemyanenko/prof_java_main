package classworks.lesson20_20230524.genericsPets;

public class ZooUtil {
  Zoo<Animal> animalZoo = new Zoo<>(new Animal());
  Zoo<Dog> dogZoo = new Zoo<>(new Dog());
  Zoo<Cat> catZoo = new Zoo<>(new Cat());

  void printZoo(Zoo<? extends Animal> zoo){
    Animal item = zoo.getItem();
    System.out.println(item);
  }

  void addZooDog(Zoo<? super Dog> zoo){
    zoo.setItem(new DogSmall());
  }
}
