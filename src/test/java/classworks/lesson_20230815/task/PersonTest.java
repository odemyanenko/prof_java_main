package classworks.lesson_20230815.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

  @Test
  void isAdultTest() {
    Person personAdult = new Person("person1", 25, "address1", "email1");
    Person personChild = new Person("person2", 5, "address2", "email2");
    Assertions.assertTrue(personAdult.isAdult());
    Assertions.assertFalse(personChild.isAdult());
  }
}