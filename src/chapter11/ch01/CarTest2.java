package chapter11.ch01;

public class CarTest2 {
    public static void main(String[] args) {
        // 같은 클래스를 가지고 만든 두 객체는 구조는 동일하지만 서로 다른
        // 저장공간을 가짐.
        Car myCar1 = new Car(); // car 인스턴스 생성
        Car myCar2 = new Car(); // car 인스턴스 하나 더 생성
        Car myCar3 = new Car();

        myCar1.color = "red"; // myCar1의 색상 : 빨강
        myCar2.color = "black"; // myCar2의 색상 : 검정
        myCar1.speedUp(); // myCar1 엑셀 메서드 호출
        myCar2.wiper(); // myCar2 와이퍼 메서드 호출

        System.out.println("myCar1의 색 : " + myCar1.color); // red
        System.out.println("myCar2의 색 : " + myCar2.color); // black
        System.out.println("myCar1의 속도 : " +myCar1.speed); // 1
        System.out.println("myCar2의 속도 : " +myCar2.speed); // 0
        System.out.println("myCar1의 와이퍼 자동 여부 : "+ myCar1.wiperOn); // false
        System.out.println("myCar2의 와이퍼 작동 여부 : "+ myCar2.wiperOn); // true

        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println(myCar3);
    }
}
