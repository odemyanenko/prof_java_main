package homeworks.hw6_20230531.task6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseTest {
  private Database db;

  @Before
  public void setUp() {
    db = new Database();
  }

  @After
  public void tearDown() {
    db.disconnect();
  }

  @Test
  public void connect() {
    db.connect();
    assertTrue(db.isConnect());
  }

  @Test
  public void disconnect() {
    db.connect();
    db.disconnect();
    assertFalse(db.isConnect());
  }
}