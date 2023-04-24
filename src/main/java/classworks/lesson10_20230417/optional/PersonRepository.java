package classworks.lesson10_20230417.optional;

import java.util.Map;
import java.util.Optional;

public class PersonRepository {
  private final Map<Integer, Person> persons;

  public PersonRepository(Map<Integer, Person> persons) {
    this.persons = persons;
  }
  public Optional<Person> findById(Integer id){
    return Optional.ofNullable(this.persons.get(id));
  }
}
