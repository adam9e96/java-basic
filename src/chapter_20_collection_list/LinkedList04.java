package chapter_20_collection_list;

/**
 * @since 2024.08.11
 * description    : LinkedList와 ArrayList의 효율성 비교를 설명하는 클래스
 */

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList의 다양한 메서드를 연습하고, ArrayList와의 효율성을 비교하는 클래스입니다.
 */
public class LinkedList04 {

    /**
     * LinkedList와 List 인터페이스를 이용한 다양한 연산을 수행합니다.
     */
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
        System.out.println("linkedList 전체 요소: " + linkedList);
        // 출력: [갤럭시, 아이폰, 픽셀, 화웨이, 소니]

        // 특정 인덱스에 요소 추가
        linkedList.add(2, "모토로라");
        System.out.println("2번 인덱스에 모토로라 추가 후: " + linkedList);
        // 출력: [갤럭시, 아이폰, 모토로라, 픽셀, 화웨이, 소니]

        // ====================================================================== //

        System.out.println("linkedList1 전체 요소: " + linkedList1);
        // 출력: [갤럭시, 아이폰, 픽셀, 화웨이, 소니]

        // addFirst() : 맨 앞에 요소 추가 (LinkedList에서만 사용 가능)
        linkedList1.addFirst("모토로라");
        System.out.println("맨 앞에 모토로라 추가 후 linkedList1: " + linkedList1);
        // 출력: [모토로라, 갤럭시, 아이폰, 픽셀, 화웨이, 소니]

        /*
         * Q: ArrayList가 LinkedList보다 효율적인 경우
         * A: 특정 i 번째 요소의 메모리 위치를 찾는 경우
         *    ArrayList는 물리적으로 연결된 자료 구조이므로 i번째의 메모리 위치를 바로 계산할 수 있음.
         *    인덱스 길이 당 +4바이트를 추가하면 됨.
         *
         * Q: LinkedList가 더 효율적인 경우
         * A: 중간에 요소를 추가하거나 삭제하는 경우.
         *    LinkedList는 링크만 변경하면 되므로 효율적임.
         */
    }
}
