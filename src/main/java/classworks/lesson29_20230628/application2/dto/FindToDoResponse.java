package classworks.lesson29_20230628.application2.dto;

import classworks.lesson29_20230628.application2.core.validation.CoreError;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FindToDoResponse {
  private List<ToDoDTO> todos;
  private List<CoreError> errors;
}