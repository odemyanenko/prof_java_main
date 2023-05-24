package classworks.lesson19_20230522.requestResponseModel.database;

import classworks.lesson19_20230522.requestResponseModel.entity.ToDoEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ToDoRepository implements Repository<ToDoEntity> {

  private List<ToDoEntity> database = new ArrayList<>();

  @Override
  public void save(ToDoEntity entity) {
    database.add(entity);
    System.out.println("Success add!");
  }

  @Override
  public List<ToDoEntity> findAll() {
    return database;
  }

  @Override
  public Optional<ToDoEntity> findByID() {
    return Optional.empty();
  }
}