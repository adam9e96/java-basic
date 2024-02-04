package chapter6;

import java.util.Scanner;

public class While_04 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String answer = "Y"; // while이 시작될 수 있도록 응답 값을 초기화

		int count = 0;

		while (answer.equals("Y") || answer.equals("y")) {
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = scanner.nextLine(); // 사용자의 응답을 받습니다.
			answer = answer.toUpperCase(); // 사용자가 입력한 문자를 대문자로 변환함(위의 or 대신해서 가능함)

			if (answer.equals("Y") || answer.equals("y")) {
				count++;
				System.out.println("음악을 " + count + "번 재생했습니다.");
			}
		}
		System.out.println("재생종료");
		scanner.close();
	}
}
