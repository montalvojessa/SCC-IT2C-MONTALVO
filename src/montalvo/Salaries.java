package montalvo;

public class Salaries {
        private int employeeId;
    private String employeeName;
    private double hourlyRate;
    private double hoursWorked;
    private double deductions;
    private double grossSalary;
    private double netSalary;

    
    public Salaries(int employeeId, String employeeName, double hourlyRate, double hoursWorked, double deductions) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.deductions = deductions;
        this.grossSalary = hourlyRate * hoursWorked;
        this.netSalary = grossSalary - deductions;
    }

    public void displaySalary() {
        System.out.printf("%-10d %-15s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f%n",
                employeeId, employeeName, hourlyRate, hoursWorked, grossSalary, deductions, netSalary);
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getDeductions() {
        return deductions;
    }

    public double getNetSalary() {
        return netSalary;
    }
}


