package chapter2;

/*
 * ===========================================================
 * fileName       : PrimitiveTypes02
 * date           : 2024-02-05
 * description    :
 * ===========================================================
 */
public class PrimitiveTypes02 {

	public static void main(String[] args) {

		// 문자를 숫자로
		char ch = 'A';
		System.out.println("char ch : " + ch); // A

		int code = (int) ch; // ch에 저장된 값을 int 형으로 변환하여 저장한다. int는 4바이트 ch는 2바이트 이므로 자동 형변환이 일어난다.
		System.out.println("(int) chn: " + code);

		char ch2 = 65; // 숫자를 대입해도 된다. char 문자 자료형은 아스키 코드(정수)랑 매핑이 되기 때문
		System.out.println("char ch2 : "+ch2);

		int code2 = 68;
		char ch3 = (char) code2;
		System.out.println("char ch3 : "+ch3);

		char ch4 = 65525;
		System.out.println("ch4 : "+ch4);
//		char ch5 = "A"; // 에러뜸. Type mismatch: cannot convert from String to char
//		char ch6 = 'aB'; Invalid character constant

		char ch7 = '가';
		int code3 = (int) ch7;
		System.out.println("code3 : "+code3);
		/*1
		 * char 문자, 정수 자료형 타입 2Byte 작은 따옴표'' 를 사용함 한글자만 가능 아스키 코드(0~65535)와 대응됨 0~65535의
		 * 정수 대입 가능함 문자로 입력한 값을 정수로 출력하고 싶으면 자동 형변환을 하면됨 아스키 코드 0 ~127 총 128개(7bit).
		 * 그이후의 값은 유니코드로 대응됨
		 */
		int value = 'a';
		System.out.println(value);

	}

}
