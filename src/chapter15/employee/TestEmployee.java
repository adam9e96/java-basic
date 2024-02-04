package chapter15.employee;

public class TestEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("관리자의 월급 : " + manager.getSalary());
        // 관리자의 월급 : 5000000

        Programmer programmer = new Programmer();
        System.out.println("프로게이머의 월급 : " + programmer.getSalary());
        // 프로그래머의 월급 : 6000000
    }

}
