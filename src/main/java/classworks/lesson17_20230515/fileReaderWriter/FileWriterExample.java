package classworks.lesson17_20230515.fileReaderWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("writerExample.txt", true));

    bufferedWriter.newLine();
    bufferedWriter.write("Hello World");
    bufferedWriter.newLine();
    bufferedWriter.write("Second Line");

    bufferedWriter.flush();
    bufferedWriter.close();
  }
}
