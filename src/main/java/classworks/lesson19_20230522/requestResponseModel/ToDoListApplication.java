package classworks.lesson19_20230522.requestResponseModel;

import classworks.lesson19_20230522.requestResponseModel.database.ToDoRepository;
import classworks.lesson19_20230522.requestResponseModel.service.todo.ToDoUpdateService;
import classworks.lesson19_20230522.requestResponseModel.service.user.UserConsole;
import classworks.lesson19_20230522.requestResponseModel.service.user.UserFileRetrieveService;
import classworks.lesson19_20230522.requestResponseModel.ui.UIMenu;
import classworks.lesson19_20230522.requestResponseModel.validation.ToDoValidationService;

public class ToDoListApplication {
  public static void main(String[] args) {
    ToDoValidationService validationService = new ToDoValidationService();
    ToDoRepository toDoRepository = new ToDoRepository();
    ToDoUpdateService service = new ToDoUpdateService(validationService, toDoRepository);
    UserConsole userConsole = new UserConsole();
    UserFileRetrieveService userFile = new UserFileRetrieveService();

    UIMenu uiMenu = new UIMenu(service, userConsole);

    uiMenu.startUI();

  }
}