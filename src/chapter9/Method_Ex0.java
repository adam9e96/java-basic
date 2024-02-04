package chapter9;

//created : 2024-01-9
//updated : 2024-01-10
public class Method_Ex0 {
	// 매개변수와 리턴 타입이 없는 메서드
	public void print() {
		System.out.println("메서드를 호출한다.");
//		 리턴 타입이 없더라도 return 을 사용할 수 있음
//		 다만 return 다음에 값이 없어야 함.
//		 return 의 의미는 이 부분에서 메서드 실행을 종료하고 복귀한다는 의미.
//		 return
	}

	public static void main(String[] args) {
		// 사용할 메서드가 있는 클래스의 인스턴스 선언
		Method_Ex0 method = new Method_Ex0();
		method.print();
		method.print();
		method.print();

	}
}
