package chapter12.car03;

public class CarDemoStatic {
    //    인스턴스 변수는 각각의 인스턴스 마다 고유의 저장 공간을 가지고 있기 때문에
//    독립적으로 고유 값을 저장 가능.
    public static void main(String[] args) {

        // 클래스 변수는 클래스 이름으로 접근 가능
        System.out.println(Cars.wheel); // 클래스 이름으로 접근가능
//    System.out.println(Cars.speed); // 에러발생! 인스턴스 변수는 클래스 이름으로 접근 불가

        Cars myCar1 = new Cars();

        // 클래스 변수는 인스턴스를 통해서도 접근 가능합니다.
        System.out.println(Cars.wheel);
        // 인스턴스 변수는 인스턴스를 통해서 접근 가능합니다.
        System.out.println(myCar1.speed);

        Cars myCar2 = new Cars();

        System.out.println("<변경 전>");
        System.out.println("myCar1.speed: " + myCar1.speed); // 0
        System.out.println("myCar2.speed: " + myCar2.speed); // 0
        System.out.println("myCar1.wheel: " + myCar1.wheel); // 4
        System.out.println("myCar1.wheel: " + myCar2.wheel); // 4
//     클래스 변수도 인스턴스를 이용해서 접근은 가능하나,
//    가급적 인스턴스를 이용해서는 접근을 하지 않는 것이 좋음.

        myCar2.speed = 100;
        myCar2.wheel = 5;

        System.out.println("<변경 후>");
        System.out.println("myCar1.speed: " + myCar1.speed); // 0
        System.out.println("myCar2.speed: " + myCar2.speed); // 100
        System.out.println("myCar1.wheel: " + myCar1.wheel); // 5
        System.out.println("myCar2.wheel: " + myCar2.wheel); // 5
        // 인스턴스는 클래스 변수를 공유하기 때문에 같은 값이 됨.

    }
}
