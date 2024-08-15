package chapter11_Class.ch01;

public class Car {
    //힙 메모리 공간에 들어감
    boolean powerOn; // 시동
    String color; // 차량의 색상
    int wheel; // 바퀴의 수
    int speed; // 속력
    boolean wiperOn; // 와이퍼

    // 객체 메서드에 생성되는 변수는 스택에서 생성/삭제됨
    void power() {
        powerOn = !powerOn; // 시동 메서드 첫실행하면 기본값이 false 니까 true로 뱉어줌
    }

    void speedUp() {
        speed++; // 액셀 메서드
    }

    void speedDown() {
        speed--; // 브레이크 메서드
    }

    void wiper() {
        wiperOn = !wiperOn; // 와이퍼 메서드
    }
    // Ctrl + Shift + Alt + L : 정렬. 무작성하지말고 안쓰고도 될 정도로 연습하자.
}
