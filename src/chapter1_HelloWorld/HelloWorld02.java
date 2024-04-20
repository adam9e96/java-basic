package chapter1_HelloWorld;

/*
 * ===========================================================
 * fileName       : HelloWorld02
 * date           : 2024-01-06
 * description    :
 * ===========================================================
 */

public class HelloWorld02 {
    public static void main(String[] args) {
        // PrecisionTest

        // 1, I, l, | , O 0 <-- 기본 돋움폰트같은 경우 구분이 안되는데
        // 요즘 IDE 에선 코딩용 폰트(D2Coding)등을 지원해서
        // 지금은 따로 세팅할 필요는 없다.

        float f = 1.2345678901234567890f;
        float f2 = 1.2f; // 접미사 없어서 에러
        // 소수형태는 기본이 double 이므로 float을 쓸때는 값뒤에 f를 붙여줘야함.

        // float f4 = 1.2f;
        double d = 1.2345678901234567890;
        float f3 = 0.100000001f; // 0.1
        double d2 = 0.100000001; // double 은 접미사 생략 가능
        double d3 = 0.1000000000000001;

//								result
        System.out.println(f); // 1.2345679_ -> 소수점 8자리에서 반올림
        System.out.println(f2); // 1.2
        System.out.println(d); // 1.2345678901234567 16째 자리 까지 나옴
        System.out.println(f3); // 0.1
        System.out.println(d2); // 0.100000001
        System.out.println(d3); // 0.10000000000001

        /*
         * 정수 타입 byte > short > int > long 실수 타입 float > double
         */
    }
}
