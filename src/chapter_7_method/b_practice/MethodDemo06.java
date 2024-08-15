package chapter_7_method.b_practice;

import java.util.Scanner;

/**
 * 이 클래스는 로그인과 로그아웃 기능을 제공하는 메서드를 포함합니다.
 *
 * @since 2024.08.11
 */
public class MethodDemo06 {
	/**
	 * 프로그램의 진입점입니다.
	 * 사용자로부터 아이디와 비밀번호를 입력받아 로그인 여부를 확인하고,
	 * 로그인 성공 시 로그아웃 메시지를 출력합니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id, password;

		System.out.print("아이디를 입력해 주세요. >> ");
		id = scanner.nextLine();

		System.out.print("비밀번호를 입력해 주세요. >> ");
		password = scanner.nextLine();

		boolean result = login(id, password);

		if (result) {
			System.out.println("로그인 되었습니다.");
			logout(id);
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		scanner.close();
	}

	/**
	 * 사용자가 제공한 아이디와 비밀번호가 올바른지 확인합니다.
	 *
	 * @param id       사용자 아이디
	 * @param password 사용자 비밀번호
	 * @return 아이디가 "admin"이고 비밀번호가 "1234"인 경우 true, 그렇지 않은 경우 false
	 */
	public static boolean login(String id, String password) {
		return id.equals("admin") && password.equals("1234");
	}

	/**
	 * 사용자가 로그아웃되었음을 알리는 메시지를 출력합니다.
	 *
	 * @param id 로그아웃할 사용자 아이디
	 */
	public static void logout(String id) {
		System.out.println(id + " 아이디가 로그아웃 되었습니다.");
	}
}
