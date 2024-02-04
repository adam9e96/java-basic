package chapter21.linkedList01;

import java.util.LinkedList;
import java.util.List;

/**
 * ===========================================================
 * fileName       : LinkedList01
 * date           : 2024-01-25
 * description    : LinkedList 연습_1
 * 순서가 있는 자료 관리, 중복 허용 = list 인터페이스
 * Q: 중복 저장이 가능한 이유
 * A: 객체 자체를 저장하는 것이 아니라 객체의 번지를 참조 함.
 * 그래서 동일한 객체를 중복 저장할 수 있고 이 경우 동 일한 번지가 참조된다.
 * ===========================================================
 */
public class LinkedList01 {
    public static void main(String[] args) {
        // 다형성을 이용해서 list로도 가능은함 다만 AddFirst와 같은 메서드는 못씀 타입은 부모타입인데 객체가 자식이라 자식메소드는 못씀
        List<String> linkedList2 = new LinkedList<>();   // List로 선언시 addFirst(), removeLast() 사용 못함
        LinkedList<String> linkedList = new LinkedList<>();

        // 링크드 리스트에 요소 추가
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println(linkedList); // 리스트 전체 출력
//        [A, B, C]
        linkedList.add(1, "D");  // 1번 인덱스에 추가
        System.out.println(linkedList); // 리스트 전체 출력
//        [A, D, B, C]
        linkedList.addFirst("0");   // addFirst() : 맨앞에 추가. LinkedList 에서 사용.
        System.out.println(linkedList);
//        [0, A, D, B, C]

        System.out.println(linkedList.removeLast());    // removeLast() : 맨 뒤의 요소 삭제 및 반환. LinkedList 에서 사용
        System.out.println(linkedList);
//        [0, A, D, B]

        // 컬렉션 프레임 워크 PDF 참고
        /*
        ArrayList의 경우 객체가 적은 경우 삭제가 문제없지만[1,2,3,4,5] 에서 중간에 위치한 정수 3을 삭제 시 2번 이동함.
        객체가 많을 경우를 생각하면 10만개의 객체가 있으면 제일 앞에 객체 1개만 삭제해도 10만-1 개의 이동을 해야 되서 자원 소모가 크다.

        LinkedList는 서로 연결된 형태(초등학교 비상연락망) [1,2,3,4,] 2삭제시 2의 주소 링크를 끊고 3에게 주소 링크를 연결하면 끝난다.
        LinkedList는 자료를 중간에 추가하거나 삭제할 때 자료의 이동이 ArrayList보다 적어 효율적임
        */
        // todo 자료구조 독학하셈 2월달 내로

    }
}
