package chapter27_string.string;

public class D_02 {
    public static void main(String[] args) {
        /*
         * 다른 프로그래밍 언어는 문자열을 구현할 때 char[] 배열을 사용.
         * 자바는 String 클래스를 제공해 char[] 배열을 직접 구현하지 않아도 문자열을 사용할 수 있음
         *
         * String 클래스의 구현 내용을 보면 private final char value[] 라고 선언된 char 배열이 있음.
         * 프로그램에서 String s = new String("abc") 라고 쓰면 abc는 String 클래스의 value 변수에 저장이 됨.
         * value 변수 final 로 선언이 되어 있어서 값을 변경할 수 없음. 이를 불변 immutable 라고 함. <-- kotlin 의 val 과 유사
         *
         * 프로그램에서 두 개의 문자열을 연결하면, 둘 중 하나의 문자열이 변경 되는게 아니라 두 문자열이 연결된 새롱누 문자열이 생성.
         */
        String javaStr = new String("java");
        String androidStr = new String("android");
        System.out.println(javaStr); // java
        System.out.println("처음 문자열 주소 값 ");
        /*
         * String 변수값을 변경시도 -> final(상수)라서 값수정 불가 -> JDK에서 새로운 변수공간을 생성하고 거기에 변경된값과 주소를 반환 하는식이라 String 10번 수정하면 힙 메모리에 10개의 공간이 만들어짐(쓰이는건 마지막 1개임)
         */
    }
}
