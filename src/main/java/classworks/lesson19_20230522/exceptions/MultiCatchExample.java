package classworks.lesson19_20230522.exceptions;

import java.util.Scanner;

public class MultiCatchExample {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    try {
      int n = Integer.parseInt(scanner.nextLine());

      System.out.println(n + " is a " + (99 % n == 0) + " factor of 99");
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic error " + e.getMessage());
    } catch (NumberFormatException e) {
      System.out.println("Wrong data format!");
    } catch (Exception e) {
      System.out.println("Exception type: " + e.getMessage());
    }

    System.out.println("Program is finish");

  }
}
