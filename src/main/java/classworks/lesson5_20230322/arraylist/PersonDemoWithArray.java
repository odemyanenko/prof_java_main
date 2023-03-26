package classworks.lesson5_20230322.arraylist;

import java.util.Arrays;

public class PersonDemoWithArray {
  public static void main(String[] args) {


    Person[] persons = new Person[5];
    persons = getPersons(persons);
    introduce(persons);

    System.out.println(Arrays.toString(persons));


  }

  static Person[] getPersons(Person[] persons) {
    persons = putPerson(persons, "Ruslan", 29, 113125124524l);
    persons = putPerson(persons, "Viktor", 35, 536235623);
    persons = putPerson(persons, "Alex", 21, 2352345);
    persons = putPerson(persons, "John", 42, 2352346);
    persons = putPerson(persons, "Andrew", 39, 562562);
    persons = putPerson(persons, "Elena", 18, 25242445);
    persons = putPerson(persons, "Olga", 18, 262362362365l);

    return persons;
  }

  private static Person[] putPerson(Person[] persons, String name, int age, long personalCode) {
    if (persons[persons.length - 1] == null) {
      addToDatabase(persons, new Person(name, age, personalCode));
    } else {
      persons = increaseDatabase(persons);
      addToDatabase(persons, new Person(name, age, personalCode));
    }
    return persons;
  }

  private static Person[] increaseDatabase(Person[] oldArray) {
    Person[] newArray = new Person[oldArray.length + 1];
    for (int i = 0; i < oldArray.length; i++) {
      newArray[i] = oldArray[i];
    }
    return newArray;
  }

  private static void addToDatabase(Person[] persons, Person newPerson) {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] == null) {
        persons[i] = newPerson;
        return;
      }
    }
  }

  private static void introduce(Person[] persons) {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null) {
        System.out.println(persons[i]);
        persons[i].say();
      }
    }
  }

}
