package chapter15.employee;

import java.util.PrimitiveIterator;

public class Employee {
    /*
    일반 직원을 Employee 클래스로 모델링 한다.
    Employee 클래스를 상속받아서
    1) 관리자를 나타내는 Manager 클래스와
    2) 프로그래머를 나타내는 Porgrammer 클래스를 작성한다.
    Employee 클래스 안에는 월급을 계산하는 getSalary() 메서드가 있다.
    3) 위 메서드를 Manager 클래스와 Programmer 클래스에서 오버라이딩해서 각 직급별로 다른 월급을 반환하도록 한다.
    4) 오버라이딩을 할 때 Employee 클래스의 baseSalary을 사용하라.
     */
    protected final int baseSalary = 3000000; // 기본급

    public int getSalary() {
        return baseSalary;
    }
}
