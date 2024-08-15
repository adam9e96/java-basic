package chapter_7_method.b_practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 이 클래스는 학생 수와 점수를 입력받아 점수 리스트와 분석 결과를 출력하는 프로그램입니다.
 *
 * @since 2024.08.11
 */
public class MethodDemo05 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;

        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                scores = inputStudentNum();
            } else if (selectNo == 2) {
                inputScores(scores);
            } else if (selectNo == 3) {
                printScores(scores);
            } else if (selectNo == 4) {
                printAnalysis(scores);
            } else if (selectNo == 5) {
                run = setRun();
            }
        }
        System.out.println("프로그램 종료");
        scanner.close();
    }

    /**
     * 학생 수를 입력받아 점수 배열을 생성합니다.
     *
     * @return 생성된 점수 배열
     */
    public static int[] inputStudentNum() {
        System.out.print("학생수> ");
        int studentNum = scanner.nextInt();

        int[] scores = new int[studentNum];
        return scores;
    }

    /**
     * 생성된 배열의 각 요소에 점수를 입력받습니다.
     *
     * @param scores 점수 배열
     */
    public static void inputScores(int[] scores) {
        if (scores == null) {
            System.out.println("먼저 학생 수를 입력하세요.");
            return;
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.print("scores[" + i + "]> ");
            scores[i] = scanner.nextInt();
        }
    }

    /**
     * 점수 배열의 내용을 출력합니다.
     *
     * @param scores 점수 배열
     */
    public static void printScores(int[] scores) {
        if (scores == null) {
            System.out.println("먼저 학생 수를 입력하세요.");
            return;
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "]:" + scores[i]);
        }
    }

    /**
     * 점수 배열을 분석하여 최고 점수와 평균 점수를 출력합니다.
     *
     * @param scores 점수 배열
     */
    public static void printAnalysis(int[] scores) {
        if (scores == null) {
            System.out.println("먼저 학생 수를 입력하세요.");
            return;
        }
        int max = 0;
        double avg = 0;
        int sum = 0;

        for (int score : scores) {
            sum += score;
            if (score > max) {
                max = score;
            }
        }
        avg = sum / (double) scores.length;
        System.out.println("최고점수: " + max);
        System.out.println("평균점수: " + avg);
    }

    /**
     * 프로그램 종료를 위해 run 플래그를 false로 설정합니다.
     *
     * @return false (프로그램 종료를 의미)
     */
    public static boolean setRun() {
        return false;
    }
}
