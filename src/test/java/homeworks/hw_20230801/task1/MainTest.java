package homeworks.hw_20230801.task1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class MainTest {

  public static final String file = "src/main/java/homeworks/hw_20230801/task1/emails.txt";


  @Test
  public void getEmailFromFileExceptionTest() {
    String wrongFile = "src/main/java/homeworks/hw_20230801/task1/emails2.txt";

    Assertions.assertThrows(RuntimeException.class, () -> Main.getEmailFromFile(wrongFile));
  }

  @Test
  public void getEmailFromFileEqualsTest() {
    List<String> expectedList = List.of(
            "john.doe@example.com",
            "jane.smith@example.org",
            "james.bond@example.com",
            "jane.smith@example.org",
            "jane.smith@example.net");

    Assertions.assertEquals(expectedList, Main.getEmailFromFile(file));
  }
}