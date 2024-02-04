package chapter20.innerClass02;

/*
 * ===========================================================
 * fileName       : InnerClass02
 * date           : 2024-01-24
 * description    : // todo #3 봐야 할거
 * ===========================================================
 * 인스턴스 내부 클래스의 정의와 형식
 * 외부 클래스의 멤버처럼 정의된 클래스
 * 내부 클래스를 사용하려면 먼저 외부 클래스의 인스턴스를 생성한 후 접근해야 함.
 *
 * Inner.getCustomerInfo() 를 호출해서 아래 내용이 나오도록 main() 메서드 작성.
 * '고객정보 >> 이름: 홍길동, 나이:20, 주소: 세종시 세종구'
 */

class MyOuter {
    private String name; // 외부 클래스 변수
    private int age; // 외부 클래스 변수

    // 내부 클래스를 정의한다.
    public class Inner {
        private String address;

        public Inner(String address) { // 내부 클래스 생성자
            this.address = address;
        }

        public String getCustomerInfo() {
            return "이름: " + name + ", 나이: " + age + ", 주소: " + address;
        }
    }   // 내부 클래스 끝

    public MyOuter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class InnerClass02 {
    public static void main(String[] args) {

        MyOuter myOuter = new MyOuter("홍길동", 20);
        MyOuter.Inner inner = myOuter.new Inner("세종시 세종구");

        System.out.println("고객정보 >> " + inner.getCustomerInfo());
    }
}
