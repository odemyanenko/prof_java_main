package classworks.lesson23_20230607.multithreading;

public class MyFirstThread extends Thread{
  @Override
  public void run(){
    System.out.println("I'm Thread! My name is " + getName());
  }
}