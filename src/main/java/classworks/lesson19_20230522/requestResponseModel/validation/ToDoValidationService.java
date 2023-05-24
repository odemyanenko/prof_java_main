package classworks.lesson19_20230522.requestResponseModel.validation;

import classworks.lesson19_20230522.requestResponseModel.entity.ToDoEntity;

public class ToDoValidationService {
  public void validate(ToDoEntity toDoEntity){
    if (toDoEntity.getTitle().isBlank()) {
      throw new TodoValidationException("Incorrect title");
    }
  }
}
