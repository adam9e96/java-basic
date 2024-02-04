package chapter16.poly;

public class Main2 {
    public static void main(String[] args) {
        /*
        instanceof 연산자
        a instanceof B : a는 B의 객체이면 true 반환
         */
        FireEngine fireEngine = new FireEngine();

        if (fireEngine instanceof FireEngine) { // fireEngine은 FireEngine 의 객체이다.
            System.out.println("This is a FireEngine instance");
        }
        if (fireEngine instanceof Car) { // fireEngine 은 Car의 객체이다.
            System.out.println("This is a Car instance");
        }
        if (fireEngine instanceof Object) { // fireEngine은 Object의 객체이다.
            System.out.println("This is an Object instance.");
        }
        System.out.println();

        System.out.println("============================================================");
        Car polyFireEngine = new FireEngine(); // 다형성 사용해서 참조 변수 만듬.

        if (polyFireEngine instanceof FireEngine) { // fireEngine은 FireEngine 의 객체이다.
            System.out.println("This is a FireEngine instance");
        }
        if (polyFireEngine instanceof Car) { // fireEngine 은 Car의 객체이다.
            System.out.println("This is a Car instance");
        }
        if (polyFireEngine instanceof Object) { // fireEngine은 Object의 객체이다.
            System.out.println("This is an Object instance.");
        }
        System.out.println();
        /*
        이게 되면 해당 타입으로 올 수 있다는 거임.
         */

        System.out.println("=================================================================");
        // 핵심은 다형성이다
        // 여기서 참조변수 A 가 instanceof B 의 인스턴스냐 할때 올 수 있는건 자신과 부모 뿐이다.
        Car car = new Car(); // 부모 클래스로 객체 생성

        // 이건 false임
        if (car instanceof FireEngine) { // 부모 클래스로 객체 생성
            System.out.println("This is a FireEngine instance");
        }
        if (car instanceof Car) { // car는 Car의 객체이다.
            System.out.println("This is a Car instance");
        }
        if (car instanceof Object) { // car는 Object의 객체이다.
            System.out.println("This is an Object instance.");
        }

    }
}
