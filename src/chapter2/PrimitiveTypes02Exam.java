package chapter2;

/*
 * ===========================================================
 * fileName       : PrimitiveTypes02Exam
 * date           : 2024-02-05
 * description    : 자바 기본 자료형 연습02
 * ===========================================================
 */
public class PrimitiveTypes02Exam {
	/*
	 * 534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 학생당 몇 개를 가질수 있고, 
	 * 최종적으로 몇 개가 남는지 구하는 코드
	 */
	public static void main(String[] args) {

		int pencils = 534;
		int students = 30;

		int temp1 = pencils / students;

		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = temp1; // 17
		System.out.println(pencilsPerStudent);

		int temp2 = pencils % students;
		// 남은 연필 수
		int pencilsLeft = temp2; // 24
		System.out.println(pencilsLeft);
		System.out.println("학생 한 명이 가지는 연필 수 : " + pencilsPerStudent + ", 남은 연필 수 : " + pencilsLeft);
	}

}
