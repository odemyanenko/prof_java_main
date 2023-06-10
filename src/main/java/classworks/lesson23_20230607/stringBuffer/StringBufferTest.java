package classworks.lesson23_20230607.stringBuffer;

public class StringBufferTest {
  public static void main(String[] args) {
    String str = "";

    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
      str = str + i;
    }
    long endTime = System.currentTimeMillis();

    System.out.println("Operations time is " + (endTime - startTime));

    StringBuffer sb = new StringBuffer();

    startTime = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
      sb.append(i);
    }
    endTime = System.currentTimeMillis();

    System.out.println("Operations time is " + (endTime - startTime));

  }
}
