package classworks.lesson12_20230424.contactList;

/*
Задача: Управление списком

        Требования:
        Реализовать класс Contact с полями name (тип данных String) и phoneNumber (тип данных String).
        Реализовать класс ContactManager, который будет управлять списком контактов.
        Класс ContactManager должен содержать следующие методы:
        addContact(Contact contact): добавляет контакт в список. Если контакт с таким именем и
        номером телефона уже существует, необходимо выдать сообщение об ошибке.
        removeContact(Contact contact): удаляет контакт из списка.
        getContacts(): возвращает список всех контактов.
        getContactByName(String name): возвращает контакт по имени.
        getContactByPhoneNumber(String phoneNumber): возвращает контакт по номеру телефона.
*/
public class ContactApplication {
  public static void main(String[] args) {
    ContactManager manager = new ContactManager();


    Contact contact1 = new Contact("Petrov", "11111");
    Contact contact2 = new Contact("Sidorov", "11111");
    Contact contact3 = new Contact("Ivanov", "22222");
    Contact contact4 = new Contact("Pushkin", "33333");
    Contact contact5 = new Contact("Petrov", "11111");

    manager.addContact(contact1);
    manager.addContact(contact2);
    manager.addContact(contact3);
    manager.addContact(contact4);
    manager.addContact(contact5);
    manager.getContacts();

    manager.removeContact(contact1);
    manager.getContacts();

    System.out.println(manager.getContactByName("Pushkin"));
    System.out.println(manager.getContactByPhoneNumber("11111"));

  }
}
