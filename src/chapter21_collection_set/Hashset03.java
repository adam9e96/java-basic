package chapter21_collection_set;

import java.util.HashSet;

/**
 * 이 프로그램은 HashSet의 기본적인 사용법을 보여줍니다.
 * HashSet은 중복을 허용하지 않는 데이터 구조로, 순서와 상관없이 고유한 요소들을 관리하는 데 유용합니다.
 */
public class Hashset03 {
    public static void main(String[] args) {
        // HashSet 생성
        HashSet<String> hashSet = new HashSet<>();

        // 요소 추가
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Grapes");
        hashSet.add("Orange");
        // 중복된 요소는 추가되지 않음
        hashSet.add("Apple");   // 중복 요소, 저장되지 않음

        // 요소 순회 및 출력
        System.out.println("HashSet의 요소들:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // 특정 요소 포함 여부 확인
        boolean isPresent = hashSet.contains("Mango"); // "Mango"가 있는지 확인
        System.out.println("Mango가 HashSet에 있는가? " + isPresent);

        // 요소 제거
        hashSet.remove("Grapes"); // "Grapes" 요소 제거

        // HashSet의 크기 확인
        int size = hashSet.size();
        System.out.println("HashSet의 크기: " + size);
    }
}
