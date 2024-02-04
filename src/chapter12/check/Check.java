package chapter12.check;

public class Check {
    // instanceVariable : iv   // Variable : 번역하면 변수임
    // classVariable : cv
    // instanceMethod : im
    // classMethod : cm

    static int cv = 5; // 클래스 변수
    int iv = 4; // 인스턴스 변수

    static void cm() { // 클래스 메서드
    }

    void im() {
    } // 인스턴스 메서드

    static void cmImember() { // 클래스 메서드가 인스턴스 멤버에 접근
//        System.out.println(iv); // 에러 발생 <-- 인스턴스 변수
//        im(); // 에러발생 <-- 인스턴스 메소드
        // static 가 붙지 않은 메소드,변수를 지워봐라. 없어서 에러가 뜨는 거짐. 생성시점을 고려해보자.
    }

    void imCmember() {
        // 인스턴스 메서드가 클래스 멤버에 접근
        System.out.println(cv);
        cm();
    }

    static void cmCmemrber() {  // 클래스 메서드가 클래스 멤버에 접근
        System.out.println(cv);
        cm();
    }

    void imImember() { // 인스턴스 메서드가 인스턴스 멤버에 접근
        System.out.println(iv);
        im();
    }
}
