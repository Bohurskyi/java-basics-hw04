public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ContractedEmployee contractedEmployee = new ContractedEmployee("1", "Ivan", "11");
        contractedEmployee.setNumberOfHoursWorked(15);
        contractedEmployee.setHourlyRate(5);
        contractedEmployee.calculatePay();
        SalariedEmployee salariedEmployee = new SalariedEmployee("2", "Petro", "120");
        salariedEmployee.setFixedMonthlyPayment(1500);
        salariedEmployee.calculatePay();
    }
}