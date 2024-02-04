package chapter3;

public class Exam009 {

	public static void main(String[] args) {

		// 비교 연산자

		double a = 3.14;
		double b = 5.14;

		System.out.println(a == b); // false
		System.out.println(a != b); // true

		/*
		 * 문자열의 경우 equals() 메서드를 이용해서 값을 비교한다.
		 */

		String c1 = "Hello JAVA!"; // 문자열 리터럴
		System.out.println(c1.equals("Hello java!")); // false
		System.out.println(c1.equals("Hello JAVA!")); // true

		String c2 = "Hello JAVA!"; // "Hello JAVA!" 은 문자열 리터럴이다.
		String c3 = new String("Hello JAVA!");

		System.out.println(c1 == c2); // true
		System.out.println(c1 == c3); // false
		System.out.println(c2 == c3); // false

		System.out.println(c1.equals(c2)); // true
		System.out.println(c1.equals(c3)); // true
		System.out.println(c2.equals(c3)); // true

		String c11 = "Hello JAVA JAVA";

		System.out.println(c11.equals("Hello JAVA JAVA"));
	}

}
