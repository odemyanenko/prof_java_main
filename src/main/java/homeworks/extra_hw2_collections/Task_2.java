package homeworks.extra_hw2_collections;

/*
Что может хранить java.util.List: примитивные типы данных или ссылки на объекты,
или то и другое? Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_2 {
  public static void main(String[] args) {
    //Type argument cannot be of primitive type!!!
    List<Integer> listInteger = new ArrayList<>();
    List<Boolean> listBoolean = new ArrayList<>();
    List<Object> listObject = new LinkedList<>();

    System.out.println("Может хранить java.util.List: ссылки на объекты\n" +
            "Generic type arguments must be reference types.\n" +
            "Since primitives do not extend Object they cannot be used as generic type arguments for a parametrized type.\n" +
            "Instead use the Integer class which is a wrapper for int.");
  }
}
