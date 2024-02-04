package chapter13.car;

public class Car3 {
    // 핃드 선언
    private int speed;
    private boolean stop;

    // speed 필드의 Getter/Setter 선언
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0; // 0보다 작은 경우 0으로 초기화 하고 종료.
            return;
        } else {
            this.speed = speed; // 0 보다 큰 경우 값을 저장
        }
    }

    // stop 필드의 Getter/Setter 선언
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop == true) this.speed = 0;
    }
}
