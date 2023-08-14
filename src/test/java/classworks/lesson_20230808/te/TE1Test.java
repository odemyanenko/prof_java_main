package classworks.lesson_20230808.te;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class TE1Test {

  private static final TE1 te = new TE1();
  private static final int A = 10;
  private static final int B = 5;

  @Test
  public void getSumTest() {
    Assert.assertEquals(15, te.getSum(A, B));
  }

  @Test
  public void getDividePositiveTest() {
    Assert.assertEquals(2, te.getDivide(A, B));
  }

  @Test
  public void getDivideExceptionByZeroTest() {
    int c = 0;

    Assertions.assertThrows(ArithmeticException.class, () -> te.getDivide(A, c));
  }
}