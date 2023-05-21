package tests.module4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

/*
Считать с консоли имя файла.
Создать копию файла в той же директории, где лежит исходный файл.
Имя копии должно быть тем же, что у исходного файла с префиксом copied_.
*/

public class Task2 {
  public static void main(String[] args) {
    String fileName = getFileName();
    createCopyFile(fileName);
  }

  private static void createCopyFile(String fileName) {
    String PREFIX_COPY_FILE = "/copied_";

    File file = new File(fileName);
    if (!file.exists()) {
      System.err.println("Source file " + fileName + " is not exists!");
      return;
    }

    Path source = file.toPath();
    Path target = new File(source.getParent() + PREFIX_COPY_FILE + source.getFileName()).toPath();

    try {
      Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      System.err.println("Error copy file " + source.getFileName() + " to " + target.getFileName());
      e.printStackTrace();
    }
  }

  private static String getFileName() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Please, enter full path file name...");
      return scanner.nextLine();
    }
  }
}
