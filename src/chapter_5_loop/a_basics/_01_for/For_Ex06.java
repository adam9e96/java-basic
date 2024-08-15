package chapter_5_loop.a_basics._01_for;

/**
 * ===========================================================
 * fileName       : For_Ex06
 * date           : 2024-01-24
 * description    :
 * * 2개의 주사위를 던지는 게임이 있다고 가정하자.
 * * 중첩 for 문을 이용하여 2개의 주사위의 합이 6이 되는 경우를 출력하는 코드를 작성해보자
 * ===========================================================
 */
public class For_Ex06 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if ((i + j) == 6) {
                    System.out.println("i값 :" + i + ", j값 :" + j + " = " + (i + j));
                }
            }
        }
    }
}
