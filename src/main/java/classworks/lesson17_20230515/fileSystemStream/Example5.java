package classworks.lesson17_20230515.fileSystemStream;

import java.io.File;
import java.util.Arrays;

public class Example5 {
  public static void main(String[] args) {
    File file = new File("testForWriting.txt");

    boolean isExists = file.exists();
    System.out.println("Does file exists: " + isExists);

    file = new File("new_dir");
    boolean wasCreate = file.mkdir();
    System.out.println("Directory was created: " + wasCreate);

    File directory = new File("new_dir");
    boolean isDir = directory.isDirectory();
    System.out.println(isDir);

//    boolean success = directory.delete();
//    System.out.println(success);

    String[] fileNames = directory.list();
    File[] files = directory.listFiles();

    System.out.println(Arrays.toString(fileNames));
    System.out.println(Arrays.toString(files));



  }
}
