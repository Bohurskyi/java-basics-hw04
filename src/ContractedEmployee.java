public class ContractedEmployee extends Employee {
  // TODO fix class declaration and declare variables here
  private String employeeId;
  private String name;
  private String federalTaxId;
  private double hourlyRate;
  private double numberOfHours;
  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    // TODO fill in code here
    super(employeeId, name); //constructor of Employee class called
    this.employeeId = employeeId;
    this.name = name;
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    // TODO fill in code here and replace the return statement
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    // TODO fill in code here
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    // TODO fill in code here and replace the return statement
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    // TODO fill in code here
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    // TODO fill in code here and replace the return statement
    return numberOfHours;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    // TODO fill in code here
    this.numberOfHours = numberOfHoursWorked;
  }

  // TODO fill in code here

  @Override
  public void calculatePay() {
    double avarage = hourlyRate * numberOfHours;
    super.setAverageMonthlySalary(avarage);
  }
}
