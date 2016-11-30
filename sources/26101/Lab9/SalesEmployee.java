public class SalesEmployee extends Employee {
  private int numWidgetsSold;
  private double ratePerWidget;

  public SalesEmployee(String name, int numWidgetsSold, double ratePerWidget) {
    super(name);
    this.numWidgetsSold = numWidgetsSold;
	this.ratePerWidget = ratePerWidget;
  }

  // Set and get methods for numWidgetsSold
  public int getNumWidgetsSold() {
	  return this.numWidgetsSold;
  }
  
  public void setNumWidgetsSold(int numWidgetsSold) {
	  this.numWidgetsSold = numWidgetsSold;
  }
  
  // Set and get methods for ratePerWidget
  public double getRatePerWidget() {
	  return this.ratePerWidget;
  }
  
  public void setRateWidget() {
	  this.ratePerWidget = ratePerWidget;
  }

  // Override the toString method that returns a String in the following format
  // Name: Frank Reynolds
  // Type: Sales
  // Number of Widgets Sold: 130
  // Rate per Widget: $95.0
  public String toString() {
	  return super.toString() + "\n" +
		"Type: Sales\n" +
		"Number of Widgets Sold: " + this.numWidgetsSold + "\n" +
		"Rate per Widget: " + this.ratePerWidget;
  }

  // Override the pay method so that it computes the pay as follows
  // pay = (number of widgets sold) * (commission rate per widget)
  public double pay() {
	  return this.numWidgetsSold * this.ratePerWidget;
  }
}
