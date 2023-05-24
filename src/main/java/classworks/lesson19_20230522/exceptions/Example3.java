package classworks.lesson19_20230522.exceptions;

import java.io.*;

public class Example3 {
  public static void main(String[] args) {
    exceptionExampleFinalBlock();
    System.out.println("Program is finish!");
  }

  public static void exceptionExampleFinalBlock(){

    try {

      File file = new File("out.txt");
      FileInputStream fis = new FileInputStream(file);
      System.out.println("inside");
      int textByte = fis.read();
      System.out.println(textByte);
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("Ошибка чтения в файл");
    }
  }
}

