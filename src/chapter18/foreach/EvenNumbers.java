package chapter18.foreach;

public class EvenNumbers {
    public static void main(String[] args) {
        // 정수형 배열을 생성하고 초기화합니다.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // for-each 문을 사용하여 배열에 저장된 짝수를 출력합니다.
        System.out.println("배열에 저장된 짝수:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
//                break;
            }
        }
    }
}
