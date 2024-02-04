package chapter6;

import java.util.Random;

public class Ex_While_01 {
	public static void main(String[] args) {
		/*
		 * int nextInt(int n) int 타입의 0 ~ 매개값 미만 까지의 난수를 리턴.
		 * Random random = new Random();
		 * num1 = random.nextInt(6) + 1;
		 */
		Random random = new Random();
		int num1 = random.nextInt(6) + 1;
		int num2 = random.nextInt(6) + 1;
		System.out.println("(" + num1 + ", " + num2 + ")");
	}
}
