package classworks.lesson17_20230515.javaio;

import classworks.lesson17_20230515.fileReaderWriter.Match;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {
  public void readFile(String fileName) throws IOException {
    BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
    String c;
    while ((c = reader1.readLine()) != null) {
      System.out.println(c);
    }
  }

  public List<Match> readObjects(String fileName){
    List<Match> matches = new ArrayList<>();
    try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))){
      boolean keepReading = true;
      while (keepReading) {
        Match match = (Match) in.readObject();
        if (!"".equals(match.getTeam1())) {
          matches.add(match);
        } else {
          keepReading = false;
        }
      }
    } catch (IOException e) {
      System.out.println("Unable to open file: " + fileName + ". Program terminates.");
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      System.out.println("Invalid object type");
      e.printStackTrace();
    }
    return matches;
  }
}
