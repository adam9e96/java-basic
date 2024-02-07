package chapter6;

/**
 * ===========================================================
 * fileName       : While_02
 * date           : 2024-01-24
 * description    : While문연습_02
 * ===========================================================
 */
public class While_02 {
    public static void main(String[] args) {
        /*
         * for 문을 while문으로 변경
         */
        int num;
        int sum = 0;

        for (num = 1; num <= 10; num++) {
            sum += num;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
        // while 문도 초기값, 조건식, 증감식이 존재

        num = 1;
        sum = 0;
        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
