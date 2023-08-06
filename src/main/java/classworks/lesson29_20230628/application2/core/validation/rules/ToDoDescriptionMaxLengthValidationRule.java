package classworks.lesson29_20230628.application2.core.validation.rules;

import classworks.lesson29_20230628.application2.core.validation.ValidationException;
import classworks.lesson29_20230628.application2.core.validation.ValidationRule;
import classworks.lesson29_20230628.application2.dto.AddToDoRequest;

public class ToDoDescriptionMaxLengthValidationRule implements ValidationRule {
  @Override
  public void validate(AddToDoRequest request) {
    if (request.getDescription().length() > 25) {
      throw new ValidationException("ToDo description length must be " +
              "less than 25, but actual name length is " +
              request.getDescription().length());
    }
  }
}