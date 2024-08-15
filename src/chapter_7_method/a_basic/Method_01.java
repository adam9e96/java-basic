package chapter_7_method.a_basic;

import java.util.Scanner;

public class Method_01 {
    // 함수 function : 코드 단독으로 존재 ( 자바에는 함수가 없음)
    // 메서드 method : 객체안에 있는 함수 . 점 찍고 사용 (C에는 메서드가 없음)
    static Scanner scanner = new Scanner(System.in);

    /**
     * 세 개의 정수를 인수로 받아 그 중 최대값을 반환하는 메서드
     *
     * @param a
     * @param b
     * @param c
     * @return 최대값 max
     */
    static int getMax(int a, int b, int c) { // a, b, c 의 최대값을 반환
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    /**
     * 세 명의 신장, 체중, 나이 데이터를 입력받는 메서드
     *
     * @param height
     * @param weight
     * @param age
     */
    static void inputData(int[] height, int[] weight, int[] age) {
        for (int i = 0; i < 3; i++) {
            System.out.println("[" + (i + 1) + "] ");
            System.out.print("	신장:");
            height[i] = scanner.nextInt();
            System.out.print("	체중:");
            weight[i] = scanner.nextInt();
            System.out.print("	나이:");
            age[i] = scanner.nextInt();
        }
    }

    /**
     * 메인 메서드
     * 메인 메서드는 신장, 체중, 나이 데이터를 저장할 배열을 초기화하고, inputData 메서드를 호출하여 배열을 채운 뒤,
     * getMax 메서드를 사용하여 각 항목의 최대값을 구하고 출력
     *
     * @param args
     */
    public static void main(String[] args) {
        // 메서드는 왜 필요한가

        // 3명의 신장, 체중, 나이의 최대값을 구해서 표기

        int[] height = new int[3]; // 신장
        int[] weight = new int[3]; // 체중
        int[] age = new int[3]; // 나이

//		for (int i = 0; i < 3; i++) {
//			System.out.println("[" + (i + 1) + "] ");
//			System.out.print("	신장:");
//			height[i] = scanner.nextInt();
//			System.out.print("	체중:");
//			weight[i] = scanner.nextInt();
//			System.out.print("	나이:");
//			age[i] = scanner.nextInt();
//		}
//
//		// 신장의 최대값을 구한다
//		int maxHeight = height[0];
//		if (height[1] > maxHeight) 	maxHeight = height[1];
//		if (height[2] > maxHeight) 	maxHeight = height[2];
//
//		// 체중의 최대값을 구한다.
//		int maxWeight = weight[0];
//		if (weight[1] > maxWeight) 	maxWeight = weight[1];
//		if (weight[2] > maxWeight)  maxWeight = weight[2];
//
//		// 나이의 최대값을 구한다
//		int maxAge = age[0];
//		if (age[1] > maxAge) maxAge = age[1];
//		if (age[2] > maxAge) maxAge = age[2];
//
//		System.out.println("신장의 최대값은 " + maxHeight + "입니다.");
//		System.out.println("체중의 최대값은 " + maxWeight + "입니다.");
//		System.out.println("ㅅ나이의 최대값은 " + maxAge + "입니다.");

        inputData(height, weight, age);
//		for (int i = 0; i < 3; i++) {
//			System.out.println("[" + (i + 1) + "] ");
//			System.out.print("	신장:"); height[i] = scanner.nextInt();
//			System.out.print("	체중:"); weight[i] = scanner.nextInt();
//			System.out.print("	나이:"); age[i] = scanner.nextInt();
//		}					//함수호출  //height[] 이게 인수임 아규먼트
        scanner.close();

        int maxHeight = getMax(height[0], height[1], height[2]); // 신장의 최대값
        int maxWeight = getMax(weight[0], weight[1], weight[2]); // 체중의 최대값
        int maxAge = getMax(age[0], age[1], age[2]); // 나이의 최대값

        System.out.println("신장의 최대값은 " + maxHeight + "입니다.");
        System.out.println("체중의 최대값은 " + maxWeight + "입니다.");
        System.out.println("나이의 최대값은 " + maxAge + "입니다.");

        /*
         * 메서드를 사용하는 이유
         * 1. 코드 재사용성
         * 2. 모듈성
         * 3. 추상화
         * 4. 유지 보수
         * 5. 가독성
         * 6. 테스트
         */

    }
}
