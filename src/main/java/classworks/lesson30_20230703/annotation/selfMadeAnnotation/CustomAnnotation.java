package classworks.lesson30_20230703.annotation.selfMadeAnnotation;

public @interface CustomAnnotation {

  int value();
  String[] names();

  Color color();

  Class<Person> getPersonInfo();


}