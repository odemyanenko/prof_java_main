package classworks.lesson28_20230626.application2.service;

import classworks.lesson28_20230626.application2.repository.ToDoRepository;

public class AddToService {
  private final ToDoRepository repository;

  public AddToService(ToDoRepository repository) {
    this.repository = repository;
  }
}
