package classworks.lesson28_20230626.application2.repository;

import classworks.lesson28_20230626.application2.domain.ToDoEntity;

import java.util.HashMap;
import java.util.Map;

public class TaskInMemoryRepository {
  private Integer taskId = 0;
  private Map<Integer, ToDoEntity> taskMap = new HashMap<>();

  public void insert(ToDoEntity task) {
    task.setId(++taskId);
    taskMap.put(taskId, task);
  }

  public Map<Integer, ToDoEntity> findAll() {
    return taskMap;
  }

  public ToDoEntity findById(Integer id) {
    return taskMap.get(id);
  }
}
