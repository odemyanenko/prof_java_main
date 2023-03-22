package lesson5_20230322.arraylist;

import java.util.Objects;

public class Person {
  private String name;
  private int age;
  private long personalCode;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public long getPersonalCode() {
    return personalCode;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void say() {
    System.out.println("Hello! My name is " + name);
  }

  public Person(String name, int age, long personalCode) {
    this.name = name;
    this.age = age;
    this.personalCode = personalCode;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", personalCode=" + personalCode +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person person)) return false;
    return age == person.age && personalCode == person.personalCode && Objects.equals(name, person.name);
  }

}
