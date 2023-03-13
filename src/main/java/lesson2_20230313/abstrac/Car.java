package lesson2_20230313.abstrac;

public abstract class Car {
  protected String model;

  public Car() {
  }

  public Car(String model) {
    this.model = model;
  }

  public void printCarName(){
    System.out.println("Our car model:" + model);
  }
  abstract void  speedUp();

  void beep(){

  }

  private void printName(){
    System.out.println("printName_Car");
  }

}
