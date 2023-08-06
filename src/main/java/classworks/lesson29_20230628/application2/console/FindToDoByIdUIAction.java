package classworks.lesson29_20230628.application2.console;

import classworks.lesson29_20230628.application2.core.service.FindToDoService;

import java.util.Scanner;

public class FindToDoByIdUIAction implements UIAction{

  private final FindToDoService findToDoService;

  public FindToDoByIdUIAction(FindToDoService findToDoService) {
    this.findToDoService = findToDoService;
  }

  @Override
  public void execute() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter ToDo id:");
    Integer id = scanner.nextInt();

    var response = findToDoService.findById(id);
    System.out.println("Find ToDo by Id response: " + response);
  }

  @Override
  public String getActionName() {
    return "Find ToDo by Id";
  }
}