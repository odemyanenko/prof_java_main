package classworks.lesson30_20230703.annotation.selfMadeAnnotation2;

@Company(name = "Apple", city = "NY")
public class CustomAnnotationEmployee2 {
  private int id;
  private String name;

  public CustomAnnotationEmployee2(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void getEmployeeDetails(){
    System.out.println("Employee Id = " + id);
    System.out.println("Employee Name = " + name);
  }
}
