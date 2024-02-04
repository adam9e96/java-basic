package chapter10;

//created : 2024-01-10
//updated : 2024-01-10
import java.util.Arrays;
import java.util.Scanner;

public class Ex_11 {
//	static boolean run = true;
//	static int studentNum = 0;
//	static int[] scores = null;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// static 은 메인 메소드안에서 못씀
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) { // 처음엔 null 값이라 void 못함
				scores = inputStudentNum();
//				inputStudentNum(scores);
			} else if (selectNo == 2) {
				inputScores(scores);
			} else if (selectNo == 3) {
				printScores(scores);
			} else if (selectNo == 4) {
				printAnalysis(scores);
			} else if (selectNo == 5) {
				run = setRun(); // 상태를 볼때는 set 값을 볼 때는 is
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();

	}

	public static int[] inputStudentNum() {
		// 학생수를 입력 받아서 배열 생성
		System.out.print("학생수> ");
		int studentNum = scanner.nextInt();

		System.out.println("학생수:" + studentNum); // 테스트 코드
		int[] scores = new int[studentNum];
		System.out.println(Arrays.toString(scores));

		return scores;
	}
//	public static void inputStudentNum(int[] scores) {
//		// 학생수를 입력 받아서 배열 생성
//		System.out.print("학생수> ");
//		int studentNum = scanner.nextInt();
//		
////		System.out.println("학생수:" + studentNum); // 테스트 코드
//		scores = new int[studentNum];
//		System.out.println(Arrays.toString(scores));
//		
//	}

	public static void inputScores(int[] scores) {
		// 생성된 배열의 갯수 만큼 점수 입력
		for (int i = 0; i < scores.length; i++) {
			System.out.print("scores[" + i + "]> ");
			scores[i] = scanner.nextInt();
		}
	}

	public static void printScores(int[] scores) {
		// 입력받은 배열의 값을 출력
		for (int i = 0; i < scores.length; i++) { // 테스트 코드
			System.out.println("scores[" + i + "]:" + scores[i]);
		}
	}

	public static void printAnalysis(int[] scores) {
		// 최고 점수, 평균 점수 출력
		int max = 0;
		double avg = 0;
		int sum = 0;
		for (int i = 0; i < scores.length; i++) { // 4
			sum += scores[i];
			if (max <= scores[i]) {
				max = scores[i];
			}
		}
		avg = sum / (double) scores.length;
		System.out.println("최고점수 :" + max);
		System.out.println("평균점수 :" + avg);
	}

	public static boolean setRun() {
		return false;
	}
}
