package classworks.lesson29_20230628.application2.core.validation.rules;

import classworks.lesson29_20230628.application2.core.validation.ValidationException;
import classworks.lesson29_20230628.application2.core.validation.ValidationRule;
import classworks.lesson29_20230628.application2.dto.AddToDoRequest;

public class ToDoNameNullValidationRule implements ValidationRule {
  @Override
  public void validate(AddToDoRequest request) {
    if (request.getName() == null) {
      throw new ValidationException("ToDo name must not be null");
    }
  }
}
