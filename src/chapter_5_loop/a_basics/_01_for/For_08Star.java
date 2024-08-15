package chapter_5_loop.a_basics._01_for;

/**
 * ===========================================================
 * fileName       : For_08
 * date           : 2024-01-24
 * description    : 중첩 for 문을 이용한 별 찍기 문제
 * * 중첩 for 문을 이용한 별 찍기 문제
 * * 우선 i와 j를 만들고 일정하게 모두 찍히도록 해보고
 * * j가 어디까지 실행되냐에 따라 달라지기 떄문에 j를 i과 같도록 하거나 하는등
 * * 조건에 따라 다양한 방법이 나올 수 있음
 * ===========================================================
 */
public class For_08Star {
    public static void main(String[] args) {
        /*
         * for 문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보시오.
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
