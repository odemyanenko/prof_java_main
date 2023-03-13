package lesson2_20230313.abstrac;

public class CarDemo {
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

    Sedan[] sedans = {sedan1, sedan2, sedan3};
    SportCar[] sportCars = {sportCar1, sportCar2, sportCar3};
    Truck[] trucks = {truck1, truck2, truck3};

    for (int i = 0; i < sedans.length; i++) {
      System.out.println(sedans[i].model);
      sedans[i].speedUp();
    }
    System.out.println("-------------------------");
    for (int i = 0; i < sportCars.length; i++) {
      sportCars[i].speedUp();
    }
    System.out.println("-------------------------");
    for (int i = 0; i < trucks.length; i++) {
      trucks[i].speedUp();
    }
  }
}
