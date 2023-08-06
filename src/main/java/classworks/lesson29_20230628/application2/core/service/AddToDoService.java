package classworks.lesson29_20230628.application2.core.service;

import classworks.lesson29_20230628.application2.dto.AddToDoResponse;
import classworks.lesson29_20230628.application2.core.validation.ValidationService;
import classworks.lesson29_20230628.application2.dto.AddToDoRequest;
import classworks.lesson29_20230628.application2.dto.AddToDoResponse;
import classworks.lesson29_20230628.application2.repository.ToDoRepository;

public class AddToDoService {
  private final ToDoRepository repository;
  private final ToDoConverters converters;

  private final ValidationService validationService;

  public AddToDoService(ToDoRepository repository, ToDoConverters converters, ValidationService validationService) {
    this.repository = repository;
    this.converters = converters;
    this.validationService = validationService;
  }


  public AddToDoResponse add(AddToDoRequest request){
    System.out.println("Received request: " + request);
    // валидация данных -> на выходе будет список ошибок

    var validationResult = validationService.validate(request);

    if (!validationResult.isEmpty()) {
      System.out.println("Request validation failed, errors: " + validationResult);
      var response = new AddToDoResponse();
      response.setErrors(validationResult);
      return response;
    }

    // конвертация запроса в формат entity
    var entity = converters.convert(request);

    // отправляем полученное entity на сохранение в базу данных и получаем результат сохранения
    var createdEntity = repository.save(entity);
    System.out.println("Successfully saved: " + createdEntity);

    // подготавливаем ответ о работе нашего метода
    var response = new AddToDoResponse();
    response.setCreatedToDoId(createdEntity.getId());
    System.out.println("Sending response: " + response);

    return response;
  }




}