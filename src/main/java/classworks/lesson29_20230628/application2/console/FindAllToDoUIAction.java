package classworks.lesson29_20230628.application2.console;

import classworks.lesson29_20230628.application2.core.service.FindToDoService;

public class FindAllToDoUIAction implements UIAction{

  private final FindToDoService findToDoService;

  public FindAllToDoUIAction(FindToDoService findToDoService) {
    this.findToDoService = findToDoService;
  }

  @Override
  public void execute() {
    var response = findToDoService.findAll();
    System.out.println("Find All ToDo response: " + response);
  }

  @Override
  public String getActionName() {
    return "Find All ToDo";
  }
}