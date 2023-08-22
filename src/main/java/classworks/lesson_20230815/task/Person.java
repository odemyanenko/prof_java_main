package classworks.lesson_20230815.task;

/*
Классы:
Person:
Поля:
String name
int age
String address
String email
Методы:

Конструктор с параметрами для инициализации полей.
String getSummary() - возвращает строку, содержащую информацию о человеке (имя, возраст, адрес).
boolean isAdult() - проверяет, является ли человек совершеннолетним (возраст >= 18).
void sendEmail(String message) - имитирует отправку электронной почты.
* */

import java.util.Objects;

public class Person implements Comparable<Person>{
  public static final int AGE_ADULT = 18;
  private String name;
  private int age;
  private String address;
  private String email;

  public Person(String name, int age, String address, String email) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  // - возвращает строку, содержащую информацию о человеке (имя, возраст, адрес).
  public String getSummary(){
    return String.format("%s (%d) - [%s]", this.name, this.age, this.address);
  }

  //- проверяет, является ли человек совершеннолетним (возраст >= 18).
  public boolean isAdult(){
    return (this.age >= AGE_ADULT);
  }

  // - имитирует отправку электронной почты.
  public void sendEmail(String message){
    System.out.println("Email was sent by " + email);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person person)) return false;
    return age == person.age && name.equals(person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public int compareTo(Person o) {
    int nameCompare = this.name.compareTo(o.name);
    if (nameCompare == 0) {
      return Integer.compare(this.age, o.age);
    }
    return nameCompare;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", address='" + address + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
