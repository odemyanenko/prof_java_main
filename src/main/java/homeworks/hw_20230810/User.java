package homeworks.hw_20230810;

import java.util.*;

public class User {
  private static final String FORMAT_USER_INFO = "[%s] - %s";
  private final int id;
  private final String userName;
  private String email;
  private List<Role> roles;
  private String password;
  private boolean access;

  public User(int id, String userName, String email) {
    this.id = id;
    this.userName = userName;
    this.email = email;
    this.access = false;
    this.roles = new ArrayList<>();
  }

  public int getId() {
    return id;
  }

  public String getUserName() {
    return userName;
  }

  public String getPassword() {
    return password;
  }

  public List<Role> getRoles() {
    return Collections.unmodifiableList(roles);
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setAccess(boolean access) {
    this.access = access;
  }

  public String getUserInfo() {
    return String.format(FORMAT_USER_INFO, userName, email);
  }

  public void addRole(Role role) {
    if (role == null) {
      throw new IllegalArgumentException();
    }
    if (roles.contains(role)) {
      return;
    }
    roles.add(role);
  }

  public void removeRole(Role role) {
    if (role == null) {
      throw new IllegalArgumentException("Role cannot be null");
    }
    if (!roles.contains(role)) {
      throw new NoSuchElementException("Role not found");
    }
    roles.remove(role);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof User user)) return false;
    return id == user.id && userName.equals(user.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userName);
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", userName='" + userName + '\'' +
            ", email='" + email + '\'' +
            ", roles=" + roles +
            ", password='" + password + '\'' +
            ", access=" + access +
            '}';
  }
}