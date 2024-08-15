package chapter_6_array.a_basics;

/**
 * 주어진 배열의 항목에서 최대값을 구하는 JAVA 프로그램
 * 만약 배열의 요소 중에 음수가 있다면?
 * 초기에 `max`를 0으로 설정하는 것은 부적절하다.
 * 왜냐하면 음수가 최대값일 수 있기 때문이다. 따라서 초기값을 배열의 첫 번째 요소로 설정하여 해결할 수 있다.
 */
public class Array_08_FindMaxAndMin3 {
    public static void main(String[] args) {

        int[] array = {-1, -5, -3, -8, -2}; // 크기는 5 index 는 4  // 배열의 요소에 음수로 초기화
//        int max = array[0]; // 배열의 첫 번째 요소로 초기화.
        int max = 0;    // 0으로 초기화
        for (int j : array) {
            if (max < j) { // max 값을 0 으로 초기화 하면 항상 false 가 됨.
                max = j;
                System.out.println(max);
            }
        }
        System.out.println("max: " + max); // 결과 : max: 0
    }
}

// 최대값을 담을 변수 `max` 를 0으로 초기화 하는 것은 배열의 요소 중에 음수가 있는지 확인 해야한다.
// max 값을 0으로 초기화 하는 것이 부적절할 수 있기 때문.