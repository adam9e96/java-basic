package chapter22.hashSet01;/*
 * ===========================================================
 * fileName       : HashSetTest
 * date           : 2024-01-28
 * description    : HashSet은 중복을 허용하지 않는 컬렉션
 * ===========================================================
 */

import java.util.HashSet;   // 클래스
import java.util.Iterator;  // 클래스
import java.util.Set;   // Set은 인터페이스

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

        // set 사이즈
        int size = set.size();
        System.out.println("총 객체 수 " + size);

        // HashSet에 저장된 요소 출력
        for (String str : set) {
            System.out.print(str + " ");
        }
        System.out.println();

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        set.remove("갤럭시");
        set.remove("픽셀");

        for (String str : set) {
            System.out.print(str + " ");
        }
//        set.clear();
        System.out.println();
        if (set.isEmpty()) {
            System.out.println("비었음");
        } else {
            System.out.println("안비었음");
        }
    }
}
