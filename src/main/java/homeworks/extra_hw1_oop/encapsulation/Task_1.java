package homeworks.extra_hw1_oop.encapsulation;

import java.util.Scanner;

/*
Учимся разбивать задачу на подзадачи.

Дана строка с текстом.
Написать метод, который найдёт слово,
которое в тексте встречается больше всего раз.

Если несколько слов в тексте встречаются одинаково
максимальное число раз, то возвращаем то слово,
которое встречается в тексте первым.
*/
public class Task_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    WordService service = new WordService();

    System.out.println("Enter please, one sentence...");
    String text = scanner.nextLine();

    System.out.println("Most frequent word: " + service.findMostFrequentWord(text));
  }
}
