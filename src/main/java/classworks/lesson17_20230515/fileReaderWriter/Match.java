package classworks.lesson17_20230515.fileReaderWriter;

import java.util.Date;

public class Match {
  private Date date;
  private String team1;
  private String score;
  private String team2;
  private int count;
  private String stadium;

  public Match(Date date, String team1, String score, String team2, int count, String stadium) {
    this.date = date;
    this.team1 = team1;
    this.score = score;
    this.team2 = team2;
    this.count = count;
    this.stadium = stadium;
  }

  public Date getDate() {
    return date;
  }

  public String getTeam1() {
    return team1;
  }

  public String getScore() {
    return score;
  }

  public String getTeam2() {
    return team2;
  }

  public int getCount() {
    return count;
  }

  public String getStadium() {
    return stadium;
  }

  @Override
  public String toString() {
    return "Match{" +
            "date=" + date +
            ", team1='" + team1 + '\'' +
            ", score='" + score + '\'' +
            ", team2='" + team2 + '\'' +
            ", count=" + count +
            ", stadium='" + stadium + '\'' +
            '}';
  }
}
