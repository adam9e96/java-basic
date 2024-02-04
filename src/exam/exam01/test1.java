package exam.exam01;

import java.util.Random;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int answer = random.nextInt(1000) + 1;
		int count = 0;
		int user = 0;
		System.out.println(answer);
		while (true) {
			System.out.print("정답을 추측하여 보시오: ");
			user = scanner.nextInt();
			count++;
			if (answer != user) {
				if (answer > user) {
					System.out.println("제시한 정수가 낮습니다.");
				} else if (answer < user) {
					System.out.println("제시한 정수가 높습니다.");
				}
			} else {
				break;
			}
		}
		System.out.println("정답입니다. 축하합니다. 시도횟수는 " + count + "회입니다.");
		scanner.close();
	}

}
