package classworks.lesson_20230831;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Exch {
  public static void main(String[] args) {
    Exchanger<Action> exchanger = new Exchanger<>();

    List<Action> p1al = new ArrayList<>();
    p1al.add(Action.SCISSORS);
    p1al.add(Action.STONE);
    p1al.add(Action.SCISSORS);
    p1al.add(Action.PAPER);

    List<Action> p2al = new ArrayList<>();
    p2al.add(Action.STONE);
    p2al.add(Action.PAPER);
    p2al.add(Action.STONE);
    p2al.add(Action.PAPER);

    new Person("Pavel", p1al, exchanger);
    new Person("Ivan", p2al, exchanger);
  }
}

enum Action {
  STONE,
  SCISSORS,
  PAPER
}

class Person extends Thread {
  private String name;
  private List<Action> actionList;
  private Exchanger<Action> exchanger;

  public Person(String name, List<Action> actionList, Exchanger<Action> exchanger) {
    this.name = name;
    this.actionList = actionList;
    this.exchanger = exchanger;
  }

  private void getWinner(Action p1a, Action p2a) {
    if (p1a == Action.PAPER && p2a == Action.STONE ||
            p1a == Action.SCISSORS && p2a == Action.PAPER ||
            p1a == Action.STONE && p2a == Action.SCISSORS) {
      System.out.println("Winner : " + name);
    }
  }

  @Override
  public void run() {
    Action p1a;
    for (Action p2a : actionList) {
      try {
        p1a = exchanger.exchange(p2a);
        getWinner(p2a, p1a);
        Thread.sleep(666);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
