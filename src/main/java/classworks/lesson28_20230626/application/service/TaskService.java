package classworks.lesson28_20230626.application.service;

import classworks.lesson28_20230626.application.domain.Task;
import classworks.lesson28_20230626.application.repository.TaskInMemoryRepository;

import java.util.Map;

public class TaskService {
  private TaskInMemoryRepository repository = new TaskInMemoryRepository();

  public Long saveTask(Task task) {
    //add validation
    repository.insert(task);
    return  task.getId();
  }

  public Map<Long, Task> findAll() {
    //check user rights
    return repository.findAll();
  }

  public Task findById(Long id) {
    //check user rights
    return repository.findById(id);
  }
}
