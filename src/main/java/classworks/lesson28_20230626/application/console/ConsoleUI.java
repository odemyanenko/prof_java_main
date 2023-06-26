package classworks.lesson28_20230626.application.console;

import classworks.lesson28_20230626.application.domain.Task;
import classworks.lesson28_20230626.application.service.TaskService;

import java.util.Scanner;

public class ConsoleUI {
  private TaskService service = new TaskService();

  public void execute() {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      try {
        System.out.println("1. Create task");
        System.out.println("2. Find all task");
        System.out.println("3. Find task by ID");
        System.out.println("4. Exit");

        int useInput = scanner.nextInt();

        switch (useInput) {
          case 1:
            long newId = createTask();
            System.out.println("Create success! New task id: " + newId);
            break;
          case 2:
            System.out.println(service.findAll());
            break;
          case 3:
            Task task = findTask();
            if (task != null) {
              System.out.println(task);
            } else {
              System.out.println("Task not found!");
            }
            break;
          case 4:
            return;
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  private long createTask() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter task name...");
    String name = scanner.nextLine();
    System.out.println("Please, enter task description...");
    String description = scanner.nextLine();

    Task newTask = new Task();
    newTask.setName(name);
    newTask.setDescription(description);

    return service.saveTask(newTask);
  }

  private Task findTask() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter task id...");
    Long id = scanner.nextLong();
    return service.findById(id);
  }
}
