package chapter15.employee2;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("김유식", "9999", 1000000);
        ContractEmployee contractEmployee = new ContractEmployee("김수민", "9911", 10, 3000000);

        System.out.println("풀타임직원의 연봉 :" + fullTimeEmployee.calculateSalary());
        System.out.println("예약직직원의 연봉 :" + contractEmployee.calculateSalary());

        System.out.println(fullTimeEmployee);
        System.out.println(contractEmployee);

        Employee[] employees = {fullTimeEmployee, contractEmployee};

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.calculateSalary());
        }

        FullTimeEmployee[] employees2 = {fullTimeEmployee, contractEmployee}; // 이거 돌아가는 이유
        // 자식
        // 타임
        // #숙제
    }
}
/*
salary에 굳이 넣을 필요는 없다 뜻이랑 맞지 않음. 오히려 넣으면 모순이 생김
 */
