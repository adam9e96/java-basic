package chapter5;

import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {

		/*
		 * 가위바위보 게임 가위(1), 바위(2), 보(3)를 입력 받고 컴퓨터는 random 으로 발생하여 가위바위 보 게임을 진행한다.
		 * 
		 * 입력 예) 가위(1), 바위(2), 보(3) 중 하나를 입력하세요 :1 출력 예) 당신은 1입니다. 컴은 1입니다. 비겼습니다. 입력 예)
		 * 가위(1), 바위(2), 보(3) 중 하나를 입력하세요 :1 출력 예) 당신은 3입니다. 컴은 2입니다. 당신이 이겼습니다.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>>");

		int user = scanner.nextInt();
		int com = (int) (Math.random() * 3) + 1; // 1~3

		System.out.printf("당신은 %d 입니다. \n", user);
		System.out.printf("컴은 %d 입니다.", com);

		String a = "";

		if (user > 0 && user < 4) {
			switch (user - com) {
			case 0:
				a = "비겼습니다.";
				break;
			case 1:
				a = "이겼습니다.";
				break;
			case 2, -1:
				a = "졌습니다.";
				break;

			}
		} else {
			a = "입력값이 잘못되었습니다.";
		}
		System.out.println(a);
		scanner.close();
	}
}
