package homeworks.hw_20230801.task2;

/*
Вам дан текстовый файл, содержащий список URL-адресов.
    Найти все URL, которые содержат протокол "https://" и заменить их на "http://"
    https://www.example.com
    http://www.example.org
    https://www.example.net
    https://www.example.com/about
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    rebuildFileMitURLs("src/main/java/homeworks/hw_20230801/task2/urls.txt");
  }

  public static void rebuildFileMitURLs(String filePath) {
    List<String> updateURLs = getRebuiltURLList(filePath);
    writeFile(updateURLs, filePath);
  }

  private static void writeFile(List<String> updateURLs, String filePath) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
      for (String s : updateURLs) {
        writer.write(s);
        writer.newLine();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static List<String> getRebuiltURLList(String filePath){
    String regex = "^(https?)://www.([a-z]+).([a-z]+){3}(/[a-z]+)*$";
    List<String> updateURLs = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String strLine;
      while ((strLine = reader.readLine()) != null) {
        if (Pattern.matches(regex, strLine)) {
          strLine = strLine.replaceAll("https:", "http:");
          System.out.println(strLine);
        }
        updateURLs.add(strLine);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return updateURLs;
  }
}