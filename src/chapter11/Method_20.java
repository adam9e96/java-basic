package chapter11;

public class Method_20 {

	/*
	 * 메서드 내에서의 메서드 호출 메서드에서 다른 메서드를 호출하면 메서드는 동작을 멈추고, 다른 메서드가 종료 할 ㅤㄸㅒㅤ 까지 기다림. 호출한
	 * 메서드가 종료가 되면 나머지 코드가 실행 됨. main() -> firstMethod() -> secondMethod()
	 */
	/**
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음");	// 1
		firstMethod(); 	
		System.out.println("main(String[] args)이 끝났음"); // 6 
	}

	static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음"); // 2
		secondMethod();
		System.out.println("firstMethod() 이 끝났음"); // 5
	}

	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음"); // 3
		System.out.println("secondMethod()이 끝났음"); // 4
	}

}
