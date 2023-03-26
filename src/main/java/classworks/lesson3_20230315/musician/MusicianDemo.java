package classworks.lesson3_20230315.musician;

public class MusicianDemo {
  public static void main(String[] args) {
    RockMusician rockMusician = new RockMusician("John");
    Singer singer = new RockMusician("Bill");
    Dancer dancer = new PopMusician();

    rockMusician.sing();
    rockMusician.dance();

    Singer[] singers = {
            new PopMusician(),
            new RockMusician("Inav"),
            new PopMusician()
    };

    Dancer[] dancers = {
            new RockMusician("Steam"),
            new PopMusician(),
            new RockMusician("James"),
            new PopMusician()
    };

    Musician[] musicians = {
            new PopMusician(),
            new PopMusician(),
            new PopMusician(),
            new PopMusician(),
            new RockMusician("Viktor"),
            new PopMusician()
    };

    MusicianUtil musicianUtil = new MusicianUtil();
    musicianUtil.singAll(singers);
    musicianUtil.danceAll(dancers);
    System.out.println("==========================");
    musicianUtil.singAll(musicians);
    musicianUtil.danceAll(musicians);
  }
}
