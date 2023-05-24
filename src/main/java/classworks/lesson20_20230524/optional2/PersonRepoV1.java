package classworks.lesson20_20230524.optional2;

import java.util.Map;
import java.util.Optional;

public class PersonRepoV1 {
  private final Map<Long, Person> persons;


  public PersonRepoV1(Map<Long, Person> persons) {
    this.persons = persons;
  }

  public Optional<Person> findById(Long id){
    return Optional.ofNullable(persons.get(id));
  }

  public void addPerson(long id, Person person) {
    persons.put(id,person);
  }
}
