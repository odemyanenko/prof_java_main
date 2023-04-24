package classworks.lesson12_20230424.contactList;

import java.util.Objects;

public class Contact implements Comparable<Contact>{
  private String name;
  private String phone;

  public Contact(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Contact contact)) return false;
    return Objects.equals(name, contact.name) && Objects.equals(phone, contact.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone);
  }

  @Override
  public String toString() {
    return "Contact{" +
            "name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            '}';
  }

  @Override
  public int compareTo(Contact o) {
    return name.compareTo(o.getName());
  }
}
