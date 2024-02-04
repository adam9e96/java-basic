package backJoon;

import java.util.Scanner;

public class Main {
	/*
	 * 4분면 계산하기
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if (x > 0) {
			if (y > 0) {
				System.out.println("1");
			} else {
				System.out.println("4");
			}
		} else if (x < 0) {
			if (y > 0) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}
		scanner.close();
	}

}
