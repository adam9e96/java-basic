package chapter10;

//created : 2024-01-10
//updated : 2024-01-10
public class CallByString03 {
	public static void setAddress(StringBuffer addr) {
		addr.append("경기도 수원시 장안구");
	}

	/*
	 * String이 아닌 다른 문자열 관련 데이터 타입인 StringBuffer 같은 경우는 참조 호출이 됨.
	 * 
	 */
	public static void main(String[] args) {
		StringBuffer address = new StringBuffer("서울시 강남구 논현동");

		System.out.println("메서드 호출 전");
		System.out.println("address: " + address); // addres : 서울시 강남구 논현동

		setAddress(address);

		System.out.println("메서드 호출 후");
		System.out.println("address: " + address); // 경기도 수원시 장안구
	}
}
