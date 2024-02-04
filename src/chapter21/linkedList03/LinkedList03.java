package chapter21.linkedList03;/*
 * ===========================================================
 * fileName       : LinkedList03
 * date           : 2024-01-27
 * description    : LinkedList 연습_03
 * ===========================================================
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList03 {
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
        System.out.println(linkedList);
        // [갤럭시, 아이폰, 낫싱, 샤오미, 레노버, 픽셀]
        System.out.println(list);
        // [픽셀]

        // 특정 인덱스에 추가
        linkedList.add(1, "LGV50"); // 1번 인덱스에 추가
        System.out.println(linkedList);
//      [갤럭시, LGV50, 아이폰, 낫싱, 샤오미, 레노버, 픽셀]

        // addFirst() : 맨앞에 추가. LinkedList에서 사용할 수 있음
        linkedList.addFirst("포코폰");
        System.out.println(linkedList);
        // addLast() : 맨뒤에 추가. todo 기존의 add와 같음지?
        linkedList.addLast("화웨이");
        System.out.println(linkedList);

        // removeLast() : 맨 뒤의 요소 삭제 및 반환. LinkedList에서 사용할 수 있음
        // 반환값이 있음 주의
        linkedList.removeLast();    // 화웨이
        System.out.println("화웨이 퇴출: "+linkedList.removeLast()); // 픽셀
        System.out.println(linkedList);
//        [포코폰, 갤럭시, LGV50, 아이폰, 낫싱, 샤오미, 레노버]


    }
}
