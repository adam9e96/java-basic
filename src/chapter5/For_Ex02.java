package chapter5;

/**
 * ===========================================================
 * fileName       : For_Ex02
 * date           : 2024-01-24
 * description    : 1부터 100사이의 정수 중에서 3 또는 4의 배수의 합을 구하는 프로그램
 * ===========================================================
 */
public class For_Ex02 {
    public static void main(String[] args) {

        int sum = 0;	// 배수의 총 합을 저장할 변수 0 초기화

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 4 == 0) { // 3의 배수 혹은 4의 배수인 경우
                sum += i;
            }
        }
        System.out.println("1부터 100 사이의 정수 중에서 3 또는 4의 배수의 합 :" + sum); // 2551
    }
}
