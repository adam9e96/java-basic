package chapter_20_collection_list.exam03.test;/*
 * ===========================================================
 * fileName       : EmployeeExample
 * date           : 2024-01-27
 * description    :
 * ===========================================================
 */

import java.util.ArrayList;

class Employee {
    private String name; // 직원의 이름
    private String employeeId; // 직원의 고유 식별자
    private int salary; // 직원의 급여

    public Employee(String name, String employeeId, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public int calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class FullTimeEmployee extends Employee {
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

class ContractEmployee extends FullTimeEmployee {
    private int contractDuration; // 계약기간 (개월)

    public ContractEmployee(String name, String employeeId, int contractDuration, int monthlySalary) {
        super(name, employeeId, monthlySalary);
        this.contractDuration = contractDuration;
    }

    @Override
    public int calculateSalary() {
        return contractDuration * monthlySalary; // getMonthlySalry() 메소드르 만들어서 가져와도 됨 protected를 쓴다면
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("galaxy", "3033", 300000);
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee("apple", "3033", 250000);
        FullTimeEmployee fullTimeEmployee3 = new FullTimeEmployee("google", "3033", 400000);
        ContractEmployee contractEmployee1 = new ContractEmployee("jim", "1234", 400, 6);

        ArrayList<FullTimeEmployee> employees = new ArrayList<>();
        employees.add(fullTimeEmployee1);
        employees.add(fullTimeEmployee2);
        employees.add(fullTimeEmployee3);
//        employees.add(contractEmployee1);

        // 전체 직원 정보 출력
        for (FullTimeEmployee employees1: employees ) {
            System.out.println(employees1);
        }
        for (FullTimeEmployee employees2: employees) {
            System.out.println(employees2.calculateSalary());;
        }

    }
}
