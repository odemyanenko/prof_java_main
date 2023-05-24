package classworks.lesson20_20230524.optional;

import java.util.Map;

public class PersonRepoV1 {
  private final Map<Long, Person> persons;


  public PersonRepoV1(Map<Long, Person> persons) {
    this.persons = persons;
  }

  public Person findById(Long id){
    return persons.get(id);
  }

  public void addPerson(long id, Person person) {
    persons.put(id,person);
  }
}