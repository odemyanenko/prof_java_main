package homeworks.hw_20230810;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoleTest {
  private static Role role;

  @BeforeEach
  void setUp() {
    role = new Role(1, "Role1", "Description1");
  }

  @AfterEach
  void tearDown() {
    role = null;
  }

  @Test
  void getRoleInfoTest() {
    String excepted = "[Role1] - Description1";
    Assertions.assertEquals(excepted, role.getRoleInfo());
  }

  @Test
  void setDescriptionNonEmptyValueTest() {
    String excepted = "new";
    role.setDescription(excepted);
    Assertions.assertEquals(excepted, role.getDescription());
  }

  @Test
  void setDescriptionEmptyValueTest() {
    role.setDescription(null);
    Assertions.assertNull(role.getDescription());
  }
}