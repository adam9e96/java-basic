package chapter4;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		/* 조건문을 잘못만들면 잘못된 결과가 나온다.
		* 0 ~ 100까지 입력이 됨
		* 미 취학 아동 : 0 ~ 7
		* 초등학생 : 8 ~ 13
		* 중, 고등학생 : 14 ~ 19
		* 일반인 : 20 ~ 
		*  */
//		int age = 12;
		System.out.print("나이입력>>");
		Scanner scanner = new Scanner(System.in);

		int age = scanner.nextInt();
		int charge;

		if (!(age < 0 || age > 100)) {
			if (age < 8) {
				charge = 1000;
				System.out.println("미 취학 아동입니다.");
			} else if (age < 14) {
				charge = 2000;
				System.out.println("초등학생 입니다.");
			} else if (age < 20) {
				charge = 2500;
				System.out.println("중, 고등학생 입니다.");
			} else {
				charge = 3000;
				System.out.println("일반인 입니다.");
			}
			System.out.println("입장료는 " + charge + "원입니다.");
		} else {
			System.out.println("0~ 100 사이의 값을 입력하세요.");
		}
		scanner.close();
	}
}
