package chapter21_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 이 프로그램은 HashSet의 기본적인 사용법을 설명합니다.
 * HashSet은 중복을 허용하지 않는 컬렉션으로, 순서가 중요하지 않은 데이터의 집합을 관리하는데 유용합니다.
 */
public class HashSet01 {
    public static void main(String[] args) {
        // HashSet 생성
        Set<String> set = new HashSet<>();

        // 요소 추가 (중복된 요소는 무시됨)
        set.add("갤럭시");
        set.add("갤럭시"); // 중복 요소, 저장되지 않음
        set.add("아이폰");
        set.add("화웨이");
        set.add("픽셀");
        set.add("모토로라");
        set.add("모토로라"); // 중복 요소, 저장되지 않음
        set.add("소니");

        // 1. Set의 크기 출력
        System.out.println("총 객체 수: " + set.size());
        System.out.println();

        // 2. HashSet에 저장된 요소들을 순회하여 출력
        System.out.print("Set의 요소들: ");
        for (String str : set) {
            System.out.print(str + " "); // 중복 없이 저장된 요소들이 출력됨
        }
        System.out.println();
        System.out.println();

        // 3. Iterator를 사용하여 요소 순회
        Iterator<String> iterator = set.iterator();
        System.out.println("Iterator 객체: " + iterator);
        System.out.println();

        // hasNext()와 next() 메서드 사용 예시
        System.out.println("Iterator에 다음 요소가 있는가? " + iterator.hasNext());
        System.out.println();

        // Iterator를 사용한 순회 및 출력
        System.out.print("Iterator를 사용한 요소 출력: ");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();

        // 4. 요소 삭제
        set.remove("갤럭시");
        set.remove("픽셀");

        // 삭제 후의 요소 출력
        System.out.print("삭제 후 Set의 요소들: ");
        for (String str : set) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println();


        // 5. Set이 비어있는지 확인
        if (set.isEmpty()) {
            System.out.println("Set이 비었습니다.");
        } else {
            System.out.println("Set에 요소가 남아있습니다.");
        }

        // 6. Iterator를 사용하여 남은 요소 순회 및 출력
        Iterator<String> iterator2 = set.iterator();
        System.out.print("다시 Iterator를 사용한 요소 출력: ");
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
    }
}
