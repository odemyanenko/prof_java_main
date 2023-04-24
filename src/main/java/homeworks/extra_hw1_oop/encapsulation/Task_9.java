package homeworks.extra_hw1_oop.encapsulation;

import java.util.Scanner;

/*
Разработать класс PowerCalculator, который реализует единственный метод
для возведения заданного числа в указанную степень.
Название метода, список параметров и тип возвращаемого значения
придумайте самостоятельно согласно условию задачи.

Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.

Все тестовые сценарии должны отрабатывать без ошибок.
*/
public class Task_9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PowerCalculator calculator = new PowerCalculator();

    System.out.println("Please, enter base number >: ");
    int base = scanner.nextInt();

    System.out.println("Please, enter rate number >=: ");
    int rate = scanner.nextInt();

    System.out.println(calculator.powerUp(base, rate));
  }
}
