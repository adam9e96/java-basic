package chapter_5_loop.a_basics._01_for;

/**
 * ===========================================================
 * fileName       : for_01
 * date           : 2024-01-24
 * description    : for문 연습_01
 * 반복문의 종류로는 for문, while 문, do ~ while 문이 있음. for문과 whihle 문은 서로 변환이 가능하기 때문에
 * 반복문을 작성할 때 어느 쪽을 선택해도 좋지만, for문은 반복 횟수를 알고 있을 때 주로 사용하고 while문은 조건에 따라 반복할 때
 * 사용.
 * for 반복문은 반복 횟수가 정해져 있을 때 주로 사용되며, 초기식, 조건식, 증감식이 있다.
 * 반복문을 사용하여 일정한 패턴의 작업을 간결하게 표현할 수 있으며, 코드의 가독성을 향상시키고 유지보수를 용이하게 만든다
 * ===========================================================
 */
public class For_01 {
    public static void main(String[] args) {

        // 반복문이 필요한 이유
        int num = 1;
        num += 2;
        num += 3;
        num += 4;
        num += 5;
        num += 6;
        num += 7;
        num += 8;
        num += 9;
        num += 10;
        // 반복을 실행하는데 일정한 패턴이 있다면 쉽게 할 수 있다. for while
        // 반복문을 쓰는 이유는 코드가 줄어드는 장점이 있다.

        // 1부터 10까지의 합
        int sum;
        for (num = 1, sum = 0; num <= 10; num++) {
            sum += num;
        }
        System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");

        int sum2;
        for (num = 1, sum2 = 0; num <= 100; num++) {
            sum2 += num;
        }
        System.out.println("1부터 100까지의 합은 " + sum2 + "입니다.");
    }
}