package classworks.lesson19_20230522.exceptions;

import java.util.ArrayList;

public class StackOverFlowExample {
  public static void main(String[] args) {
    StackOverFlowExample no = new StackOverFlowExample();

    ArrayList list = new ArrayList<>();
    int count = 0;

    while (true) {
      count++;
      System.out.println(count + "; ");
      no.stackOff(count);
    }
  }

  public void stackOff(int count) {
    count++;
    System.out.println(count + "; ");
    stackOff(count);
  }
}