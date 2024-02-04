package chapter12;
/*
title:클래스연습(2)
created:2023-01-12
updated:2023-01-12
 */
public class Tv {
    // Tv의 속성(멤버변수)
    String color; // 색상 //null 쵝값
    boolean power; // 전원상태 ( on/ off) // false
    int channel; // 채널 // 0
    /*
    객체 생성 시 초기값이 null, false, 0으로 초기화가
    되기 떄문에 직접 초기값을 넣을 필요 없다.
    메서드내에서 지역변수를 선언하면 초기화를 직접해줘야함.
     */


    // Tv의 기능 (메서드)
    void power() {  // Tv를 켜거나 끄는 기능을 하는 메서드
        power = !power;
    }

    void channelUp() { // Tv의 채널을 높이는 기능을 하는 메서드
        ++channel;
    }

    void channelDown() { // Tv의 채널을 낮추는 기능을 하는 메서드
        --channel;
    }
    public boolean getPower(){
        return power;
    }
    public void setPower(boolean power){
        this.power = power;
    }

}
