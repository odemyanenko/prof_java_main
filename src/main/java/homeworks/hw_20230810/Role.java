package homeworks.hw_20230810;

import java.util.Objects;

public class Role {
  private static final String FORMAT_ROLE_INFO = "[%s] - %s";
  private final int id;
  private String roleName;
  private String description;

  public Role(int id, String roleName, String description) {
    this.id = id;
    this.roleName = roleName;
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public String getRoleInfo() {
    return String.format(FORMAT_ROLE_INFO, roleName, description);
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Role role)) return false;
    return id == role.id && roleName.equals(role.roleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, roleName);
  }

  @Override
  public String toString() {
    return "Role{" +
            "id=" + id +
            ", roleName='" + roleName + '\'' +
            ", description='" + description + '\'' +
            '}';
  }
}