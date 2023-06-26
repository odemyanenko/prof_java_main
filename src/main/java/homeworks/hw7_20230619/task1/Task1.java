package homeworks.hw7_20230619.task1;

/*
1. Дан массив n-элементов. Вычислить колличество заданного символа K.
   Выполнить обработку массива двумя способами: без потоков и с потоками.
*/

import java.util.Arrays;

public class Task1 {
  public static void main(String[] args) {
    int size = 100_000_000;
    int[] array = ArrayUtils.createAndFillRandomNumber(size, 1, 10);
    int findNumber = 4;

//    System.out.println("Original array: ");
//    System.out.println(Arrays.toString(array));

    System.out.println("------------------------------------------------");
    System.out.println("Calculate without threads:");
    System.out.printf("Count Number(%d) = %d\n", findNumber, ArrayUtils.getCountNumber(array, findNumber));
    UserUtils.measureExecutionTime(()->ArrayUtils.getCountNumber(array, findNumber));

    System.out.println("------------------------------------------------");
    System.out.println("Calculate with 3 threads:");
    System.out.printf("Count Number(%d) = %d\n", findNumber, ArrayUtils.getCounterNumberByMultiThreads(array, size, findNumber));
    UserUtils.measureExecutionTime(()->ArrayUtils.getCounterNumberByMultiThreads(array, size, findNumber));
  }
}
