package chapter2;

public class MyVar_07 {
	/*
	 * + 연산에서의 문자열 자동 변환
	 * + 연산자는 두 가지 기능 a + b
	 * 1) 피연산자가 숫자일 경우에는 덧셈 연산
	 * 2) 피연산자 중 하나라도 문자열이면 나머지 피연산자도 문자열로 자동 변환되어서 문자열 결합 연산을 수행
	 */
	public static void main(String[] args) {
		// 숫자 결합 연산
		int value = 10 + 2 + 8;
		System.out.println("value : " + value); // 20

		// 문자 결합 연산
		String str1 = 10 + 2 + "8"; // "12"+"8";
		System.out.println("str1 : " + str1); // 128;
		// 연산자는 왼쪽에서 오른쪽으로 순서대로 실행이 되기 때문에
		// 12 + "8" 이 됨 이게 문자열을 만나서 숫자도 문자열로 변환되어 "12"+"8" 이 되고 출력하면 128로 나옴

		// ================================

		String str2 = 10 + "2" + 8; // 1028
		System.out.println("str2 : " + str2); // 10+ "2"를 먼저 연산하게 되는데 문자열을 만나서 10도 문자열이 됨

		String str3 = "10" + 2 + 8; // 1028 // 계산순서 상 "10"+2 를 계산하게 되는데 바로 문자열을 만나서 2도 문자열로 변환되고 이후 8도 문자열로 변환되어 계산됨
									// "10"+"2"+"8"
		System.out.println("str3 : " + str3); // "102"+8

		String str4 = "10" + (2 + 8); // 1010 // 어떤 계산이든 괄호가 제일 우선 순위이기 때문에 괄호 부터 계산하면 "10" + 10 이므로 1010 문자열이 된다.
		System.out.println("str4 : " + str4);

		String str5 = "9" + 9.1 + 3; // 99.13
		System.out.println("str5 : " + str5);
		
		// TODO
		double str6 = '6' + 9.1 + 3; // 99.13 . '6' + 12.1
		System.out.println("str6 : " + str6);
	}
}
