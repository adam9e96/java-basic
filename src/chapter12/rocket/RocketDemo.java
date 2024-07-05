package chapter12.rocket;

public class RocketDemo {
    public static void main(String[] args) {

        Rocket rocket = new Rocket(10, 20);

        System.out.println(rocket.printInfo()); // x : 10, y : 20
        rocket.moveUp();
        rocket.moveUp();
        // 만약 아래와 같이 리턴값을 돌려줄 필요가 일을 때는 반환값이 있다는 뜻이다. 리턴값이 필요함
//        a = rocket.moveUp();
        System.out.println(rocket.printInfo()); // x : 10, y : 22

        String b = rocket.printInfo();

        System.out.println(b);
    }
}
