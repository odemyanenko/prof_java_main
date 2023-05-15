package classworks.lesson17_20230515.standartInputOutput;

import java.util.Scanner;

public class Example2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double n = Double.parseDouble(scanner.next());
    double k = Double.parseDouble(scanner.next());
    System.out.println(n + k);
    System.out.println();

    double n2 = Double.parseDouble(scanner.next());
    String str = scanner.next();
    System.out.println(n2 + str);
  }
}
