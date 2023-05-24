package classworks.lesson19_20230522.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Example2 {
  public static void main(String[] args) {
    exceptionExampleFinalBlock();
    System.out.println("Program is finish!");
  }

  public static void exceptionExampleFinalBlock() {
    FileWriter writer = null;
    try {
      writer = new FileWriter("out.txt");
      writer.write("Writing to the file");
      System.out.println("File write successfully");
    } catch (IOException e) {
        System.out.println("Error write in file");
    } finally {
        if (writer != null) {
          try {
            writer.close();
          } catch (IOException e) {
              System.out.println("Error close file");
          }
        }
    }
  }
}
