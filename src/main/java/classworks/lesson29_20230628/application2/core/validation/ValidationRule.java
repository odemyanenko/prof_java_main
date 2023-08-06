package classworks.lesson29_20230628.application2.core.validation;

import classworks.lesson29_20230628.application2.dto.AddToDoRequest;

public interface ValidationRule {

  void validate(AddToDoRequest request);
}