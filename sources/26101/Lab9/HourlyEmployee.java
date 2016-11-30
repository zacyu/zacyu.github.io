public class HourlyEmployee extends Employee {
  private double payRate;
  private int hours;

  public HourlyEmployee(String name, double payRate, int hours) {
    super(name);
    this.payRate = payRate;
    this.hours = hours;
  }

  public double getPayRate() {
    return payRate;
  }

  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  public String toString() {
    return super.toString() + "\nType: Hourly\nPay Rate: $" + payRate + "\nHours: " + hours;
  }

  public double pay() {
    return payRate * hours;
  }
}
