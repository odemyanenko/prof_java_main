package classworks.lesson29_20230628.application2.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddToDoRequest {
  private String name;
  private String description;
}