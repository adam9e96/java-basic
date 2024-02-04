package chapter3;

public class Exam008 {
	public static void main(String[] args) {
		/*
		 * 비교 연산자 비교를 해서 참인지 거짓인지 확인 하는게 목적. 
		 * 결과값은 true or false <- booelan 값
		 */
		int a = 10;
		int b = 20;
		int c = 30;

		double d = 0.1;
		double e = 0.1f;

		System.out.println(a < b); // true
		System.out.println(a > b); // false
		System.out.println(a + b <= c); // 산술 연산자가 비교 연산자 보다 먼저 실행된다. // true
		System.out.println(a + b >= c); // true

		System.out.println(a <= b + c);

		System.out.println(a == b + c); // b+c를 계산한 값이 a와 같은지

		System.out.println(d == e);
		System.out.println((float) d == e);
		/*
		 * float 타입과 double타입의 정밀도 차이로 false가 나옴 타입을 맞춰야함
		 */
	}
}
