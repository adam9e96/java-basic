package chapter_4_condition;

import java.util.Scanner;
/**
 * ===========================================================
 * fileName       : Switch_Ex03
 * date           : 2024-02-04
 * description    : 스위치문_예제_03
 * ===========================================================
 */
public class Switch_Ex03 {
	public static void main(String[] args) {
		/*
		 * 문제2) 영문 대문자를 입력받아
		 * 'A'이면 "훌륭합니다.",
		 * 'B'이면 "좋습니다.",
		 * 'C'이면 "보통입니다.",
		 * 'D'이면 "노력하세요.",
		 * 그외 문자는 "잘못입력하셨습니다." 라고 출력하는 프로그램
		 */
		Scanner scanner = new Scanner(System.in);

		String d = scanner.next();
		String c = "";

		char b = d.charAt(0);
		int a = d.length();

		if (a == 1) { // 한글자만 입력한 경우만 true
			switch (b) {
			case 'A':
				c = "훌륭합니다.";
				break;
			case 'B':
				c = "좋습니다.";
				break;
			case 'C':
				c = "보통입니다.";
				break;
			case 'D':
				c = "노력하세요";
				break;
			default:
				c = "잘못 입력하셨습니다.";
			}
		} else {
			c = "한글자만 입력하세요.";
		}
		System.out.println(c);
		scanner.close();
		/*
		 * charAt() 메소드
		 * 우선 Scanner 에 대해 알아야 한다. Scanner는 char 타입으로는 입력을 받을 수 없고 String 타입으로 입력 받을 수 있는데
		 * 받는 방법이 2개가 있다. char 타입으로 한글자를 입력 받으려면 결국 String 타입으로 받아야하는데 이 때 등장한 것이
		 * charAt() 메소드이다.  charAt(인덱스번호); 인덱스 번호가 0이면 첫글자를 반환.
		 *
		 * e.g) String 으로 저장된 문자열 중에서 한 글자만 선택해서 char 타입으로 변환해주는 기능을 한다.
		 * 
		 */
	}
}
