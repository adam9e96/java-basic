package chapter10;

//created : 2024-01-10
//updated : 2024-01-10
public class CallByValue {
	/*
	 * 메서드 호출 방식 1. 값에 의한 호출 값에 의한 메서드 호출 방식은 메서드 호출 시에 값이 복사되어 전달. 
	 * 메서드의 매개변수 타입이  '기본형 데이터' 일 때 값에 의한 호출을 함.
	 */

	// 메서드 increase() 호출 시에 n 이라는 매개변수가 메모리에 생성되어
	// var1의 값인 100이 복사 되어 처리.
	// 메서드 실행이 종료되면 매개변수 n은 메모리에서 소멸.
	// 이 처럼 값에 의한 호출은 호출 시 매개변수로 전달되는 값이 복사되어 전달.
	// 따라서 var1의 값은 변하지 않음.
	static public int increase(int n) {
		++n;
		return n;
	}

	public static void main(String[] args) {
		int var1 = 100;
		int result = increase(var1);
		System.out.println("var1: " + var1 + ", result: " + result);

//			increase(result);
//			increase(result);
//			System.out.println(result);
//			System.out.println(var1);

	}
}
