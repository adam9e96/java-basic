package chapter_7_method.a_basic;

public class Method_06 {

    /*
     * 메서드 호출 순서: 메서드를 호출하면 다른 메서드를 호출할 수 있으며, 메서드의 실행은 호출한 메서드가 종료될 때까지 중단됩니다.
     * 호출된 메서드가 종료되면 호출한 메서드로 다시 돌아갑니다.
     * main() -> firstMethod() -> secondMethod()
     */

    /**
     *
     */

    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었습니다."); // 1
        firstMethod();
        System.out.println("main(String[] args)이 종료되었습니다."); // 6
    }

    static void firstMethod() {
        System.out.println("firstMethod()가 시작되었습니다."); // 2
        secondMethod();
        System.out.println("firstMethod()가 종료되었습니다."); // 5
    }

    static void secondMethod() {
        System.out.println("secondMethod()가 시작되었습니다."); // 3
        System.out.println("secondMethod()가 종료되었습니다."); // 4
    }

}
