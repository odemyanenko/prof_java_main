package classworks.lesson2_20230313.abstrac;

public class CarDemo2 {
  public static void main(String[] args) {
    Sedan sedan1 = new Sedan("BMW");
    Sedan sedan2 = new Sedan("Volvo");
    Sedan sedan3 = new Sedan("Reno");

    SportCar sportCar1 = new SportCar();
    SportCar sportCar2 = new SportCar();
    SportCar sportCar3 = new SportCar();

    Truck truck1 = new Truck();
    Truck truck2 = new Truck();
    Truck truck3 = new Truck();

    Car[] cars = {sedan1, sedan2, sedan3, sportCar1, sportCar2, sportCar3, truck1, truck2, truck3};
    for (int i = 0; i < cars.length; i++) {
      cars[i].speedUp();
      cars[i].printCarName();
      cars[i].beep();
    }
  }
}
