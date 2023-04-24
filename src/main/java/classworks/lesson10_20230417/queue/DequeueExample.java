package classworks.lesson10_20230417.queue;

import java.util.*;

public class DequeueExample {
  public static void main(String[] args) {
    int time = 100;

    Deque<Integer> deque = new LinkedList<>();
    for (int i = 0; i < time; i++) {
      deque.add(i);
    }

    System.out.println(deque);
  }
}
