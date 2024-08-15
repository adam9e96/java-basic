package chapter_20_collection_list;

import java.util.LinkedList;
import java.util.List;

/**
 * @since 2024.08.11
 * 순서가 있는 자료 관리, 중복 허용 = list 인터페이스
 * Q: 중복 저장이 가능한 이유
 * A: 객체 자체를 저장하는 것이 아니라 객체의 번지를 참조함.
 * 그래서 동일한 객체를 중복 저장할 수 있고 이 경우 동일한 번지가 참조됨.
 */
public class LinkedList01 {
    public static void main(String[] args) {
        // 다형성을 이용해서 List로 선언할 수 있지만, addFirst()와 같은 메서드는 사용할 수 없음
        List<String> linkedList2 = new LinkedList<>();   // List로 선언 시 addFirst(), removeLast() 사용 불가
        LinkedList<String> linkedList = new LinkedList<>();

        // LinkedList에 요소 추가
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // LinkedList의 초기 상태 출력
        System.out.println(linkedList);  // 출력: [A, B, C]

        // 인덱스 1번 위치에 "D" 추가
        linkedList.add(1, "D");
        System.out.println(linkedList);  // 출력: [A, D, B, C]

        // 맨 앞에 "0" 추가
        linkedList.addFirst("0");  // LinkedList 전용 메서드
        System.out.println(linkedList);  // 출력: [0, A, D, B, C]

        // 맨 뒤의 요소 삭제 및 반환
        System.out.println(linkedList.removeLast());  // 출력: C
        System.out.println(linkedList);  // 출력: [0, A, D, B]

        // LinkedList와 ArrayList의 차이점 설명

        /*
        ArrayList의 경우:
        - 중간에 위치한 요소를 삭제 시, 삭제된 요소 이후의 모든 요소를 한 칸씩 이동해야 함.
        - 예를 들어, [1, 2, 3, 4, 5]에서 3을 삭제하면 2번의 이동이 발생.
        - 객체가 많을 경우, 이동에 따른 자원 소모가 큼.

        LinkedList의 경우:
        - 중간에 위치한 요소를 삭제 시, 삭제된 요소의 이전 요소와 다음 요소를 직접 연결하면 됨.
        - 예를 들어, [1, 2, 3, 4]에서 2를 삭제하면 1과 3을 직접 연결.
        - 자료를 중간에 추가하거나 삭제할 때, 이동이 거의 없어 효율적임.

        LinkedList는 자료를 중간에 추가하거나 삭제할 때 자료의 이동이 ArrayList보다 적어 효율적임.
        */
    }
}
