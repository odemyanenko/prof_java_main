package classworks.lesson28_20230626.application2.service;

import classworks.lesson28_20230626.application2.domain.ToDoEntity;
import classworks.lesson28_20230626.application2.repository.TaskInMemoryRepository;

import java.util.Map;

public class TaskService {
  private TaskInMemoryRepository repository = new TaskInMemoryRepository();

  public Integer saveTask(ToDoEntity task) {
    //add validation
    repository.insert(task);
    return  task.getId();
  }

  public Map<Integer, ToDoEntity> findAll() {
    //check user rights
    return repository.findAll();
  }

  public ToDoEntity findById(Integer id) {
    //check user rights
    return repository.findById(id);
  }
}
