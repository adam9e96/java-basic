package chapter13.car;
// 2
public class Car2 {
    String color; // 색상
    String gearType; // 변속기 종류
    int door; // 문의 개수

    Car2() {
//        this.color = "white";
//        this.gearType = "auto";
//        this.door = 4;
        this("white","auto",4);
    }
    // 같은 변수가 충돌할 경우 유효범위에 따라 우선순위가 달라진다.
    // 필드의 color 보다 생성자에 선언된 color가 유효 범위가 더 적으므로
    // 우선순위가 더 높다.

    Car2(String color) {
//        this.color = color;
//        this.gearType = "auto";
//        this.door = 4;
            this(color,"auto",4);
    }
    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

}
