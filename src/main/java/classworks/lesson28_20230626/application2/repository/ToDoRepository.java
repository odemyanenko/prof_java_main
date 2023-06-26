package classworks.lesson28_20230626.application2.repository;

import classworks.lesson28_20230626.application2.domain.ToDoEntity;

import java.util.List;
import java.util.Optional;

public interface ToDoRepository {
  ToDoEntity save(ToDoEntity entity);

  List<ToDoEntity> findAll();

  Optional<ToDoEntity> findById(Integer id);
}
