public abstract class Employee {
  private String name;

  public Employee(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return "Name: " + this.name;
  }

  public abstract double pay();
}
