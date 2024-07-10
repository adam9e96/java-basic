package chapter24_exception;


public class Exception01 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
//            int result = 10/1; 1로 변경하면 catch 문장은 출력 안됨
            System.out.println("result is " + result);

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램은 계속 진행됩니다.");
    }
}
