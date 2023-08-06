package classworks.lesson_20230801;

public class Re6 {
  public static void main(String[] args) {
    String s = "Más        allá  del precio,los       consumidores también";
    s = s.replaceAll(" {2,}", " ");
    System.out.println(s);
  }
}
