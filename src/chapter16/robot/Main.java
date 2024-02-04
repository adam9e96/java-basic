package chapter16.robot;

public class Main {
    // instanceof 를 사용해서 객체의 타입에 맞는 메서드가 실행되는 action 메서드를 작성하시오.
    public static void action(Robot robot) {
        if (robot instanceof DanceRobot) {
//            System.out.println("DanceRobot");
            DanceRobot danceRobot = (DanceRobot) robot;
            danceRobot.dance();
        } else if (robot instanceof SingRobot) {
//            System.out.println("SingRobot");
            SingRobot singRobot = (SingRobot) robot;
            singRobot.sing();
        } else if (robot instanceof DrawRobot) {
//            System.out.println("DrawRobot");
//        f    DrawRobot drawRobot = (DrawRobot) robot;
//            drawRobot.draw();
            ((DrawRobot) robot).draw(); // 한줄로도 된다. (DrawRobot) robot 로 타입변환하고 .draw 하면 먹힌다.
        }

    }

    public static void main(String[] args) {
        Robot[] robots = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for (Robot robot : robots) {
            action(robot);
        }
    }
}
