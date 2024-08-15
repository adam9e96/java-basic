package chapter_7_method.a_basic;

import java.util.Scanner;

public class Method_02 {

    static Scanner scanner = new Scanner(System.in);

    // 두 숫자의 합을 반환하는 메서드
    static int add(int a, int b) {
        return a + b;
    }

    // 세 숫자 중 최대값을 반환하는 메서드
    static int getMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    // 사용자로부터 데이터를 입력받는 메서드
    static void inputData(int[] values, String dataType) {
        for (int i = 0; i < values.length; i++) {
            System.out.print((i + 1) + "번째 " + dataType + ": ");
            values[i] = scanner.nextInt();
        }
    }

    // 데이터 배열의 최대값을 반환하는 메서드
    static int getMaxFromArray(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) max = value;
        }
        return max;
    }

    public static void main(String[] args) {
        /*
         * 메서드 사용의 장점
         * 1. 코드 반복을 줄일 수 있음.
         * 대부분의 프로그램은 어떤 코드를 반복해서 사용.
         * 반복되는 코드를 방치하면 유지보수하는 사람은 반복되는 코드로 불편을 느끼게 되고,
         * 코드가 반복되면 기억하기에 불편을 느끼게 됨.
         *
         * 또 코드를 개선하거나 유지보수할 때 여러 부분을 수정해야 하는 문제가 발생.
         * Don't repeat yourself (DRY, 반복하지 마라)
         * 원칙을 지키는 대표적인 방법이 바로 '메서드를 활용하는 것'
         *
         * 2. 더 높은 추상화를 할 수 있다.
         * 내가 만들거나 남이 만든 프로그램을 읽을 경우
         * 내부에 있는 코드를 하나하나 읽을 경우 프로그램을 빨리, 제대로 파악하기 어려움.
         * 메서드를 활용하면 세부 코드를 하나하나 신경 쓰지 않아도, '메서드 이름'만 봐도 유추할 수 있음.
         */

        int[] heights = new int[3];
        int[] weights = new int[3];
        int[] ages = new int[3];

        inputData(heights, "신장");
        inputData(weights, "체중");
        inputData(ages, "나이");

        int maxHeight = getMaxFromArray(heights);
        int maxWeight = getMaxFromArray(weights);
        int maxAge = getMaxFromArray(ages);

        System.out.println("신장의 최대값은 " + maxHeight + "입니다.");
        System.out.println("체중의 최대값은 " + maxWeight + "입니다.");
        System.out.println("나이의 최대값은 " + maxAge + "입니다.");

        // 두 숫자의 합을 계산하고 출력
        System.out.print("두 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = add(num1, num2);
        System.out.println("두 숫자의 합은 " + sum + "입니다.");

        scanner.close();
    }
}
