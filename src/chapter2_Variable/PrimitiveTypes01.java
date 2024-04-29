package chapter2;

/*
 * ===========================================================
 * fileName       : PrimitiveTypes01
 * date           : 2024-01-06
 * description    : 기본형 타입 연습1
 * 형변환 연습
 * ===========================================================
 */
public class PrimitiveTypes01 {
	/*
	 * 형변환
	 */
	public static void main(String[] args) {
		/*
		 * 자동 형변환은 프로그램 작성자가 별도의 작업을 하지 않아도
		 * 자바가 알아서 알맞은 타입으로 변환.
		 * 작은 범위에서 큰 범위로 변경되는 경우 -> 값 손실이 없음
		 */
		byte a = 127; // byte가 가질 수 있는 최대값
		int b = a; // 자동 형변환 (byte -> int) 1-> 4byte 
		System.out.println(b);
		// a = b ; // float 자료형을 byte 변수에 대입하면 자동형변환이 안됨.
		// 이유
		
		
		float c = b ; // 자동형변환 (int -> float)
		System.out.println(c);
		// int d= c; // float 자료형을 int 변수에 대입하면 자동형변환이 안됨.
		// 이유
		// 같은 4바이트이지만 int -> float의 경우 는 되고 그 반대는 안된다.
		// 큰 자료형에서 작은 자료형으로의 자동 형변환은 불가능하며, 명시적인 형변환이 필요하다

		int d = (int) c;  // 강제형변환 (float -> int)
		// java: incompatible types: possible lossy conversion from float to int
		System.out.println(d);
	}
}
