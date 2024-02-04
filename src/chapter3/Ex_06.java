package chapter3;

import java.util.Scanner;

public class Ex_06 {
	public static void main(String[] args) {
		/*
		 * 사용자로 부터 두 개의 정수를 입력 받아서 
		 * 정수의 합, 정수의 차, 정수의 곱, 정수의 평균, 큰 수, 작은 수를
		 * 계산하여 화면에 출력하는 프로그램을 작성하시오.
		 * 큰 수와 작은 수를 구할 때는 조건연산자(삼항연산자)를 이용하시오.
		 * 
		 * x: 5
		 * y: 7
		 * 
		 * 두 수의 합 : 12
		 * 두 수의 차 : -2
		 * 두 수의 곱 : 35
		 * 두 수의 평균 : 6.0
		 * 큰 수 : 7
		 * 작은 수 : 5
		 */
		Scanner scanner = new Scanner(System.in);

		int x, y, sum, sub, mul, bigNumber, smallNumber;
		double avg;
		System.out.println("두 개의 정수를 입력하세요.");
		System.out.print("x : ");
		x = scanner.nextInt();
		System.out.print("y : ");
		y = scanner.nextInt();

		sum = x + y;
		sub = x - y;
		mul = x * y;
		avg = (double) (x + y) / 2;
		bigNumber = (x > y) ? x : y;
		smallNumber = (x < y) ? x : y;

		System.out.println("두 수의 합 :" + sum);
		System.out.println("두 수의 차 :" + sub);
		System.out.println("두 수의 곱 :" + mul);
		System.out.println("두 수의 평균 : " + avg);
		System.out.println("큰 수 : " + bigNumber);
		System.out.println("작은 수 : " + smallNumber);
		// 두 수가 같은 경우를 위해 삼항연산자 조건식을 >= <=을 안한이유
		// 둘 다 같으면 크고 작음을 고려할 필요가 없기 때문에 무시하도록하면된다.
		scanner.close();
	}
}
