package classworks.lesson29_20230628.application2.core.validation;

import classworks.lesson29_20230628.application2.dto.AddToDoRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ValidationService {

  private final List<ValidationRule> validationRules;

  public ValidationService(List<ValidationRule> validationRules) {
    this.validationRules = validationRules;
  }

  public List<CoreError> validate(AddToDoRequest request) {
    List<CoreError> errors = new ArrayList<>();
    if (request == null) {
      errors.add(new CoreError("ToDo must be not null"));
      return errors;
    }

    return validationRules.stream()
            .map(rule -> useValidateRule(rule, request))
            .filter(Objects::nonNull)
            .toList();
  }

  private CoreError useValidateRule(ValidationRule rule, AddToDoRequest request) {
    try {
      rule.validate(request);
    } catch (ValidationException e) {
      return new CoreError(e.getMessage());
    }
    return null;
  }
}