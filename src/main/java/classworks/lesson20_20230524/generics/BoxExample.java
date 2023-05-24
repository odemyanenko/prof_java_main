package classworks.lesson20_20230524.generics;

public class BoxExample {
  public static void main(String[] args) {
    Box<Paper> paperBox = new Box<>();
    Box<Glass> glassBox = new Box<>();
    Box<Plastic> plasticBox = new Box<>();
    BoxTwoCell<Plastic, Glass> plasticGlassBoxTwoCell = new BoxTwoCell<>();
  }
}
