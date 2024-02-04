package chapter9;

//created : 2024-01-9
//updated : 2024-01-10
public class Method_Ex2 {
	// 매개변수, 반환 값 모두 있는 경우
	public int add(int a, int b) {
		int c = a + b;
		return c;
		// return 다음에 위치하는 데이터는 반드시 메서드의 리턴 타입과 일치해야 함
		// return 3.5; // 리턴 타입과 다른 데이터 형을 반환하면 오류가 발생.
//		return 3.5;
		// return 값으로 자동형변환이 되는 경우는 문제는 없음.
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result = 0;

		Method_Ex2 method = new Method_Ex2();
		result = method.add(num1, num2);
		System.out.println("두수의 합은 " + result); // 메서드의 반환 값을 저장해서 출력
		System.out.println("두수의 합은 " + method.add(num1, num2)); // 메서드의 반환 값을 바로 출력
	}

}
