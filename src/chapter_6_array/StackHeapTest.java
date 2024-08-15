package chapter_6_array;

//created : 2024-01-9
//updated : 2024-01-10
import java.util.Scanner;

public class StackHeapTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = "123";
		String str2 = new String("123");
		String str3 = "123";
		String str4 = "가나다";
		String str5;
		str5 = new String("가나다");
		String str6 = "가나다";

//		System.out.print("첫번째 정수 입력 >>> ");
//		int userInput = scanner.nextInt();
//		System.out.print("두번째 정수 입력 >>> ");
//		int userInput2 = scanner.nextInt();

		System.out.print("첫번째 문자열 입력 >>> ");
		String userStringInput = scanner.nextLine();
		System.out.print("두번째 문자열 입력 >>> ");
		String userStringInput2 = scanner.nextLine();

		System.out.println(str1 == str2); // false
		System.out.println(str1 == str3); // true

		System.out.println(); 

		System.out.println(str4 == str5); // false
		System.out.println(str4 == str6); // true

//		System.out.println(userInput == userInput2);
		System.out.println("scanner로 생성한 문자열 비교 : " + (userStringInput == userStringInput2));
		System.out.println("scanner로 생성한 문자열 equals()로 비교 : " + userStringInput.equals(userStringInput2));
		scanner.close();
	}

}
