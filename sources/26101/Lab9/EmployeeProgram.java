public class EmployeeProgram {
  public static void main(String[] args) {
    //Create a 5-element array of type Employee called 'employees'
    Employee[] employees = new Employee[5];

    // TODO: Add 2 SalariedEmployee objects, 2 HourlyEmployee objects, and
    // 1 SalesEmployee object to the array (make up your own data for the objects)
	employees[0] = new SalariedEmployee("Phil Clarkson", 2000.00);
	employees[1] = new SalariedEmployee("Keith Ball", 3076.08);
	employees[2] = new HourlyEmployee("Michelle Piper", 28.85, 60);
	employees[3] = new HourlyEmployee("Jennifer Blake", 10.00, 80);
	employees[4] = new SalesEmployee("Carl Greene", 40, 30.35);
    // TODO: Write a for-loop that iterates through the array and prints a description
    // of each object by calling toString in a print statement.
	for (int i = 0; i < 5; i++) {
		System.out.println(employees[i] + "\n");
	}
	
	System.exit(0);
  }
}
