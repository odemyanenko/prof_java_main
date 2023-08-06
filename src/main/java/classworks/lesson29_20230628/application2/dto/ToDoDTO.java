package classworks.lesson29_20230628.application2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDoDTO {
  private String name;
  private String description;
}