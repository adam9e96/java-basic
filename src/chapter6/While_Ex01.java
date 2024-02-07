package chapter6;

import java.util.Random;
/**
 * ===========================================================
 * fileName       : While_Ex01
 * date           : 2024-01-24
 * description    :
 * ===========================================================
 */
public class While_Ex01 {
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
