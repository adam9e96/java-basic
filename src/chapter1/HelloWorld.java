package chapter1;   // 바이트코드 파일이 위치할 패키지 선언

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

//        byte priceByte = 30000;  //  java: incompatible types: possible lossy conversion from int to byte

//        System.out.println(priceByte);
        /*
           주어진 코드에서 발생하는 오류는 priceByte 변수에 대한 부분에서 발생합니다.
           이 오류는 int 값을 byte로 변환할 때 데이터 손실이 발생할 수 있음을 나타냅니다.
           자바에서 byte는 8비트를 사용하므로 허용되는 값의 범위는 -128부터 127까지입니다.
           따라서 byte 변수에 저장되는 값은 해당 범위 내에 있어야 합니다.

        여기서 byte priceByte = 30000;는 오류를 발생시킵니다.
        왜냐하면 30000은 byte가 표현할 수 있는 범위를 초과하기 때문입니다.
        해결 방법:
          - 다음과 같이 값을 byte 범위 내로 변경하거나 혹은 다른 자료형을 사용하는 것입니다

         */


        byte priceByte1 = (byte) 30000; // 강제 형변환을 통해 값 손실을 감안하여 대입이 가능함
        System.out.println(priceByte1); // 48

    }   // java: reached end of file while parsing . main() 메소드 중괄호 없을 때 오류
}
/*
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
 * Type mismatch: cannot convert from int to byte <-- 에러 코드 #중요.
 *
 * at chapter1.MyInt_01.main(MyInt_01.java:7)
 *
 * 먼저 발생한 에러만 표시해줌

byte priceByte = (byte) 30000; // 형변환을 통해 값 손실을 감안하여 대입
System.out.println(priceByte);
그러나 주의해야 할 점은 값 손실이 발생할 수 있기 때문에 이러한 형변환을 사용할 때는 주의가 필요합니다.
* 값의 범위를 벗어나지 않도록 유의하고, 필요한 경우 더 큰 자료형을 사용하도록 고려해야 한다.
 */