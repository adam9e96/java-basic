package chapter7;

/**
 * ===========================================================
 * fileName       : Continue_01
 * date           : 2024-01-24
 * description    : continue연습_01
 * 반복문은 특정 조건이 만족하면 지정된 블록 내의 명령문을 반복 실행한다.
 * 이 반복 실행을 조절할 수 있는 2가지 명령문이 break와 continue 이 있다.
 * <p>
 * - break : 즉시 반복문을 벗어나야 할 때 사용한다
 * - continue : 반복의 중간 부분에서 남은 코드를 실행하지 않고 다음 회차의 반복을 실행해야 할 때 사용한다.
 * ===========================================================
 */
public class Continue_01 {
    public static void main(String[] args) {
        /*
         * continue문
         * 현재의 반복을 뛰어넘고 다음 반복을 진행함. 반복문이 진행되다가
         * continue 문을 만나면 반복문의 제일 끝으로 가서
         * 다음 반복을 계속 수행.
         *
         * 0 ~ 100까지의 홀수만 더 함
         */
        int total = 0;
        int num;

        for (num = 1; num <= 100; num++) {
//			if (num %2 != 0) {
//				total += num;
//		}
            if (num % 2 == 0) {
                continue;
            }
            total += num; // continue를 위에서 실행되면 이건 실행안됨
        }
        System.out.println("1부터 100까지의 홀수의 합은 " + total + "입니다.");
    }
}
