package chapter_20_collection_list;

import java.util.ArrayList;

/*
문제: 직원과 고용 관리 시스템

1. Employee 클래스를 작성하세요.

이 클래스는 다음과 같은 속성을 가져야 합니다.

name (문자열): 직원의 이름
employeeId (정수): 직원의 고유 식별자
salary (정수): 직원의 급여

Employee 클래스에는 다음과 같은 메서드가 있어야 합니다.

Employee 생성자: 이름, 고유 식별자, 급여를 매개변수로 받아 초기화합니다.
calculateSalary() 메서드: 직원의 급여를 계산하여 반환합니다. (기본적으로 salary 값을 반환)

2. FullTimeEmployee 클래스를 작성하세요.
이 클래스는 Employee 클래스를 상속받아야 합니다.

FullTimeEmployee 클래스는 다음과 같은 추가 속성을 가져야 합니다.
monthlySalary (정수): 월별 급여

FullTimeEmployee 클래스에는 다음과 같은 메서드가 있어야 합니다.
FullTimeEmployee 생성자: 이름, 고유 식별자, 월별 급여를 매개변수로 받아 초기화합니다.
calculateSalary() 메서드: 월별 급여를 연봉으로 계산하여 반환합니다. (오버라이딩)

3. ContractEmployee 클래스를 작성하세요.
이 클래스는 FullTimeEmployee 클래스를 상속받아야 합니다.

ContractEmployee 클래스는 다음과 같은 추가 속성을 가져야 합니다.
contractDuration (정수): 계약 기간 (개월)

ContractEmployee 클래스에는 다음과 같은 메서드가 있어야 합니다.
ContractEmployee 생성자: 이름, 고유 식별자, 계약 기간, 월별 급여를 매개변수로 받아 초기화합니다.
calculateSalary() 메서드: 계약 기간에 따라 월별 급여를 연봉으로 계산하여 반환합니다. (오버라이딩)

4. Main 클래스에서 다음과 같은 작업을 수행하세요.

FullTimeEmployee 객체와 ContractEmployee 객체를 각각 생성하고, 연봉을 출력하세요.
(오버라이딩된 calculateSalary() 메서드 활용)

이 문제를 해결하기 위해 Employee, FullTimeEmployee, ContractEmployee 클래스를 작성하고,
메서드 오버라이딩을 통해 연봉을 계산하고 출력하세요.
그리고 Main 클래스에서 객체를 생성하여 연봉을 확인하세요.

 */
class Employee {
    private final String name; // 직원의 이름
    private final String employeeId; // 직원의 고유 식별자
    private int salary = 0; // 직원의 급여

    public Employee(String name, int salary, String employeeId) {
        this.name = name;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int calculateSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}

class FullTimeEmployee extends Employee {
    protected int monthlySalary; // 월별급여

    public FullTimeEmployee(String name, int monthlySalary, String employeeId) {
        super(name, monthlySalary, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int calculateSalary() {
        return monthlySalary * 12;
    }
}

class ContractEmployee extends FullTimeEmployee {
    private final int contractDuration; // 계약기간 (개월)

    public ContractEmployee(String name, int monthlySalary, String employeeId, int contractDuration) {
        super(name, monthlySalary, employeeId);
        this.contractDuration = contractDuration;
    }

    @Override
    public int calculateSalary() {
        return contractDuration * monthlySalary; // // getMonthlySalry() 메소드르 만들어서 가져와도 됨 protected를 쓴다면
    }
}

public class ArrayListDemo04 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Smith", 300, "1234");
        System.out.println(fullTimeEmployee.calculateSalary());

        ContractEmployee contractEmployee = new ContractEmployee("Hoo", 350, "3033", 10);
        System.out.println(contractEmployee.calculateSalary());

        System.out.println("풀타임직원의 연봉 : " + fullTimeEmployee.calculateSalary());
        System.out.println("계약직직원의 연봉 : " + contractEmployee.calculateSalary());

//        FullTimeEmployee[] employees = {fullTimeEmployee, contractEmployee}; // 이거 돌아가는 이유
        ArrayList<FullTimeEmployee> employees1 = new ArrayList<>();
        employees1.add(fullTimeEmployee);
        employees1.add(contractEmployee);

        for (FullTimeEmployee employee : employees1) {
            System.out.println(employee.calculateSalary());
        }
    }
}
