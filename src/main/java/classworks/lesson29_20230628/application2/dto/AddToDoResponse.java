package classworks.lesson29_20230628.application2.dto;

import classworks.lesson29_20230628.application2.core.validation.CoreError;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AddToDoResponse {
  private Integer createdToDoId;
  private List<CoreError> errors;

}