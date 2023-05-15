package classworks.lesson17_20230515.fileSystemStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputAndOutputStreamExample {
  public static void main(String[] args) throws IOException {
    outputExample();
    inputExample();
  }

  public static void outputExample() throws IOException {
    String path = "test_stream.txt";

    FileOutputStream outputStream = new FileOutputStream(path);
    outputStream.write("\n Hello from java output stream".getBytes());
    outputStream.close();
  }

  public static void inputExample() throws IOException {
    String path = "test_stream.txt";

    FileInputStream inputStream = new FileInputStream(path);
    int inputData = inputStream.read();

    while (inputData != -1){
      System.out.println((char) + inputData + " ");
      inputData = inputStream.read();
    }
    inputStream.close();
  }
}
