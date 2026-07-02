package Problem4;
public class Main {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee(101, "Sujan", 50000, 10000);

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Total Salary: " + emp.calculateSalary());
    }
}