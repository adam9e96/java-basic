package chapter7;

import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 잔액이 10000원. 사용할 금액을 입력받아 잔액이 0원이 되도록
		int money = 10000;
		System.out.println("현재 가진 돈은 " + money + "원입니다.");

		while (money != 0) {
			System.out.print("얼마를 사용하시겠습니까? >>> ");
			int spendMoney = scanner.nextInt(); // 정수를 입력받음

			if (spendMoney <= 0 || spendMoney > money) {
				// 현재 가진 돈보다 크거나, 음수를 입력하면 다시 입력 요구
				System.out.println("다시 입력해 주세요(사용범위가 틀렸습니다.)");
				continue; // 현재의 반복을 벗어나서 다시 반복을 시작
			} else if (spendMoney > 1000) {
				System.out.println("한번에 출금 가능한 금액은 1000원 이하여야 합니다.");
				continue;
			}
			money -= spendMoney;
			System.out.println("이제 " + money + "원이 남았습니다.");
			// 남은 돈의 양 출력
		}
		System.out.println("모든 돈을 사용합니다. 종료");
		scanner.close();
	}
}
