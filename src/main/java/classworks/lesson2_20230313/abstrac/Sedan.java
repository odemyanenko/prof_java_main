package classworks.lesson2_20230313.abstrac;

public class Sedan extends Car{
  public Sedan(String model) {
    super(model);
  }

  @Override
  void speedUp() {
    System.out.println("Sedan speedUp!");
  }

  @Override
  void beep(){
    System.out.println("Beep!");
  }

}
