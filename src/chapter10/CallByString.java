package chapter10;
//created : 2024-01-10
//updated : 2024-01-10
public class CallByString {
	/*
	 * 2. 문자열에 의한 호출 방식 예외적으로 문자열을 전달하려면 참조형 데이터라 할지라도 값에 의한 호출을 함.
	 * 
	 * 이렇게 된 이유 참조자료형이긴 한데 ㅈㄴ 많이 써서 원래는 String도 new를 이용한 방식이 맞다. ㅈㄴ 많이 써서 string만
	 * 예외를 두기로 했다. String new 키워드를 쓴게 StringBuffer StringBuiler
	 */
//	public static void setAddress(String addr) {
//		addr = " 경기도 수원시 장안구";
//		
//	}
	public static String setAddress(String addr) {
		addr = " 경기도 수원시 장안구";
		return addr;
	}

	public static void main(String[] args) {
		String address = "서울시 강남구 논현동";

		System.out.println("메서드 호출 전");
		System.out.println("address: " + address); // address : 서울시 강남구 논현동

		address = setAddress(address); // 리턴을 주더라도 여기서 값을 전달받지 않으면 그대로다.

		System.out.println("메서드 호출 후");
		System.out.println("address:" + address); // address : 서울시 강남구 논현동

		// 문자열 리터럴의 경우 스택에 저장되기 때문에 원본 값에 영향을 주지 않는다.

		// 만약 변경된 값을 받고 싶으면 리턴을 주면 된다.

	}
}
