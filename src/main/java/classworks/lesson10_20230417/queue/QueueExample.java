package classworks.lesson10_20230417.queue;

import java.util.*;

public class QueueExample {
  public static void main(String[] args) {
    int time = 100;

    Queue<Integer> queue = new LinkedList<>();
    List<Integer> list = new LinkedList<>();
    Deque<Integer> deque = new LinkedList<>();
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

    for (int i = 0; i < time; i++) {
      queue.add(i);
    }

    while (!queue.isEmpty()){
      queue.poll();
      System.out.println(queue);
    }

    System.out.println();
    System.out.println(queue);

    System.out.println("-------------------------");
    priorityQueue.add(1);
    priorityQueue.add(2);
    priorityQueue.add(3);
    priorityQueue.offer(22);

    for (int i: priorityQueue) {
      /////////
    }
  }
}
