package classworks.lesson17_20230515.fileReaderWriter;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MatchesDemo {
  private static final String FILE_NAME= "matches_new.txt";

  public static void main(String[] args) throws IOException, ParseException {
    List<Match> matches = new ArrayList<>();

    FileReader fileReader = new FileReader("src/main/java/classworks/lesson17_20230515/fileReaderWriter/matches.txt");
    BufferedReader reader = new BufferedReader(fileReader);

    String line = "";

    while ((line = reader.readLine()) != null) {
//      System.out.println(line);
      Match match = createMatch(line);
      matches.add(match);
    }

    reader.close();

    matches.stream()
            .forEach(System.out::println);

    //write to file
    writeFile(matches);
    readFile();
  }

  private static void readFile() throws IOException {
    BufferedReader reader1 = new BufferedReader(new FileReader(FILE_NAME));
    String c;
    while ((c = reader1.readLine()) != null){
      System.out.println(c);
    }
  }

  private static void writeFile(List<Match> matches) throws IOException {
    try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
      for (Match match : matches) {
        writer.write("------------------------------------\n");
        writer.write("Match: " + match.getDate() + "\nTeam1: " + match.getTeam1() + "\nTeam2: " + match.getTeam2() + "\nScope: " + match.getScore() + "\n");
      }
    }
  }

  private static Match createMatch(String matchStr) throws ParseException {
    String[] match = matchStr.split(", ");

    return new Match(
            new SimpleDateFormat("dd/MM/yyyy").parse(match[2] + "/" + match[1] + "/" + match[0]),
            match[3],
            match[4],
            match[5],
            Integer.parseInt(match[6].replace("NULL", "0")),
            match[7]
    );
  }
}
