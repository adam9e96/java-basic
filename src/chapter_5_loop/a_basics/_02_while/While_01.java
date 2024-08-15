package chapter_5_loop.a_basics._02_while;

/**
 * ===========================================================
 * fileName       : While_01
 * date           : 2024-01-24
 * description    : while 문을 이용하여 1부터 10 까지 출력
 * -While 문
 * 조건식이 true 일 경우 계속 반복.
 * 조건식에는 비교 또는 연산식이 주로 오는데, 조건식이 false 가 되면 반복
 * 행위를 멈추고 `while`문을 종료.
 * ===========================================================
 */
public class While_01 {
    public static void main(String[] args) {

        int i = 1;    // 초깃값 1로 초기화

        while (i <= 10) {    // 조건식
            System.out.println(i);
            i++;
        }
    }
}
