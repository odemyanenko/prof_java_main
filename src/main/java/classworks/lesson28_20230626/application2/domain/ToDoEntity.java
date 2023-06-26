package classworks.lesson28_20230626.application2.domain;

import lombok.Data;

import java.util.Objects;

@Data
public class ToDoEntity {
  private Integer id;
  private String name;
  private String description;
}
