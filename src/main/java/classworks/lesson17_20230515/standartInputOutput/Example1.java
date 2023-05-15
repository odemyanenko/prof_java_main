package classworks.lesson17_20230515.standartInputOutput;

import java.util.Date;

public class Example1 {
  public static void main(String[] args) {
    System.out.println("Example with carrent line");
    System.out.printf("one%ntwo%nthree");
    System.out.println();

    System.out.println("Example with logic type:");
    System.out.printf("%b%n", null);
    System.out.printf("%B%n", false);
    System.out.printf("%B%n", 2);
    System.out.printf("%B%n", "text");
    System.out.println();

    System.out.println("Example with string");
    System.out.printf("%50.20s", "Hello world!");
    System.out.println();

    System.out.println("Example with characters");
    System.out.printf("%c%n", 'a');
    System.out.printf("%C%n", 'a');
    System.out.println();

    int x = 100;
    System.out.printf("Print sample integer: x = %d\n", x);
    System.out.printf("Formatted to specific width: n = %.6f\n", Math.PI);

    float y = 3.14f;
    System.out.printf("Formatted to specific width: n = %.4f\n", y);

    y = 1234567.3f;
    double z = 1234567.32d;
    System.out.printf("Formatted to right margin: n = %50.4f\n", z);
    System.out.println();

    Date date = new Date();
    System.out.println(date);
    System.out.printf("hours%tH: minutes %tM: seconds %tS%n", date, date, date);
    System.out.printf("%1$tA, %1$tB, %1$tY %n", date);
    System.out.println();

  }
}
