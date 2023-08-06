package classworks.lesson29_20230628.application2.repository;

import classworks.lesson29_20230628.application2.domain.ToDoEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class ArrayListToDoRepository implements ToDoRepository{

  private Integer idSequence = 0;

  private List<ToDoEntity> database = new ArrayList<>();


  @Override
  public ToDoEntity save(ToDoEntity entity) {
    if (entity.getId() != null) {
      return update(entity);
    } else {
      entity.setId(++idSequence);
      database.add(entity);
    }
    return entity;
  }

  private ToDoEntity update(ToDoEntity entity) {
    for (int i = 0; i < database.size(); i++) {
      var existingEntity = database.get(i);
      if (existingEntity.getId().equals(entity.getId())){
        database.set(i, entity);
        return entity;
      }
    }
    throw new IllegalStateException("Failed to update");
  }

  @Override
  public List<ToDoEntity> findAll() {
    return database;
  }

  @Override
  public Optional<ToDoEntity> findById(Integer id) {
    return database.stream()
            .filter(entity -> entity.getId().equals(id))
            .findFirst();
  }


}