package chapter_20_collection_list;

import java.util.LinkedList;
import java.util.List;

/**
 * @since 2024.08.11
 * LinkedList의 다양한 메서드를 연습하는 클래스
 * <p>
 * LinkedList에 요소를 추가하고, 특정 인덱스에 요소를 삽입하고,
 * 맨 앞과 맨 뒤에 요소를 추가하거나 삭제하는 방법을 시연합니다.
 */
public class LinkedList03 {

    /**
     * LinkedList와 List 인터페이스를 이용한 다양한 연산을 수행합니다.
     */
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        List<String> list = new LinkedList<>();

        // LinkedList에 요소 추가
        linkedList.add("갤럭시");
        linkedList.add("아이폰");
        linkedList.add("낫싱");
        linkedList.add("샤오미");
        linkedList.add("레노버");
        linkedList.add("픽셀");
        list.add("픽셀");

        // LinkedList 전체 출력
        System.out.println("LinkedList 전체 요소: " + linkedList);
        // 출력: [갤럭시, 아이폰, 낫싱, 샤오미, 레노버, 픽셀]
        System.out.println("List 전체 요소: " + list);
        // 출력: [픽셀]

        System.out.println();
        // 특정 인덱스에 추가
        linkedList.add(1, "LG-V50"); // 1번 인덱스에 추가
        System.out.println("1번 인덱스에 LG-V50 추가: " + linkedList);
        // 출력: [갤럭시, LGV50, 아이폰, 낫싱, 샤오미, 레노버, 픽셀]

        // addFirst() : 맨앞에 추가. LinkedList에서 사용할 수 있음
        linkedList.addFirst("포코폰");
        System.out.println("맨 앞에 포코폰 추가: " + linkedList);
        // 출력: [포코폰, 갤럭시, LGV50, 아이폰, 낫싱, 샤오미, 레노버, 픽셀]

        // addLast() : 맨뒤에 추가. LinkedList에서 사용할 수 있음
        linkedList.addLast("화웨이");
        System.out.println("맨 뒤에 화웨이 추가: " + linkedList);
        // 출력: [포코폰, 갤럭시, LGV50, 아이폰, 낫싱, 샤오미, 레노버, 픽셀, 화웨이]

        System.out.println();

        // removeLast() : 맨 뒤의 요소 삭제 및 반환. LinkedList에서 사용할 수 있음
        // 반환값이 있음 주의
        linkedList.removeLast();    // 화웨이 삭제
        System.out.println("화웨이 퇴출 후: " + linkedList);
        // 출력: [포코폰, 갤럭시, LGV50, 아이폰, 낫싱, 샤오미, 레노버, 픽셀]

        // 마지막 요소 삭제 및 반환
        System.out.println("퇴출된 마지막 요소: " + linkedList.removeLast()); // 픽셀 삭제
        System.out.println("최종 LinkedList: " + linkedList);
        // 출력: [포코폰, 갤럭시, LGV50, 아이폰, 낫싱, 샤오미, 레노버]
    }
}
