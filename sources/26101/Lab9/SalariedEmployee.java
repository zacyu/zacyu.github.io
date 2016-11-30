public class SalariedEmployee extends Employee {
  private double salary;

  public SalariedEmployee(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String toString() {
    return super.toString() + "\nType: Salaried\nSalary: $" + salary;
  }

  public double pay() {
    return salary;
  }
}
