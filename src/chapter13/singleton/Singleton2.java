package chapter13.singleton;

class Single {
    private static Single instance = null;

    // 클래스 외부에서는 객체의 값을 변경 못하게 private 사용
    private Single() {

    }

    public static Single getInstance() {
        /* 클래스 외부에서는 getInstance() 메서드를 통해서만 객체에 접근.
        getInstance()가 여러번 호출되더라도 동일한 객체를 반환
         */
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }
}

public class Singleton2 {
    public static void main(String[] args) {
        Single obj1 = Single.getInstance();
        Single obj2 = Single.getInstance();
        System.out.println(obj1); // chapter13.singleton.Single@e9e54c2
        System.out.println(obj2); // chapter13.singleton.Single@e9e54c2
    }
}
