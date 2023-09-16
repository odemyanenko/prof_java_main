package classworks.lesson_20230914;

public class Employee {
  private String firstName;
  private String lastName;

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public String getInitials() {
    return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
  }

  public String getEmail() {
    return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@company.com";
  }
}

class Employee_Impl {
  private static final String SEPARATOR_DOT = ".";
  private static final String COMPANY_DOMAIN = "@company.com";
  private String firstName;
  private String lastName;

  public Employee_Impl(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public String getInitials() {
    return makeInitials(firstName) + makeInitials(lastName);
  }

  public String getEmail() {
    return firstName.toLowerCase() + "." + lastName.toLowerCase() + COMPANY_DOMAIN;
  }

  private String makeInitials(String name) {
    return (!name.isEmpty()) ? name.substring(0, 1) + "." : "";
  }
}
