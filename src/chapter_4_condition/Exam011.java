package chapter_4_condition;

public class Exam011 {
	public static void main(String[] args) {
		/*
		 * 비트 연산자 10진수를 2진수로 변경해서 연산하고, 그 후에는 10진수로 변환
		 */
		int a = 15; // 1111
		int b = 5; // 0101

		System.out.println(a | b); // 1111 -> 15
		System.out.println(a & b); // 0101 -> 5
		System.out.println(a ^ b); // 1010 -> 10

		System.out.println(a >> 2); // 1111 -> 0011 -> 3
		System.out.println(b << 4); // 01010000 -> 80

		System.out.println("===================================");

		int numDec = 10; // 10진수
		int numBin = 0B1010; // 2진수
		int numOct = 012; // 8진수
		int numHex = 0XA; // 16진수

		System.out.println(numDec);
		System.out.println(numBin);
		System.out.println(numOct);
		System.out.println(numHex);
		/*
		 * 10진수를 쓰든 16진수를 쓰든 메모리에는 2진수로 저장되고 컴퓨터는 2진수로만 알아듣는다.
		 */

	}
}
