package chapter7;

public class Exam_06 {
	public static void main(String[] args) {
		int[] student; // 힙공간의 배열의 주소가 저장될 변수 생성.
		student = new int[3]; // 힙공간의 길이가 3인 배열 생성(연속된 주소를 가짐)하고 주소를 반환.
//		int[] student = new int[3];
		// 정수 배열이 생성이 되고, 초기화를 하지 않으면 자동으로 0으로 초기화
		System.out.println("현재 자동으로 초기화된 값: " + student[0]);
		System.out.println("현재 자동으로 초기화된 값: " + student[1]);
		System.out.println("현재 자동으로 초기화된 값: " + student[2]);
//		System.out.println("현재 자동으로 초기화된 값: "+ student[3]); <- 에러뜸

		// 인덱스를 이용하여서 개별 요소의 값을 변경.
		student[0] = 30; // 배열의 첫 번째 요소에 30을 저장
		student[1] = 20; // 배열의 두 번쨰 요소에 20을 저장
		student[2] = 10; // 배열의 세 번째 요소에 10을 저장
//		student[3] = 20; // 배열의 세 번째 요소에 10을 저장 <-- 에러뜸

		System.out.println("현재 첫 번째 요소의 값: " + student[0]);

		student[0] = 12;
		System.out.println("재수정 첫 번째 요소의 값: " + student[0]);
	}
}
