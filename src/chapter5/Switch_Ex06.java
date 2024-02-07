package chapter5;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : Switch_Ex06
 * date           : 2024-01-24
 * description    : 가위바위보 게임
 * * 가위바위보 게임 가위(1), 바위(2), 보(3)를 입력 받고 컴퓨터는 random 으로 발생하여 가위바위 보 게임을 진행한다.
 * *
 * * 입력 예) 가위(1), 바위(2), 보(3) 중 하나를 입력하세요 :1
 * * 출력 예) 당신은 1입니다. 컴은 1입니다. 비겼습니다.
 * * 입력 예) 가위(1), 바위(2), 보(3) 중 하나를 입력하세요 :1
 * * 출력 예) 당신은 3입니다. 컴은 2입니다. 당신이 이겼습니다.
 * ===========================================================
 */
public class Switch_Ex06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>>");

        int userChoice = scanner.nextInt();
        int computerChoice = (int) (Math.random() * 3) + 1; // 1~3

        System.out.printf("당신은 %d 입니다. \n", userChoice);
        System.out.printf("컴은 %d 입니다.", computerChoice);

        String result = "";
//        if (userChoice >= 1 & userChoice <= 3) {
//            if (userChoice == computerChoice) {
//                result = "비겼습니다.";
//            } else if ((userChoice == 1 && computerChoice == 3) ||
//                    (userChoice == 2 && computerChoice == 1) ||
//                    (userChoice == 3 && computerChoice == 2)) {
//                result = "이겼습니다.";
//            } else {
//                result = "졌습니다.";
//            }
//        } else {
//            result = "입력값이 잘못되었습니다.";
//        }
//        System.out.println(result);
//        scanner.close();


        switch (userChoice) {
            case 1:
            case 2:
            case 3:
                switch (userChoice - computerChoice) {
                    case 0:
                        result = "비겼습니다.";
                        break;
                    case 1:
                    case -2:
                        result = "이겼습니다.";
                        break;
                    default:
                        result = "졌습니다.";
                }
                break;
            default:
                result = "잘못된 선택입니다.";
        }

        System.out.println(result);
        scanner.close();
    }
}
