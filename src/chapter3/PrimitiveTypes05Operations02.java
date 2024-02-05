package chapter3;

/**
 * ===========================================================
 * fileName       : PrimitiveTypes05Operations02
 * date           : 2024-01-24
 * description    : 증감연산자 연습
 * 증감 연산자
 * a++: 후위 증가 연산자로, 현재 값을 사용한 후에 1을 증가시킵니다.
 * ++a: 전위 증가 연산자로, 1을 증가시킨 후에 현재 값을 사용합니다.
 * <p>
 * b += 2: 복합 대입 연산자로, 현재 b의 값에 2를 더한 후에 다시 b에 할당합니다.
 * <p>
 * ===========================================================
 */
public class PrimitiveTypes05Operations02 {
    public static void main(String[] args) {
        /*
         * 증감 연산자
         * 단독으로 쓰이는 경우가 아니면 위치에 따라 결과값이 다름
         */
        int a = 1;
        int b = 5;

        System.out.println(a); // 1

        a++;

        System.out.println(a); // 2

        System.out.println(++a); // 3 전위

        System.out.println(a++); // 3 println 출력후 4가됨 // 후위

        System.out.println(a); // 4

        // =======================================

        System.out.println(b); // 5

        System.out.println(++b); // 6

        System.out.println(b++); // 6 println 출력 후 7이 됨

        System.out.println(b); // 7

        System.out.println(b += 2); // 9
    }
}
