package chapter2;

/*
 * ===========================================================
 * fileName       : PrimitiveTypes03
 * date           : 2024-01-06
 * description    : 형변환
 * -형변환은 종류가 2가지
 * 1. 자동 형변환
 *  별도의 작업없이 자바가 형변환
 *  -> 작은 범위에서 큰 범위로 변환
 * 2. 명시적 형변환
 *  개발자가 변수의 자료형을 강제로 바꾸는 것
 * ===========================================================
 */

public class PrimitiveTypes03 {
    public static void main(String[] args) {

        byte b = 10;
        int i = (int) b; // 자동 형변환
        // 자동형변환
        System.out.println("i=" + i); // 10
        System.out.println("b=" + b); // 10

        int i2 = 300;// 300 //int 의 값이 10이라도 오류가 뜨는데 자바는 값을 보지 않고 타입만 보고 판단하기 때문

        byte b2 = (byte) i2; // 강제 형변환
        // 명시적형변환
        System.out.println("i2=" + i2); // 300
        System.out.println("b2=" + b2); // 44 (300 - 256) <== 강제 형변환은 값이 손상될 수 있기 때문에 되도록 안해야한다.

        // 자료형 형변환보다는 클래스 형변환을 자주 사용한다. 여기서 기본적인 개념을 알고 있어야 클래스 때도 쉽게 이해 할 수있다.
    }
}
