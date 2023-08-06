package classworks.lesson29_20230628.application2.console;

import classworks.lesson29_20230628.application2.core.service.AddToDoService;
import classworks.lesson29_20230628.application2.dto.AddToDoRequest;

import java.util.Scanner;

public class AddToDoUIAction implements UIAction{

  private final AddToDoService addToDoService;

  public AddToDoUIAction(AddToDoService addToDoService) {
    this.addToDoService = addToDoService;
  }

  @Override
  public void execute() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter task name:");
    String name = scanner.nextLine();
    System.out.println("Please, enter task description:");
    String description = scanner.nextLine();

    var request = new AddToDoRequest();
    request.setName(name);
    request.setDescription(description);

    var response = addToDoService.add(request);
    System.out.println("Received response from add todo service: " + response);
  }

  @Override
  public String getActionName() {
    return "Add ToDo";
  }
}