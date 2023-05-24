package classworks.lesson19_20230522.requestResponseModel.service.user;

import java.util.Scanner;

public class UserConsole implements UserDataRetrieveService{
  @Override
  public String retriveTitle() {
    System.out.println("Please enter todo title:");
    Scanner scanner = new Scanner(System.in);
    String title = scanner.nextLine();
    return title;
  }
}
