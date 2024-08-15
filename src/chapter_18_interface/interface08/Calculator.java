package chapter_18_interface.interface08;

/**
 * ===========================================================
 * fileName       : Calculator
 * date           : 2024-01-24
 * description    :
 * Calc 인터페이스를 구현 받은 Calculator 클래스
 * <p>
 * Q. 추상클래스의 경우 인터페이스를 구현받으면 어떻게 될까?
 * A. 아래참고
 * Q. 인터페이스에서 일반 클래스를 구한 한다면?
 * <p>
 * Q. 인터페이스를 구현한 추상클래스를 일반 클래스가 상속 받는 다면 어떻게 될까?
 * A.
 * ===========================================================
 */

public abstract class Calculator implements Calc {
    // 인터페이스를 구현받은 추상클래스
    // 추상클래스의 경우 인터페이스가 선언한 모든 추상 메서드를 구현하지 않아도됨(빨간줄도 안뜬다)
    // 오버라이딩 하고 싶은것만 해도되고 안해도된다.
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    /*
    Calc 인터페이스에서 add()와 subtract() 메소드만 오버라이딩함
     */
}
