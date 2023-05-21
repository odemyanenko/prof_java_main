package homeworks.hw4_20230517;

import java.util.Scanner;

public class UserInput {
  Scanner scanner = new Scanner(System.in);

  public String getText(String message){
    System.out.println(message);
    return scanner.nextLine();
  }
}
