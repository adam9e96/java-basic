package chapter3;

public class AccuracyExample1 {
	public static void main(String[] args) {

		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;

		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		// 사과 1개에서 남은 양: 0.29999999999999993
		/*
		 * result 변수의 값이 정확히 0.3이 되지 않는 이유 
		 * float, double과 같은 실수 타입은 부동 소수점 방식을 사용하기 
		 * 때문이다. 정확한 계산이 필요하다면 정수 연산으로 변경해서 하는 것이 좋다.
		 */
		// ===
		apple = 1;
		int totalPieces = apple * 10;
		number = 7;

		int result2 = totalPieces - number;
		System.out.println("10조각에서 남은 조각 : " + result2);
		System.out.println("사과 1개에서 남은 양 : " + result2 / 10.0); // 정수 10으로 나누면 몫이 0이고 정확하게 안된다.
	}
}
