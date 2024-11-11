package static_demo;

/*
 * Static 변수를 변경하지 말아야 할 경우:
 * 상태를 공유해서는 안 되는 경우: 공유 상태가 의도치 않게 변경되면,
 * 다른 부분에 영향을 미칠 수 있기 때문에 문제가 될 수 있습니다.
 * 예를 들어, 각 인스턴스마다 별도의 상태를 유지해야 하는데,
 * static 변수를 사용해서 하나의 인스턴스에서 상태를 변경하면 모든 인스턴스에 영향을 미칩니다.
 */
class MyClass02 {
    static String sharedState = "Initial";

    void changeState(String s) {
        sharedState = s;
    }
}

public class StaticDemo03 {
    public static void main(String[] args) {
        MyClass02 obj1 = new MyClass02();
        MyClass02 obj2 = new MyClass02();

        obj1.changeState("Changed by obj1");

        System.out.println(MyClass02.sharedState);  // Changed by obj1
        System.out.println(MyClass02.sharedState);  // Changed by obj1
        /*
         * 위 예제에서는 obj1이 상태를 변경하면 obj2에서도 그 상태가 바뀝니다.
         * 이런 경우에는 인스턴스 변수로 처리하는 것이 더 적절할 수 있습니다.
         */

    }
}
