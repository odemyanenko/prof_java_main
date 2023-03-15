package lesson3_20230315.polimorfizm;

//public class BigDog extends Dog{
//  @Override
//  void voice() {
//
//  }
//}

public class BigDog implements Util1, Util2 {

  @Override
  public void voice() {
    System.out.println("Gav!");
  }

  @Override
  public void sleep() {

  }
}