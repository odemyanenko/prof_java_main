package classworks.lesson19_20230522.requestResponseModel.service.todo;

import classworks.lesson19_20230522.requestResponseModel.DTO.ResponseData;
import classworks.lesson19_20230522.requestResponseModel.validation.ToDoValidationService;
import classworks.lesson19_20230522.requestResponseModel.database.Repository;
import classworks.lesson19_20230522.requestResponseModel.entity.ToDoEntity;
import classworks.lesson19_20230522.requestResponseModel.validation.TodoValidationException;

public class ToDoUpdateService {

  private final ToDoValidationService validationService;

  private final Repository<ToDoEntity> repository;


  public ToDoUpdateService(ToDoValidationService validationService, Repository<ToDoEntity> repository) {
    this.validationService = validationService;
    this.repository = repository;
  }

  public ResponseData update(ToDoEntity entity) {
    ResponseData updateResult = null;
    try {
      validationService.validate(entity);
      repository.save(entity);
      updateResult = new ResponseData("Ok", true, "200");
    } catch (TodoValidationException e) {
      updateResult = new ResponseData("Validation error", false, "404");
    }

    return updateResult;
  }
}