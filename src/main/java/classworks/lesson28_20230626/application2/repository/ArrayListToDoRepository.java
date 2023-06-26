package classworks.lesson28_20230626.application2.repository;

import classworks.lesson28_20230626.application2.domain.ToDoEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArrayListToDoRepository implements ToDoRepository {
  private Integer idSequence = 0;
  private List<ToDoEntity> db = new ArrayList<>();

  @Override
  public ToDoEntity save(ToDoEntity entity) {
    if (entity.getId() != null){
      return update(entity);
    } else {
      entity.setId(++idSequence);
      db.add(entity);
    }
    return entity;
  }

  private ToDoEntity update(ToDoEntity entity){
    for (int i = 0; i < db.size(); i++) {
      var existingEntity = db.get(i);
      if (existingEntity.getId().equals(entity.getId())){
        db.set(i, entity);
        return entity;
      }
    }
    throw new IllegalStateException("Failed to update");
  }

  @Override
  public List<ToDoEntity> findAll() {
    return db;
  }

  @Override
  public Optional<ToDoEntity> findById(Integer id) {
    return db.stream()
            .filter(e->e.getId().equals(id))
            .findFirst();
  }
}
