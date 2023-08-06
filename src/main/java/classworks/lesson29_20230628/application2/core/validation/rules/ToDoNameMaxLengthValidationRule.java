package classworks.lesson29_20230628.application2.core.validation.rules;

import classworks.lesson29_20230628.application2.core.validation.ValidationException;
import classworks.lesson29_20230628.application2.core.validation.ValidationRule;
import classworks.lesson29_20230628.application2.dto.AddToDoRequest;

public class ToDoNameMaxLengthValidationRule implements ValidationRule {
  @Override
  public void validate(AddToDoRequest request) {
    if (request.getName().length() > 20) {
      throw new ValidationException("ToDo name length must be " +
              "less than 20, but actual name length is " +
              request.getName().length());
    }
  }
}
