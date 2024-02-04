package chapter13.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
/*
    static 멤버일 경우 객체를 생성하지 않아도 실행이 가능하다.
    클래스명.멤버 로 접근이 가능하다.
 */
