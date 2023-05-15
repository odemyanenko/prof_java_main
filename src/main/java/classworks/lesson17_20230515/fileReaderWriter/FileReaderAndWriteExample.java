package classworks.lesson17_20230515.fileReaderWriter;

import java.io.*;

public class FileReaderAndWriteExample {
  public static void main(String[] args) throws IOException {
    FileReader fileReader = new FileReader("writeExample.txt");
    BufferedReader reader = new BufferedReader(fileReader);

    BufferedWriter writer = new BufferedWriter(new FileWriter("writerExampleDouble.txt"));

    String line = "";

    while ((line = reader.readLine())!= null) {
      System.out.println(line);
      writer.write(line);
      writer.newLine();

    }

    writer.flush();
    writer.close();
    reader.close();
  }
}
