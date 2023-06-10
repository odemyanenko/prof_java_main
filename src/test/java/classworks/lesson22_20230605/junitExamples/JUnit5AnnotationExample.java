package classworks.lesson22_20230605.junitExamples;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class JUnit5AnnotationExample {
  private ArrayList<String> list = new ArrayList<>();

  @BeforeAll
  public static void method1(){
    System.out.println("Before all test cases");
  }

  @BeforeEach
  public void method2(){
    System.out.println("Before each test case");
  }

  @Test
  public void  method3(){
    list.add("test");
    assertEquals(1, list.size());
    assertFalse(list.isEmpty());
  }

  @AfterEach
  public void method4(){
    System.out.println("After each test case");
  }

  @AfterAll
  public static void method5(){
    System.out.println("After all test cases");
  }
}
