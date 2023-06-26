package homeworks.hw7_20230619.task1;

import java.time.Duration;
import java.time.Instant;

public class UserUtils {
  public static void measureExecutionTime(Runnable task){
    Instant start = Instant.now();

    task.run();

    Instant end = Instant.now();
    Duration duration = Duration.between(start, end);

    System.out.println("Run time (ms): " + duration.toMillis());
  }
}
