package chapter2;

/*
 * ===========================================================
 * fileName       : BooleanExample
 * date           : 2024-01-06
 * description    :
 * ===========================================================
 */

public class Boolean01 {
    public static void main(String[] args) {
        // 논리형
        // boolean 형은 두가지 값만 존재 : true, false
        boolean stop = true;

        if (stop) { // 중지합니다.
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        if (!stop) { // 시작합니다.
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }
		boolean isRun = true;
		System.out.println(isRun);
    }
}
