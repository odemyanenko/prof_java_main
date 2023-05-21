package classworks.lesson17_20230515.fileReaderWriter;

import classworks.lesson17_20230515.javaio.Reader;
import classworks.lesson17_20230515.javaio.Writer;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class MatchesDemo {
  private static final String FILE_NAME = "matches_new.txt";
  private static final String BINARY_FILE = "matches.bin";

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


    //=========================================
    Reader reader1 = new Reader();
    Writer writer = new Writer();
    //write to file
    writer.writeFile(matches, FILE_NAME);

    //MyJavaVideo
    reader1.readFile(FILE_NAME);

    writer.writeObject(matches, BINARY_FILE);
    List<Match> matchList = reader1.readObjects(BINARY_FILE);
    matchList.forEach(System.out::println);

//    writer.formattedWriteFile();
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
