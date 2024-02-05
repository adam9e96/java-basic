package chapter3;

import java.util.Scanner; // Scanner 클래스를 사용하기 위해 필요한 패키지를 가져옴
/**
 * ===========================================================
 * fileName       : String03InputString
 * date           : 2024-01-24
 * description    : Scanner
 * 사용자에게 이름, 나이, 성별을 입력받아 출력하는 예제
 * ===========================================================
 */
public class String03InputString {
	public static void main(String[] args) {
		/*
		 * Scanner.nextLine() : 문자열 입력
		 */
		String name;
		int age;
		String sex;

		Scanner scanner = new Scanner(System.in); // 데이터를 읽기 위해 Scanner 객체를 생성

		System.out.print("이름을 입력하시오: ");
		name = scanner.nextLine(); // 문자열 입력

		System.out.println("나이를 입력하시오: ");
		age = scanner.nextInt(); // 정수 입력

		System.out.println("성별을 적으세요: ");
		sex = scanner.next(); // 문자열 입력

		System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");
		System.out.println("성별은 " + sex + "이군요");
		scanner.close(); // Scanner 객체를 닫아 자원을 해제
	}
}
