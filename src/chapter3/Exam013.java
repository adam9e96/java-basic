package chapter3;

public class Exam013 {
	/*
	 * 부호 연산자 연습 #대입 연산자
	 */
	public static void main(String[] args) {

		int a = 3;
		int b = 5;

		System.out.println(b); // 5
		b = a; // copy
		System.out.println(b); // 3

		System.out.println(a); // 3
		a += 1; // a = a + 1;
		System.out.println(a); // 4
		a /= 2; // a = a / 2;
		System.out.println(a); // 2
		a *= a; // a = a * a;
		System.out.println(a); // 4

		a %= 2; // a = a % 2;
		System.out.println(a); // 0

		System.out.println(b); // 3
		b += 2; // b = b + 2;
		System.out.println(b); // 5
		b += 3; // b = b + 3;
		System.out.println(b); // 8

		System.out.println("=========================");

		int result = 0;
		result += 10;
		System.out.println("result=" + result);
		result -= 5;
		System.out.println("result=" + result);
		result *= 5;
		System.out.println("result=" + result);
		result /= 3; // 몫
		System.out.println("result=" + result);
		result %= 3;
		System.out.println("result=" + result);
	}

}
