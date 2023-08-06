package classworks.lesson29_20230628.application2.core.validation.rules;

import classworks.lesson29_20230628.application2.core.validation.ValidationException;
import classworks.lesson29_20230628.application2.core.validation.ValidationRule;
import classworks.lesson29_20230628.application2.dto.AddToDoRequest;

public class ToDoNameMinLengthValidationRule implements ValidationRule {
  @Override
  public void validate(AddToDoRequest request) {
    if (request.getName().length() < 3) {
      throw new ValidationException("ToDo name length must be " +
              "greater than 3, but actual name length is " +
              request.getName().length());
    }
  }
}
