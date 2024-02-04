package chapter21.linkedList04;

/*
 * ===========================================================
 * fileName       : LinkedList04
 * date           : 2024-01-27
 * description    :
 * ===========================================================
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList04 {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        LinkedList<String> linkedList1 = new LinkedList<>();

        // LinkedList에 요소 추가
        linkedList.add("갤럭시");
        linkedList.add("아이폰");
        linkedList.add("픽셀");
        linkedList.add("화웨이");
        linkedList.add("소니");

        linkedList1.add("갤럭시");
        linkedList1.add("아이폰");
        linkedList1.add("픽셀");
        linkedList1.add("화웨이");
        linkedList1.add("소니");
        // 리스트 전체 출력
        System.out.println(linkedList);

        linkedList.add(2, "모토로라");
        System.out.println(linkedList);

        System.out.println(linkedList1);
        linkedList1.addFirst("모토로라");   // LinkedList 에서만 사용 가능
        System.out.println(linkedList1);
        /*
            Q: ArrayList가 LinkedList보다 효율적인 경우
            A: 특정 i 번째 요소 메모리 위치를 찾는 경우
               ArrayList는 물리적으로 연결된 자료 구조이므로 i번째의 메모리 위치를 바로 계산이 가능함.
               인덱스 길이 당 +4바이트 추가하면 됨
            Q: LinkedList가 더 효율적인 경우
               중간에 추가, 삭제하는 경우

         */
    }
}
