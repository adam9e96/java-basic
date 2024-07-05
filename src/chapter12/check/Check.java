package chapter12.check;

/**
 * Check 클래스는 클래스 멤버와 인스턴스 멤버 간의 접근 관계를 연습
 */
public class Check {
    // instanceVariable : iv   // Variable : 번역하면 변수임
    // classVariable : cv
    // instanceMethod : im
    // classMethod : cm

    /**
     * 클래스 변수, 모든 인스턴스가 공유하는 변수입니다.
     */
    static int cv = 5; // 클래스 변수

    /**
     * 인스턴스 변수, 각 인스턴스가 개별적으로 가지는 변수입니다.
     */
    int iv = 4; // 인스턴스 변수

    /**
     * 클래스 메서드, 클래스 변수에만 접근할 수 있습니다.
     */
    static void cm() { // 클래스 메서드
    }

    /**
     * 인스턴스 메서드, 인스턴스 변수와 메서드에 접근할 수 있습니다.
     */
    void im() {
    } // 인스턴스 메서드

    /**
     * 클래스 메서드에서 인스턴스 멤버에 접근하려고 하면 에러가 발생합니다.
     * 인스턴스 변수와 인스턴스 메서드는 static 컨텍스트에서 사용할 수 없습니다.
     */
    static void cmImember() { // 클래스 메서드가 인스턴스 멤버에 접근
//        System.out.println(iv); // 에러 발생 <-- 인스턴스 변수
//        im(); // 에러발생 <-- 인스턴스 메소드
        // static 가 붙지 않은 메소드,변수를 지워봐라. 없어서 에러가 뜨는 거짐. 생성시점을 고려해보자.

    }


    /**
     * 인스턴스 메서드는 클래스 멤버에 접근할 수 있습니다.
     */
    void imCmember() {
        // 인스턴스 메서드가 클래스 멤버에 접근
        System.out.println(cv);
        cm();
    }

    /**
     * 클래스 메서드는 클래스 멤버에 접근할 수 있습니다.
     */
    static void cmCmemrber() {  // 클래스 메서드가 클래스 멤버에 접근
        System.out.println(cv);
        cm();
    }

    /**
     * 인스턴스 메서드는 인스턴스 멤버에 접근할 수 있습니다.
     */
    void imImember() { // 인스턴스 메서드가 인스턴스 멤버에 접근
        System.out.println(iv);

        im();
//        System.out.println(cv);
    }
}
