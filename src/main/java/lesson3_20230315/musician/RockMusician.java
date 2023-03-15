package lesson3_20230315.musician;

public class RockMusician implements Musician{
  private String name;

  public RockMusician(String name) {
    this.name = name;
  }

  @Override
  public void dance() {
    System.out.println("rock dance");
  }

  @Override
  public void playMusic() {
  }

  @Override
  public void sing() {
    System.out.println("rock sing");
  }

  @Override
  public void greeting() {
    System.out.println("rock greeting");
  }
}
