package chapter8;

//created : 2024-01-9
//updated : 2024-01-10
public class Array_11 {
    public static void main(String[] args) {

        int[] number = new int[10];
        // Random random = new Random();

        for (int i = 0; i < number.length; i++) {
            number[i] = i; // 배열을 0 ~ 9 의 숫자로 초기화한다.
            System.out.print(number[i] + " "); // 0 1 2 3 4 5 6 7 8 9
        }
        System.out.println();

        for (int i = 0; i < 10000; i++) {
            // Math.random() : 0.0 이상, 1.0 미만의 double 값의 난수를 균일한 분포로 반환
            int n = (int) (Math.random() * 10); // 0 ~ 9 중 의 한 값을 임의로 얻는다.
//			int n = random.nextInt(10);
//			위에 거가 소수를 이용할 수 있어서 알 고 있어야 한다.

            // swap
            int temp = number[0];
            number[0] = number[n];
            number[n] = temp;
//			System.out.println("temp :"+temp);
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " "); // 배열의 내용을 출력
        }

    }

}
