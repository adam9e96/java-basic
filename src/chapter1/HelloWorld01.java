package chapter1;

/*
 * ===========================================================
 * fileName       : HelloWorld01
 * date           : 2024-01-06
 * description    :
 * ===========================================================
 */

public class HelloWorld01 {
    // 프로그램 실행 진입점
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        System.out.println('h'); // char 문자 자료형 2byte
        System.out.println("h"); // 1글자라도 가능함 ""을 사용하면 문자열임

        // 1. 프로그램은 줄 단위로 위에서 아래로 실행.
        // 2. 한줄이 실행되고 다음 줄로 이동을 하며, 이전 줄의 내용은 기억을 할 수 없음
        // 들여쓰기 신경써야함.파이썬은 들여쓰기 안하면 오류뜸
        // 3. 이전 줄의 내용을 저장하고 싶을 때는 변수에 저장.

        String greet = "Hello Java!"; // "Hello Java?" 라는 문장을 메모리(컴퓨터의 저장공간)에 저장.
        // 자료형 변수명(저장장소이름) = 저장할 데이터;
        System.out.println(greet);

        // 한번만 사용하고 말거면 굳이 변수에 저장할 필요없음. 여러번 재사용하기 위해 변수에 담아 사용함.

        /*
         * 여러줄 주석
         */
    }
}
