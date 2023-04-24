package classworks.lesson12_20230424.brackets;

/*
Реализовать систему, которая проверяет правильность расстановки скобок в строке.
Необходимо использовать коллекцию Stack в Java для реализации алгоритма.

"()"; // Правильное расположение скобок      "([{}])"; // Правильное расположение скобок
        String input3 = "({[]})"; // Правильное расположение скобок
        String input4 = "({[})"; // Неправильное расположение скобок

*/

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    String input1 = "([{}])";
    System.out.println("Is Correct brackets: " + input1 + " - " + checkCorrectBrackets(input1));
    String input2 = "({[]})";
    System.out.println("Is Correct brackets: " + input2 + " - " + checkCorrectBrackets(input2));
    String input3 = "({[})";
    System.out.println("Is Correct brackets: " + input3 + " - " + checkCorrectBrackets(input3));
    String input4 = "()()()";
    System.out.println("Is Correct brackets: " + input4 + " - " + checkCorrectBrackets(input4));
    String input5 = "()()(}";
    System.out.println("Is Correct brackets: " + input5 + " - " + checkCorrectBrackets(input5));
  }

  private static boolean checkCorrectBrackets(String string) {
    Stack<Character> bracketsOpen1 = new Stack<>();
    Stack<Character> bracketsOpen2 = new Stack<>();
    Stack<Character> bracketsOpen3 = new Stack<>();

    char[] charsInString = string.toCharArray();

    for (int i = 0; i < charsInString.length; i++) {

      fillBracket(charsInString[i], '(', bracketsOpen1, ')');
      fillBracket(charsInString[i], '[', bracketsOpen2, ']');
      fillBracket(charsInString[i], '{', bracketsOpen3, '}');
    }

    return bracketsOpen1.empty() && bracketsOpen2.empty() && bracketsOpen3.empty();
  }

  private static void fillBracket(char bracket, char x, Stack<Character> bracketsOpen1, char x1) {
    if (bracket == x) {
      bracketsOpen1.push(bracket);
    } else if (bracket == x1) {
      if (!bracketsOpen1.empty()) {
        bracketsOpen1.pop();
      }
    }
  }
}
