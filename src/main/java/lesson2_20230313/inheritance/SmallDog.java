package lesson2_20230313.inheritance;

public class SmallDog extends Dog{
  @Override
  public void voice() {
    //super.voice();
    System.out.println("small gav!");
  }
}
