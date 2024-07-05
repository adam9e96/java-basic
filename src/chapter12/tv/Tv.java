package chapter12.tv;

/**
 * Tv 클래스는 텔레비전 객체를 정의하며, 전원 상태와 채널을 조작하는 메서드를 제공합니다.
 */
public class Tv {
    // Tv의 속성(멤버변수)
    /**
     * Tv 색상
     */
    String color; // 색상 //null 쵝값
    /**
     * TV의 전원 상태
     */
    boolean power; // 전원상태 ( on/ off) // false
    /**
     * TV 의 채널값
     */
    int channel; // 채널 // 0
    /*
    객체 생성 시 초기값이 null, false, 0으로 초기화가
    되기 떄문에 직접 초기값을 넣을 필요 없다.
    메서드내에서 지역변수를 선언하면 초기화를 직접해줘야함.
     */


    // Tv의 기능 (메서드)
    void powerClick() {  // Tv를 켜거나 끄는 기능을 하는 메서드
        power = !power;
    }

    void channelUp() { // Tv의 채널을 높이는 기능을 하는 메서드
        ++channel;
    }

    void channelDown() { // Tv의 채널을 낮추는 기능을 하는 메서드
        --channel;
    }

    public boolean getPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

}
