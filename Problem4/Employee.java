package Problem4;
class Employee {
    private int employeeId;
    private final String employeeName;
    protected double basicSalary;

    public Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = (basicSalary < 0) ? 0 : basicSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }
}
