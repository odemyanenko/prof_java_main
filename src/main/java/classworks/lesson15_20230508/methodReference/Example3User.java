package classworks.lesson15_20230508.methodReference;

public class Example3User {
  public static void main(String[] args) {
    UserFactory userFactory = User::new;
    UserFactory userFactory1 = (name, surname) -> new User(name, surname);

    User user = userFactory.create("John", "Smith");
    User user1 =userFactory1.create("Bill", "Murray");

    System.out.println(user);
    System.out.println(user1);
  }
}