package chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_01_Array_03 {
	public static void main(String[] args) {
		/* 키보드로 부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
        실행결과를 보고 알맞게 작성해 보세요.

        실행 예)
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 1
        학생수> 3
        [0, 0, 0]
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 2
        scores[0]> 90
        scores[1]> 80
        scores[2]> 70
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 3
        scores[0]: 90
        scores[1]: 80
        scores[2]: 70
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 4
        최고 점수: 90
        평균 점수: 80.0
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 5
        프로그램 종료
         */
		boolean run = true; // 반복문의 조건으로 사용 -> 값이 false가 된다면 반복문이 종료
		int studentNum = 0; // 학생수
		int[] scores = null; // 점수를 입력 받을 빈 배열 생성. 사용자에게 입력받은 학생수를 기준으로 배열 생성.
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				// 작성 위치. 학생수를 입력 받아서 배열 생성
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();

				System.out.println("학생수:" + studentNum); // 테스트 코드
//				for (int i=0 ; i<=studentNum; i++) {
				scores = new int[studentNum];
//				}
				System.out.println(Arrays.toString(scores));
			} else if (selectNo == 2) {
				// 작성 위치. 생성된 배열의 갯수 만큼 점수 입력
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				// 작성 위치. 입력받은 배열의 값을 출력
				for (int i = 0; i < scores.length; i++) { // 테스트 코드
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
			} else if (selectNo == 4) {
				// 작성 위치. 최고 점수, 평균 점수 출력
//				int max = scores[0];
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
			} else if (selectNo == 5) {
				// 작성 위치. run 값 변경
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
