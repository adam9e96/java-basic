package static_demo;

/*
 * 1. Static 변수를 변경하는 것이 적절한 경우
 * 상태를 전체적으로 공유할 필요가 있는 경우:
 * 예를 들어, 모든 인스턴스에서 공유되어야 하는 카운터 값이나 설정 값 등이 있다면, static 변수를 변경하는 것이 유용합니다.
 */
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticDemo02 {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();

        Counter.displayCount();  // Count: 2
        /*
         * 여기서 count 변수는 각 객체에서 공유되며,
         * 객체가 생성될 때마다 카운터 값이 증가합니다.
         *  이러한 상황에서는 static 변수를 변경하는 것이 유용하고 적절합니다.
         */
    }
}
