package chapter_6_array.b_practice;

import java.util.Random;
import java.util.Scanner;

public class Array_Ex07 {

	public static void main(String[] args) {
		/*
	    간단한 가위바위보 게임 프로그램을 작성하라.
	    1) 가위, 바위, 보는 각각 정수형 1, 2, 3으로 간주한다.
	    2) 컴퓨터가 제시할 가위바위보 데이터를 만든다.
	    다섯개의 정수를 저장할 수 있는 배열을 만들고 1, 2, 3 데이터를 섞어 초기화 한다.
	    3) 게임은 총 5회 진행하며, 컴퓨터는 배열 안 데이터를 차례대로 출력하는 것으로 한다.
	    4) 현재 횟수 / 총 횟수와 함께 입력 메시지를 출력한다.
	    5) 키보드로 1, 2, 3 중 하나를 입력하고, 컴퓨터와 키보드로 입력한 값을 비교하여 누가 이겼는지 알려준다.
	    6) 비긴 경우에는 횟수에 포함하지 않는다.
	    7) 게임을 종료하면 누가 이겼는지 표시한다.

	    1 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.1
	    가위입력하셨고, 컴은 가위입니다.비겼습니다.
	    1 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.1
	    가위입력하셨고, 컴은 가위입니다.비겼습니다.
	    1 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.1
	    가위입력하셨고, 컴은 가위입니다.비겼습니다.
	    1 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.2
	    바위입력하셨고, 컴은 가위입니다.사용자가 이겼습니다.
	    2 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.3
	    보입력하셨고, 컴은 바위입니다.사용자가 이겼습니다.
	    3 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.1
	    가위입력하셨고, 컴은 가위입니다.비겼습니다.
	    3 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.2
	    바위입력하셨고, 컴은 가위입니다.사용자가 이겼습니다.
	    4 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.3
	    보입력하셨고, 컴은 가위입니다.컴이 이겼습니다.
	    5 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.2
	    바위입력하셨고, 컴은 바위입니다.비겼습니다.
	    5 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.1
	    가위입력하셨고, 컴은 바위입니다.컴이 이겼습니다.
	    게임 결과는 사용자가 이김
	     */
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] rokSisPap = new String[] { "가위", "바위", "보" };
		int userWin = 0;
		int comWin = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "/ 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시오.");
			int userInput = scanner.nextInt();
			int com = random.nextInt(3);
			
			if (userInput == 1) {
				if (com == 2) {
					System.out.println(rokSisPap[userInput - 1] + "입력하셨고, 컴은 " + rokSisPap[com] + "입니다. 사용자가 이겼습니다.");
					userWin++;
				} else if (com == 1) {
					System.out.println(rokSisPap[userInput - 1] + "입력하셨고, 컴은 " + rokSisPap[com] + "입니다. 컴이 이겼습니다.");
					comWin++;
				} else {
					System.out.println(rokSisPap[userInput - 1] + "입력하셨고, 컴은 " + rokSisPap[com] + "입니다. 비겼습니다.");
					i--;
				}
			} else if (userInput == 2) { //바위
				if (com == 2) {
					System.out.println(rokSisPap[userInput - 1] + "입력하셨고, 컴은 " + rokSisPap[com] + "입니다. 컴이 이겼습니다.");
					comWin++;
				} else if (com == 0) {
					System.out.println(rokSisPap[userInput - 1] + "입력하셨고, 컴은 " + rokSisPap[com] + "입니다. 사용자가 이겼습니다.");
					userWin++;
				} else { // 1
					System.out.println(rokSisPap[userInput - 1] + "입력하셨고, 컴은 " + rokSisPap[com] + "입니다. 비겼습니다.");
					i--;
				}
			} else { // 보
				if (com == 1) {
					System.out.println(rokSisPap[userInput - 1] + "입력하셨고, 컴은 " + rokSisPap[com] + "입니다. 사용자가 이겼습니다.");
					userWin++;
				} else if (com == 0) {
					System.out.println(rokSisPap[userInput - 1] + "입력하셨고, 컴은 " + rokSisPap[com] + "입니다. 컴이 이겼습니다.");
					comWin++;
				} else {
					System.out.println(rokSisPap[userInput - 1] + "입력하셨고, 컴은 " + rokSisPap[com] + "입니다. 비겼습니다.");
					i--;
				}

			}
		}

				String result = userWin > comWin ? "사용자" : "컴퓨터";
				System.out.println("게임결과는 " + result + "가 이김");
				System.out.println(userWin); // 테스트 코드
				System.out.println(comWin); // 테스트 코드

		scanner.close();
	}

}
