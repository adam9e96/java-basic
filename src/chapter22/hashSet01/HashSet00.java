package chapter22.hashSet01;/*
 * ===========================================================
 * fileName       : HashSetTest
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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

        int size = set.size();
        System.out.println("총 객체 수 "+ size);
        
        for (String str: set) {
            System.out.print(str+ " ");
        }
        System.out.println();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.print(element+ " ");
        }
        set.remove("갤럭시");
        set.remove("픽셀");

        for (String str: set) {
            System.out.print(str+ " ");
        }
//        set.clear();
        if (set.isEmpty()){
            System.out.println("비었음");
        } else {
            System.out.println("안비었음");
        }
    }
}
