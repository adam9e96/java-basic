package chapter12.rocket;

public class Rocket {
    int x;
    int y;

    Rocket(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String printInfo() {
//        String str = "x: " + x + ", y: " + y;
//        return str;
        return "x: " + x + ", y: " + y;
    }

    public void moveUp() {
        ++y;
    }
}
