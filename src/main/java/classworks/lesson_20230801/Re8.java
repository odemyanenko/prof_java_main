package classworks.lesson_20230801;

public class Re8 {
  static void getEmpInfo(Employee e){
    System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n"
            , e.id, e.name, e.surname, e.salary*(1+e.bonusPCT));
  }

  public static void main(String[] args) {
    Employee e1 = new Employee(1, "Ivan", "Ivanov", 2500, 0.12f);
    getEmpInfo(e1);
  }
}

class Employee {
  int id;
  String name;
  String surname;
  int salary;
  float bonusPCT;

  public Employee(int id, String name, String surname, int salary, float bonusPCT) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.salary = salary;
    this.bonusPCT = bonusPCT;
  }
}
