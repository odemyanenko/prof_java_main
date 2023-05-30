package homeworks.hw5_20230524.generics;

/*
Создайте класс Stack, реализующий стек на основе массива или списка.
Используйте Generics для обеспечения типобезопасности и возможности
передачи в стек объектов разных типов.
*/

public class Task5 {
  public static void main(String[] args) {
    Stack<Integer> integerStack = new Stack<>();

    integerStack.push(10);
    integerStack.push(20);
    integerStack.push(30);

    System.out.println(integerStack);
    System.out.println("Size: " + integerStack.size());
    System.out.println("Pop: " + integerStack.pop());
    System.out.println("Peek: " + integerStack.peek());
    System.out.println("Is Empty: " + integerStack.isEmpty());

    Stack<String> stringStack = new Stack<>();

    stringStack.push("One");
    stringStack.push("Two");
    stringStack.push("Three");

    System.out.println(stringStack);
    System.out.println("Size: " + stringStack.size());
    System.out.println("Pop: " + stringStack.pop());
    System.out.println("Peek: " + stringStack.peek());
    System.out.println("Is Empty: " + stringStack.isEmpty());
  }
}
