package classworks.lesson17_20230515.javaio;

import classworks.lesson17_20230515.fileReaderWriter.Match;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Writer {
  public void formattedWriteFile() throws FileNotFoundException {
    Formatter formatter = new Formatter("BankAccount.txt");
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter clientid, clientName, clientSurName, account balance...");
    int i = 0;
    while (i < 3) {
      try {
        formatter.format("%d, %s, %s, %.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextFloat());
        i++;
      } catch (InputMismatchException e) {
        System.out.println("Input is incorrect. Please try again.");
        scanner.nextLine();
      }
    }
    formatter.close();
  }

  public void writeFile(List<Match> matches, String fileName) throws IOException {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
      for (Match match : matches) {
        writer.write("------------------------------------\n");
        writer.write("Match: " + match.getDate() + "\nTeam1: " + match.getTeam1() + "\nTeam2: " + match.getTeam2() + "\nScope: " + match.getScore() + "\n");
      }
    }
  }

  public void writeObject(List<Match> matches, String fileName) {
    try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
      for (Match match : matches) {
        outputStream.writeObject(match);
      }
      outputStream.writeObject(new Match(new Date(), "", "", "", -1, ""));
    } catch (IOException e) {
      System.out.println("File cannot be opened. Program terminated");
      e.printStackTrace();
    }
  }
}
