package chapter1_HelloWorld;   // 바이트코드 파일이 위치할 패키지 선언

/*
 * ===========================================================
 * fileName       : HelloWorld
 * date           : 2024-01-06
 * description    :
 * ===========================================================
 */

public class HelloWorld {   // Hello 클래스 선언
    public static void main(String[] args) {    // main() 메소드 선언


        System.out.println("Hello World");  // Hello World 콘솔에 출력

        // 제품 가격 3만원 저장 후 출력

        int price1 = 30000;

        int price2 = 30001;

        System.out.println(price1); // 30000    // 콘솔에 출력하는 코드
        System.out.println(price2); // 30001
    }
}