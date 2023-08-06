package classworks.lesson29_20230628.application2.core.service;

import classworks.lesson29_20230628.application2.core.validation.CoreError;
import classworks.lesson29_20230628.application2.dto.FindToDoResponse;
import classworks.lesson29_20230628.application2.dto.ToDoDTO;
import classworks.lesson29_20230628.application2.repository.ToDoRepository;

import java.util.ArrayList;
import java.util.List;

public class FindToDoService {

  private final ToDoRepository repository;
  private final ToDoConverters converters;

  public FindToDoService(ToDoRepository repository, ToDoConverters converters) {
    this.repository = repository;
    this.converters = converters;
  }

  public FindToDoResponse findAll() {

//        List<ToDoEntity> entities = repository.findAll();
//        List<ToDoDTO> dtos = new ArrayList<>();
//        List<CoreError> errors = new ArrayList<>();
//
//        if (entities == null ||entities.isEmpty()) {
//            errors.add(new CoreError("ToDo database is null"));
//        } else {
//            for (int i = 0; i < entities.size(); i++) {
//                dtos.add(convert(entities.get(i)));
//            }
//        }

    List<CoreError> errors = new ArrayList<>();

    List<ToDoDTO> dtos = repository.findAll().stream()
            .map(converters::convert)
            .toList();

    if (dtos.isEmpty()) {errors.add(new CoreError("ToDo database is null"));}

    return new FindToDoResponse(dtos, errors);
  }


  public FindToDoResponse findById(Integer id) {
    List<CoreError> errors = new ArrayList<>();

    List<ToDoDTO> dtos = repository.findById(id).stream()
            .map(converters::convert)
            .toList();
    if (dtos.isEmpty()) {errors.add(new CoreError("ToDo with id " + id + " is not found"));}

    return new FindToDoResponse(dtos, errors);
  }
}