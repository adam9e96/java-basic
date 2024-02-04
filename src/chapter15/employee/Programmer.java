package chapter15.employee;

public class Programmer extends Employee {
    private int bonus = 3000000;

    @Override
    public int getSalary() {
        return baseSalary + this.bonus;
    }
}
