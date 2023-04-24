package classworks.lesson12_20230424.contactList;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*addContact(Contact contact): добавляет контакт в список. Если контакт с таким именем и
номером телефона уже существует, необходимо выдать сообщение об ошибке.
removeContact(Contact contact): удаляет контакт из списка.
getContacts(): возвращает список всех контактов.
getContactByName(String name): возвращает контакт по имени.
getContactByPhoneNumber(String phoneNumber): возвращает контакт по номеру телефона.*/

public class ContactManager {
  private Set<Contact> contacts = new HashSet<>();

  public void addContact(Contact contact) {
    if (!contacts.contains(contact)) {
      contacts.add(contact);
      System.out.println("Contact " + contact.getName() + " added.");
    } else {
      System.out.println("Contact " + contact.getName() + " already exist!");
    }
  }

  public boolean removeContact(Contact contact) {
    if (!contacts.contains(contact)) {
      System.out.println("Contact " + contact.getName() + " removed.");
      return contacts.remove(contact);
    } else {
      System.out.println("Contact " + contact.getName() + " not exist!");
      return false;
    }
  }

  public void getContacts() {
    TreeSet<Contact> contactsSort = new TreeSet<>(contacts);
    System.out.println(contactsSort);
  }

  public Contact getContactByName(String name) {
    for (Contact contact: contacts
         ) {
      if (contact.getName().equals(name)){
        return contact;
      }
    }
    return null;
  }

  public Contact getContactByPhoneNumber(String phoneNumber) {
    for (Contact contact: contacts
    ) {
      if (contact.getPhone().equals(phoneNumber)){
        return contact;
      }
    }
    return null;
  }
}
