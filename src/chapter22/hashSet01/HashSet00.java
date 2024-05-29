package chapter22.hashSet01;

/*
 * ===========================================================
 * fileName       : HashSetTest
 * date           : 2024-01-28
 * description    : HashSet은 중복을 허용하지 않는 컬렉션
 * ===========================================================
 */

import java.util.HashSet;   // 클래스
import java.util.Iterator;  // 클래스
import java.util.Set;   // Set은 인터페이스


/**
 *
 */
public class HashSet00 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("갤럭시");
        set.add("갤럭시"); // 중복 저장 X
        set.add("아이폰");
        set.add("화웨이");
        set.add("픽셀");
        set.add("모토로라");
        set.add("모토로라");    // 중복 저장 X
        set.add("소니");

        // 1. set 사이즈
        System.out.println("총 객체 수 " + set.size());

        // 2. HashSet에 저장된 요소 순회
        for (String str : set) {
            System.out.print(str + " "); // 소니 픽셀 모토로라 아이폰 화웨이 갤럭시
        }

        System.out.println();

        Iterator<String> iterator = set.iterator();
        System.out.println("iterator = " + set.iterator());

        /**
         * hasNext()는 boolean 타입으로 반환된다.
         * "True or False"로 반환된다.
         * 다음에 가져올 값이 있으면 True, 없으면 False
         *
         * next()는 그냥 다음 요소가 있으면 그 요소 값을 출력한다.
         * e.g 1,2,3,4,5 가 저장되어 있고 iterator.next 로 순회하면 1,2,3,4,5 가 출력된다.
         */
        System.out.println(iterator.hasNext());

        System.out.println();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }

        System.out.println();

        // 요소 삭제
        set.remove("갤럭시");
        set.remove("픽셀");

        for (String str : set) {
            System.out.print(str + " ");
        }

        // 요소 초기화
//        set.clear();
        System.out.println();

        if (set.isEmpty()) {
            System.out.println("비었음");
        } else {
            System.out.println("안비었음");
        }

        System.out.println("iterator = " + set.iterator());

        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next()+" ");;
        }
    }
}
