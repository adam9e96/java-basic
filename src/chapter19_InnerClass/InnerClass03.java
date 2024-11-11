package chapter19_InnerClass;
/**
 * ===========================================================
 * 파일명       : InnerClass02
 * 날짜          : 2024-01-24
 * 설명          : 인스턴스 내부 클래스의 정의와 형식
 * ===========================================================
 * 인스턴스 내부 클래스의 정의와 형식
 * 외부 클래스의 멤버처럼 정의된 클래스
 * 내부 클래스를 사용하려면 먼저 외부 클래스의 인스턴스를 생성한 후 접근해야 함.
 * <p>
 * Inner.getCustomerInfo() 를 호출해서 아래 내용이 나오도록 main() 메서드 작성.
 * '고객정보 >> 이름: 홍길동, 나이:20, 주소: 세종시 세종구'
 */

/**
 * MyOuter 클래스는 외부 클래스를 정의합니다.
 * 이 클래스는 고객의 이름과 나이를 저장하는 필드를 가지고 있습니다.
 */
class MyOuter { // 외부 클래스
    private final String name; // 외부 클래스 변수
    private final int age; // 외부 클래스 변수

    /**
     * Inner 클래스는 MyOuter 클래스의 인스턴스 내부 클래스입니다.
     * 이 클래스는 주소 정보를 저장하는 필드를 가지고 있으며,
     * 외부 클래스의 필드에 접근하여 고객 정보를 반환하는 메서드를 제공합니다.
     */
    public class Inner {
        private final String address; // 내부 클래스 필드

        /**
         * Inner 클래스의 생성자.
         *
         * @param address 고객의 주소를 나타내는 문자열
         */
        public Inner(String address) { // 내부 클래스 생성자
            this.address = address;
        }

        /**
         * 고객 정보를 반환하는 메서드.
         *
         * @return 고객의 이름, 나이, 주소 정보를 포함한 문자열
         */
        public String getCustomerInfo() {
            return "이름: " + name + ", 나이: " + age + ", 주소: " + address;
        }
    }   // 내부 클래스 끝

    /**
     * MyOuter 클래스의 생성자.
     *
     * @param name 고객의 이름을 나타내는 문자열
     * @param age 고객의 나이를 나타내는 정수
     */
    public MyOuter(String name, int age) {  // 외부 클래스 생성자
        this.name = name;
        this.age = age;
    }

    /**
     * 고객의 이름을 반환하는 메서드.
     *
     * @return 고객의 이름을 나타내는 문자열
     */
    public String getName() {
        return name;
    }

    /**
     * 고객의 나이를 반환하는 메서드.
     *
     * @return 고객의 나이를 나타내는 정수
     */
    public int getAge() {
        return age;
    }
}

/**
 * InnerClass03 클래스는 메인 메서드를 포함하여 MyOuter와 Inner 클래스의 동작을 테스트합니다.
 */
public class InnerClass03 {
    public static void main(String[] args) {
        // MyOuter 클래스의 인스턴스를 생성합니다.
        MyOuter myOuter = new MyOuter("홍길동", 20);   // 외부 클래스 인스턴스 생성
        // Inner 클래스의 인스턴스를 생성합니다.
        MyOuter.Inner inner = myOuter.new Inner("세종시 세종구");

        // 고객 정보를 출력합니다.
        System.out.println("고객정보 >> " + inner.getCustomerInfo());   // 외부 클래스의 멤버를 사용가능하다.

    }
}
