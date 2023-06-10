package classworks.lesson21_20230531.junit.test2Example;

import java.util.StringTokenizer;

public class StringReverse2 {
  // на вход подается строка
  // нам нужно вернуть строку в которой слова изменены реверсивно, но порядок слов сохранен

  public  String reverseWord(String str){
    StringBuilder result = new StringBuilder();

    StringTokenizer tokenizer = new StringTokenizer(str, " ");

    while (tokenizer.hasMoreTokens()){
      StringBuilder sb = new StringBuilder();
      sb.append(tokenizer.nextToken());
      sb.reverse();

      result.append(sb);
      result.append(" ");
    }
    return result.toString().trim();
  }

}