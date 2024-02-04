package chapter15.employee;

public class Manager extends Employee {
    @Override
    public int getSalary() {
        int bonus = 2000000;
        return baseSalary + bonus;
    }
}
