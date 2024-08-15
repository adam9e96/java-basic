package chapter_18_interface.interface08;

/**
 * ===========================================================
 * fileName       : CompleteCalc
 * date           : 2024-01-24
 * description    :
 * A. 추상클래스에서 아무것도 구현 안하고 일반클래스로 넘겼다면(상속)
 * Calc 인터페이스에 잇는 4개의 추상 메소드 모두 일반클래스에서 오버라이딩 해줘야 한다.
 * -> 추상클래스에서 오버라이딩을 하고(전체 or 일부) 일반 클래스가 상속을 받았으면 구현 안된
 * 추상 메소드만 오버라이딩 해주면 된다.
 * ===========================================================
 */

public class CompleteCalc extends Calculator { // 추상메소드를 상속받은 일반 클래스
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0)
            return num1 / num2;
        else
            return Calc.ERROR; // 어떤 수를 0 으로 나누는 경우에 오류를 반환
    }

    public void showInfo() { // CompleteCalc 클래스 에서 추가로 정의한 메소드
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }
}
