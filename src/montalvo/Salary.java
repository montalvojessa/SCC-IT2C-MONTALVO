
package montalvo;
    import java.util.Scanner;
public class Salary {

    public void processSalaries() {
        Scanner scanner = new Scanner(System.in);
        Salaries[] employees = new Salaries[100];

        System.out.print("Enter number of employees: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.printf("Enter details for Employee %d:%n", i + 1);
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Hourly Rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Hours Worked: ");
            double hours = scanner.nextDouble();
            System.out.print("Deductions: ");
            double deductions = scanner.nextDouble();

            Salaries employee = new Salaries(id, name, rate, hours, deductions);
            employees[i] = employee;
        }

        displaySummary(employees, count);
        scanner.close();
    }

    private void displaySummary(Salaries[] employees, int count) {
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s %-10s%n",
                "ID", "Name", "Rate", "Hours", "Gross", "Deductions", "Net");

        double totalGross = 0, totalDeduct = 0, totalNet = 0;

        for (int i = 0; i < count; i++) {
            Salaries employee = employees[i];
            employee.displaySalary();
            totalGross += employee.getGrossSalary();
            totalDeduct += employee.getDeductions();
            totalNet += employee.getNetSalary();
        }
System.out.printf("%-15s %-15s %-15s%n", "\nTOTAL GROSS", "TOTAL DEDUCT", "TOTAL NET");
System.out.printf("%-15.2f %-15.2f %-15.2f%n", totalGross, totalDeduct, totalNet);

    }
}


