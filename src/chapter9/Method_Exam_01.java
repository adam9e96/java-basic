package chapter9;

/**
 * ===========================================================
 * fileName       : Method_Exam_01
 * date           : 2024-01-24
 * description    :
 * ===========================================================
 */

import java.util.Scanner;

public class Method_Exam_01 {
    /*
     * 좌하변이 직각이 직각삼각형을 표시하세요.
     * 별이 출력되는 부분은 putStars() 메서드를 정의해서 구현하세요.
     * *
     * **
     * ***
     * ****
     * *****
     */
    public void putStars(int limit) {
        for (int j = 1; j <= limit; j++) {
            System.out.print("*");
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Method_Exam_01 exam1 = new Method_Exam_01();

        System.out.println("좌하변이 직각인 직각삼각형을 표시합니다.");
        System.out.print("볓 단 : ");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            // putStars() 메서드 호출
            exam1.putStars(i);
            System.out.println();
        }
        stdIn.close();
    }
}
