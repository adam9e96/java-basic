package chapter27_string.string;

public class D_01 {
    public static void main(String[] args) {
        /* String 클래스
        `String`을 선언하는 두 가지 방법.
        1) 생성자의 매개변수로 문자열 생성.
         String str1 = new String("abc");
         new 예약어를 사용해서 객체를 생성하는 경우는 "abc" 문자열을 위한 메모리가 할당되고 새로운 객체가 생성.

         String 자체가 클래스가 1번 방식이 원래 정석인데 너무 귀찮음. 문자열 자주 사용하는데 매번 `new` 를 사용하기엔 번거러우니 2번 방식이
         만들어짐

         2) 문자열 상수를 가르키는 방식. <-- 기존에 사용하던 방식
         String str3 = "abc";
         생성자를 이용하지 않고 바로 문자열 상수를 가리키는 경우에는 기존에 만들어져 있던 문자열 상수의 메모리 값을 가르키게 됨.
         프로그램에서 사용되는 상수 값을 저장하는 공간을 상수 풀 constant pool 이라고 함.
        */

        String str1 = new String("abc"); // 생성자의 매개변수로 문자열 생성.
        String str2 = new String("abc");

        System.out.println(str1 == str2);    // false. 인스턴스가 매번 새로 생성되므로 str1과 str2는 주소 값이 다름.
        System.out.println(str1.equals(str2)); // true. 문자열의 값은 같음.

        String str3 = "abc"; // 상수 풀에 저장된 주소 값을 저장
        String str4 = "abc"; // 상수 풀은 set 자료형과 유사함. 메모리에 동일한 value 가 있으면 새로 저장하지 않음. 해당 주소 값을 복사하기때문

        System.out.println(str3 == str4);  //true. 문자열 abc는 상수 풀에 저장되어 있으므로 str3과 str4가 가르키는 주소 값이 같음.
        System.out.println(str3.equals(str4)); //true.  문자열의 값도 같음.

        /*
         상수풀의 특징
         동일한 값이 있으면 새로 추가하지 않고 해당 문자값의 주소값을 참조함
         */
    }
}
