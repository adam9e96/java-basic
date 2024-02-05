package chapter2;

/**
 * ===========================================================
 * fileName       : String_02
 * date           : 2024-01-24
 * description    : 문자열 타입 -> 기본 타입 변한
 * 문자열을 기본 타입으로 강제 타입 변환.
 * String 은 int 나 char 형 처럼 기본 자료 타입이 아니라
 * 클래스의 객체 형태라서 일반적인 형 변환과는 다르다.
 *
 * ===========================================================
 */

public class String_02 {
	public static void main(String[] args) {

		String str = "1a";
//		 int value = Integer.parseInt(str);
		/*
		  위 주석 코드가 안되는 경우
		   1. 문자열A에 숫자외의 문자가 있으면 되지 않음 // NumberFormatException

		   2.  String 값이 소수점인 경우 int로 변환할려고 할 떄 java.lang.NumberFormatException 라는 오류가 발생한다.
		      * 이유 : int는 소수점을 받아내지 못하기 때문이다.
		      * 해결 방법 : double.parsedouble() 이나 Float.parseFloat())를 이용하면 된다.
		 */

		// String -> 정수형
		// String -> byte
		String str1 = "10";
		byte value1 = Byte.parseByte(str1);
		System.out.println(value1); // 10

		// String -> short
		String str2 = "200";
		short value2 = Short.parseShort(str2);
		System.out.println(value2); // 200

		// String -> int
		String str3 = "300000";
		int value3 = Integer.parseInt(str3);
		System.out.println(value3); // 30000

		// String -> long
		String str4 = "400000000";
		float value4 = Long.parseLong(str4);
		System.out.println(value4); // 400000000

		// String -> 실수형
		// String -> float
		String str5 = "12.345";
		float value5 = Float.parseFloat(str5);
		System.out.println(value5); // 12.345

		// String -> double
		String str6 = "12.345";
		double value6 = Double.parseDouble(str6);
		System.out.println(value6); // 12.345

		// String -> 논리형
		// String -> boolean
		String str7 = "true";
		boolean value7 = Boolean.parseBoolean(str7);
		System.out.println("value7 : " + value7); // true

		String str8 = "false";
		boolean value8 = Boolean.parseBoolean(str8);
		System.out.println("value8 : " + value8);
	}
}
