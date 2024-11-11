package chapter21_collection_set;

import java.util.HashSet;

/**
 * 이 프로그램은 HashSet을 사용하여 문자열 집합을 관리하는 방법을 보여줍니다.
 * HashSet은 중복을 허용하지 않으며, 요소의 저장 순서를 보장하지 않는 컬렉션입니다.
 */
public class HashSet02 {
    public static void main(String[] args) {

        // HashSet 생성
        HashSet<String> hashSet = new HashSet<>();

        // 요소 추가
        hashSet.add("임정순");
        hashSet.add("박현정");
        hashSet.add("홍연의");
        hashSet.add("강감찬");
        hashSet.add("강감찬"); // 중복된 요소, 저장되지 않음

        // HashSet의 요소 출력
        // 중복된 값은 제거되며, 출력 순서는 입력 순서와 다를 수 있음
        System.out.println(hashSet);

        // HashSet의 크기 출력
        System.out.println("HashSet의 크기: " + hashSet.size());
    }
}
