package chapter2;

/*
 * ===========================================================
 * fileName       : PrimitiveTypes04FinalVariableExample
 * date           : 2024-01-06
 * description    :
 * 상수 : 프로그램 실행중에 변경할 수 없는 고정된 값. 변수와는 다르게 대문자로 선언.
 * 형식 : final 데이터 타입 상수명 = 값;
 * ===========================================================
 */
public class PrimitiveTypes04FinalVariableExample {

    public static void main(String[] args) {

        // non final
        int a = 3;    // 정수형 변수 a 를 선언및 3으로 초기화
        System.out.println(a);
        a = 4;    // 변수 a에 새로운 값을 할당하고 출력
        System.out.println(a);

        // final 키워드를 이용하며 상수로 선언
        // 상수인 PI 를 선언하고 3.14 로 초기화.
        // final 키워드로 인해 한 번 초기화된 후에는 값 변경 불가
        final double PI = 3.14; // 상수의 경우 대문자를 씀(자바기준)
//		PI = 3.15; // 에러발생
        System.out.println(PI); // 이 문장만 봐도 PI가 상수인걸 알 수 있도록 대문자로 작성.

    }
}
