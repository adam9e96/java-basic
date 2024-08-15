package chapter_5_loop.a_basics;

/**
 * ===========================================================
 * fileName       : Break_01
 * date           : 2024-01-24
 * description    :
 * - break
 * 주로 반복문(`for`,`while`,`do-while`) 내에서 사용된다.
 * 반복문의 실행을 중단하고 반복문을 빠져나가는데 사용된다.
 * ===========================================================
 */
public class Break_01 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ; i++) { // 조건식이 없는 `for`문은 무한루프임. 무한 반복문
            if (i > 10) { // 조건식은 반복문을 실행하는 조건이 아니라 반복문을 빠져나오는 조건.
                System.out.println(i);
                break;
            }
            sum += i; // 입력한 값을 누적
        }
        System.out.println("sum : " + sum);

        /*
         * i는 11에서 반복문을 빠져나오고 sum 에 더해지는건 10까지 더해짐
         */
    }
}
