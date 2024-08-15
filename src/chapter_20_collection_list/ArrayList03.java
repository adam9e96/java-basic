package chapter_20_collection_list;

import java.util.ArrayList;

/**
 * @since 2024.08.11
 * ArrayList는 배열에서 발전된 형태
 * 요소를 추가하면 0번 인덱스부터 차례대로 저장됨.
 * 메서드를 사용해서 원하는 위치에 요소를 추가하거나, 삭제, 반환할 수 있음
 */
public class ArrayList03 {
    public static void main(String[] args) {
        // 제네릭으로 타입을 지정하지 않은 형태 (Object 형식으로 저장하기 때문에 모든 타입을 저장할 수 있음)
        // 초기 용량(capacity)을 지정할 수도 있음. 저장 용량을 초과하면 자동으로 용량이 증가함.
        ArrayList list = new ArrayList(2); // 타입을 지정하지 않은 형태, 초기 용량 2
        // 타입을 지정하지 않으면 Object 형식으로 저장되며, 모든 타입을 저장 가능
        list.add("A");  // 예제에서 제네릭을 지정하지 않은 형태
        list.add("C");
        list.add("E");
        list.add("D");
        list.add(30);  // Integer 타입도 저장 가능

        // 초기 상태 출력
        System.out.print("초기 상태: ");
        System.out.println(list);  // 초기 상태: [A, C, E, D, 30]
        // `ArrayList`가 자체적으로 `toString`을 구현해서 모든 요소가 출력됨

        System.out.println();

        // 인덱스 1 위치에 B 추가
        System.out.print("인덱스 1 위치에 B 추가: ");
        list.add(1, "B");   // 인덱스 1에 B 추가, 이후 요소들은 한 칸씩 밀림
        System.out.println(list);  // 인덱스 1 위치에 B 추가: [A, B, C, E, D, 30]

        System.out.println();

        // 인덱스 2 위치의 값 삭제
        System.out.print("인덱스 2 위치의 값 삭제: ");
        list.remove(2);  // 인덱스 2의 요소 삭제
        System.out.println(list);  // 인덱스 2 위치의 값 삭제: [A, B, E, D, 30]

        System.out.println();


        // 원하는 값 삭제 (30 삭제)
        System.out.print("원하는 값 삭제 (30 삭제): ");
        list.remove(Integer.valueOf(30));  // Integer 객체로 감싸서 삭제
        System.out.println(list);  // 원하는 값 삭제 (30 삭제): [A, B, E, D]

        System.out.println();


        // 값 "D" 삭제
        list.remove("D");
        System.out.println(list);  // [A, B, E]

        System.out.println();


        // 인덱스 2번 위치의 값 반환
        System.out.println("인덱스 2번 위치의 값 반환: " + list.get(2));  // E

        System.out.println();


        // 최종 상태 출력
        System.out.println(list);  // [A, B, E]
    }
}
