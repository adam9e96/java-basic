package chapter_20_collection_list.exam03;

import java.util.ArrayList;

/**
 * ===========================================================
 * fileName       : Test
 * date           : 2024-01-25
 * description    : Exam03 todo 아직 못했다.
 * ===========================================================
 */
public class Test {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("tom", "1234", 300);
        System.out.println(fullTimeEmployee.calculateSalary()); // 3600


        ContractEmployee contractEmployee = new ContractEmployee("jim", "1234", 400, 6);
        System.out.println(contractEmployee.calculateSalary()); // 2400

        System.out.println("풀타임직원의 연봉 :" + fullTimeEmployee.calculateSalary());
        System.out.println("예약직직원의 연봉 :" + contractEmployee.calculateSalary());

        System.out.println(fullTimeEmployee);
        System.out.println(contractEmployee);



//        for (int i = 0; i < employees.length; i++) {
//            Employee employee = employees[i];
//            System.out.println(employee.calculateSalary());
//        }

//        FullTimeEmployee[] employees = {fullTimeEmployee, contractEmployee}; // 이거 돌아가는 이유
        ArrayList<FullTimeEmployee> employees1 = new ArrayList<>();
        employees1.add(fullTimeEmployee);
        employees1.add(contractEmployee);

        for (FullTimeEmployee employee : employees1) {
            System.out.println(employee.calculateSalary());
        }
        // 자식
        // 타임f
        // #숙제
    }

}
