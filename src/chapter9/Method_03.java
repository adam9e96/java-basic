package chapter9;

//created : 2024-01-9
//updated : 2024-01-10
import java.util.Scanner;

public class Method_03 { // 밑에꺼가 매개변수이다.
	static int getMax(int a, int b, int c) { // a, b, c 의 최대값을 반환
		int max = a; // <--a는 정의 한적이 없는데 쓰이고있다. 함수를 호출한쪽에서 값 3개를 전달 받고(받기위한 매개변수를 만들어서 받음) 아무튼 <--
						// 매개변수임
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}

//	static void getMax(int a, int b, int c) { // a, b, c 의 최대값을 반환
//		int max = a; 
//		if (b > max) max = b;
//		if (c > max) max = c;
//	}
	/*
	 * The operator + is undefined for the argument type(s) String, void void 쓰면 이런
	 * 오류가 뜬다.
	 * 
	 * 
	 * Also here argument is of type int, and Operators like(*,+,..) won't work for
	 * argument type void and int so either change argument type or return type as
	 * mentioned above. 또한 여기서 인수는 int 유형이고 (*,+,..)와 같은 연산자는 인수 유형 void 및 int에 대해
	 * 작동하지 않으므로 위에서 언급한 대로 인수 유형이나 반환 유형을 변경합니다.
	 * 
	 * CallByValue 를 보면 이유를 알 수 있다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 a : ");
		int a = scanner.nextInt();
		System.out.print("정수 b : ");
		int b = scanner.nextInt();
		System.out.print("정수 c : ");
		int c = scanner.nextInt();
		// 여기는 메서드호출임. a,b,c는 인수 아규먼트임
		System.out.println("최대값은 " + getMax(a, b, c) + "입니다.");
		scanner.close();

		/*
		 * 메서드를 정의(작성)하고 값을 받을 매개변수를 만듬 메서드를 만들고 호출할때 전달해줄 값들을 인수라고 함. 전달받은 인수를 저장받을 변수를
		 * 매개변수라고함
		 * 
		 */
	}
}
