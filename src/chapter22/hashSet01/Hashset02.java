package chapter22.hashSet01;

import java.util.HashSet;

/**
 * ===========================================================
 * fileName       : Hashset02
 * date           : 2024-03-03
 * description    :
 * ===========================================================
 */
public class Hashset02 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();

        // 요소 추가
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Grapes");
        hashSet.add("Orange");
        // 중복된 요소는 추가되지 않음
        hashSet.add("Apple");   // 중복

        // 요소 순회
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // 요소 포함 여부 확인
        boolean isPresent = hashSet.contains("Mango"); // true 반환
        System.out.println("Is Mango present: " + isPresent);

        // 요소 제거
        hashSet.remove("Grapes");

        // HashSet의 크기 확인
        int size = hashSet.size();
        System.out.println("Size of HashSet: " + size);
    }
}
