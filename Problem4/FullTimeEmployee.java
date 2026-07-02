package Problem4;

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int employeeId, String employeeName, double basicSalary, double bonus) {
        super(employeeId, employeeName, basicSalary);
        this.bonus = (bonus < 0) ? 0 : bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }
}