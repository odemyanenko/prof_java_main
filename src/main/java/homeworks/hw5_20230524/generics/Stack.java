package homeworks.hw5_20230524.generics;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
  private List<E> stack = new ArrayList<>();

  public Stack() {
  }

  public void push(E elem){
    stack.add(elem);
  }

  public E pop(){
    if  (isEmpty()){
      System.out.println("Stack is empty!");
      return null;
    }
    return stack.remove(stack.size() - 1);
  }

  public E peek(){
    if  (isEmpty()){
      System.out.println("Stack is empty!");
      return null;
    }
    return stack.get(stack.size() - 1);
  }

  public boolean isEmpty(){
    return stack.isEmpty();
  }

  public int size(){
    return stack.size();
  }

  @Override
  public String toString() {
    return "Stack{" +
            "stack=" + stack +
            '}';
  }
}
