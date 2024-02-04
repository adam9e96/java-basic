package chapter3;

import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		/*
		 * Scanner.nextLine() : 문자열 입력
		 */
		String name;
		int age;
		String sex;

		Scanner scanner = new Scanner(System.in);

		System.out.print("이름을 입력하시오: ");
		name = scanner.nextLine(); // 문자열 입력

		System.out.println("나이를 입력하시오: ");
		age = scanner.nextInt(); // 정수 입력

		System.out.println("성별을 적으세요: ");
		sex = scanner.next();

		System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");
		System.out.println("성별은 " + sex + "이군요");
		scanner.close();
	}
}
