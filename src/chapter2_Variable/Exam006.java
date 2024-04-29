package chapter2;

public class Exam006 {
	public static void main(String[] args) {
		/*
		 * 논리 부정 연산자(!) 참(true) 을 거짓(false)으로, 
		 * 거짓(false)을 참(true)으로 바꾸는 연산자
		 */
		boolean a = true;
		boolean b = false;
		boolean c = !b; // b의 값을 반대로 바꾸어 입력

		System.out.println(a); // true
		System.out.println(!a); // false

		System.out.println(b); // false
		System.out.println(c); // true
	}
}
