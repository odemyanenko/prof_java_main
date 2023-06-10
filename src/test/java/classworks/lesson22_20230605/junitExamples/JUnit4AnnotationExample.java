package classworks.lesson22_20230605.junitExamples;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JUnit4AnnotationExample {
  private ArrayList<String> list = new ArrayList<>();


  @BeforeClass
  public static void method1(){
    System.out.println("Before all test cases");
  }

  @Before
  public void method2(){
    System.out.println("Before each test case");
  }

  @Test
  public void  method3(){
    list.add("test");
    assertEquals(1, list.size());
    assertFalse(list.isEmpty());
  }

  @After
  public void method4(){
    System.out.println("After each test case");
  }

  @AfterClass
  public static void method5(){
    System.out.println("After all test cases");
  }
}
