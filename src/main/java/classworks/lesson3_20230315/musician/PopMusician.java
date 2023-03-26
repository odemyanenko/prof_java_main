package classworks.lesson3_20230315.musician;

public class PopMusician implements Musician{
  @Override
  public void dance() {
    System.out.println("pop dance");
  }

  @Override
  public void playMusic() {
  }

  @Override
  public void sing() {
    System.out.println("pop sing");
  }

  @Override
  public void greeting() {
    System.out.println("pop greeting");
  }
}
