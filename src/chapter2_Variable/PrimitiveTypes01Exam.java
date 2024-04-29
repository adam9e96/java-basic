package chapter2;

/*
 * ===========================================================
 * fileName       : PrimitiveTypes01
 * date           : 2024-01-06
 * description    : 자바 기본 자료형 연습01
 * ===========================================================
 */

public class PrimitiveTypes01Exam {

    public static void main(String[] args) {
        /*
         * int result = 여기에
         * 1) 변수 4개를 모두 사용하고
         * 2) 사칙 연산중 + 연산만 사용해서
         * 9가 나오도록 코드를 완성.
         */

//		long var1 = 2L;
//		float var2 = 1.8f;
//		double var3 = 2.5;
//		String var4 = "3.9";
//		int result = (int) var1 +(int) (var2 + var3)  + (int) (Double.parseDouble(var4));
//		System.out.println(result);

//		long var1 = 2L;
//		float var2 = 1.8f;
//		double var3 = 2.5;
//		String var4 = "3.9";
//		int result = (int) ++var1 +(int)(var2) + (int)(var3)  + (int) (Double.parseDouble(var4));
//		System.out.println(result);

        long var1 = 2L;
        float var2 = 1.8f;
        double var3 = 2.5;
        String var4 = "3.9";

        int result = (int) ((int) (var1 + var2) + var3 + (Double.parseDouble(var4)));
        System.out.println(result);
    }

}
