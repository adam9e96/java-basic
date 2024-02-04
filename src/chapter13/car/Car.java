package chapter13.car;

/*
created : 2024-01-15
updated : 2024-01-15
page : 1
 */
/*
    생성자 오버로딩
    매개변수가 있는 생성자
 */
public class Car {
    String color; // 색상
    String gearType; // 변속기 종류
    int door; // 문의 개수

    // 기본 생성자
    Car() {

    }

    // 매개변수가 있는 생성자
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
