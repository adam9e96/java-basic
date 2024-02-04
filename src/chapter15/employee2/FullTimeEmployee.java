package chapter15.employee2;

public class FullTimeEmployee extends Employee {
    protected int monthlySalary; // 월별 급여

    public FullTimeEmployee(String name, String employeeId, int monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }


    @Override
    public int calculateSalary() {
        return monthlySalary * 12;
    }
}
