package chapter12.rocket;

/**
 * Rocket 클래스는 로켓의 위치를 나타내며, 로켓의 위치 정보를 출력하고 이동하는 기능을 제공
 */
public class Rocket {
    /**
     * 로켓의 X 좌표
     */
    int x;
    /**
     * 로켓의 Y 좌표
     */
    int y;

    /**
     * 주어진 좌표로 Rocket 객체를 생성
     *
     * @param x 로켓의 초기 x 좌표
     * @param y 로켓의 초기 y 좌표
     */
    Rocket(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 로켓의 현재 위치 정보를 문자열로 반환
     *
     * @return 로켓의 현재 위치 정보
     */
    public String printInfo() {
//        String str = "x: " + x + ", y: " + y;
//        return str;
        return "x: " + x + ", y: " + y;
    }

    /**
     * 로켓을 위쪽으로 한 칸 이동
     */
    public void moveUp() {
        ++y;
    }
}
