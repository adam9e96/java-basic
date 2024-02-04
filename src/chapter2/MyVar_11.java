package chapter2;

public class MyVar_11 {
	public static void main(String[] args) {

		// 정수와 정수의 연산의 결과 값은 정수. 정수와 실수 연산의 결과 값은 실수

		byte kor, math, eng;
		kor = 55;
		math = 99;
		eng = 87;

		int sum = kor + math + eng; // 정수끼리와의 합
		System.out.println("총점 : " + sum); // 총점 : 241

		int avg_01 = sum / 3; // 정수끼리 나누는거라 소수점은 발생하지 않는다.
		System.out.println("평균 : " + avg_01); // 평균 : 80 정확한건 80.333...점

		double avg_02 = sum / 3; // 정수 / 정수. 이것도 위와 동일함 하지만 타입을 double로 지정했기 때문에 
		// .0이 붙는다.
		System.out.println("평균 : " + avg_02); // 평균 : 80.0

		double avg_03 = (double) sum / 3; // 실수 / 정수
		System.out.println("평균 : " + avg_03); // 평균 : 80.33333333333333

		double avg_04 = sum / 3.0; // 정수 / 실수
		System.out.println("평균 : " + avg_04); // 평균 : 80.33333333333333

		double avg_05 = (double) sum / 3.0; // 실수 / 실수
		System.out.println("평균 : " + avg_05); // 평균 : 80.33333333333333

	}
}
