package classworks.lesson19_20230522.requestResponseModel.ui;

import classworks.lesson19_20230522.requestResponseModel.entity.ToDoEntity;
import classworks.lesson19_20230522.requestResponseModel.service.todo.ToDoUpdateService;
import classworks.lesson19_20230522.requestResponseModel.service.user.UserDataRetrieveService;

public class UIMenu {
  private final ToDoUpdateService toDoUpdateService;
  private final UserDataRetrieveService retrieveService;

  public UIMenu(ToDoUpdateService toDoUpdateService, UserDataRetrieveService retrieveService) {
    this.toDoUpdateService = toDoUpdateService;
    this.retrieveService = retrieveService;
  }

  public void startUI(){
    String title = retrieveService.retriveTitle();
    ToDoEntity entity = new ToDoEntity(title);

    toDoUpdateService.update(entity);
  }
}
