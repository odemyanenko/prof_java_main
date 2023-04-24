package classworks.lesson8_20230403.map_key_colission;

import java.util.HashMap;
import java.util.Map;

public class ChangeKeyValue {
  public static void main(String[] args) {
    Map<PersonForCat, Cat> person = new HashMap<>();
    person.put(new PersonForCat("Petya"), new Cat("Barsik"));
  }
}
