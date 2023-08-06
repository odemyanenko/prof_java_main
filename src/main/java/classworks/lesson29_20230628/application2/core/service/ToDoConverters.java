package classworks.lesson29_20230628.application2.core.service;

import classworks.lesson29_20230628.application2.domain.ToDoEntity;
import classworks.lesson29_20230628.application2.dto.AddToDoRequest;
import classworks.lesson29_20230628.application2.dto.ToDoDTO;

public class ToDoConverters {

  public ToDoEntity convert(AddToDoRequest request) {
    ToDoEntity entity = new ToDoEntity();
    entity.setName(request.getName());
    entity.setDescription(request.getDescription());
    return entity;
  }

  public ToDoDTO convert(ToDoEntity entity) {
    return new ToDoDTO(entity.getName(), entity.getDescription());
  }
}