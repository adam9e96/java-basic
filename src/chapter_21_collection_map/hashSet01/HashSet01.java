package chapter_21_collection_map.hashSet01;/*
 * ===========================================================
 * fileName       : HashSet
 * date           : 2024-01-26
 * description    : HashSet 연습1
  set자료구조의 핵심은 중복을 가지지 않는 점이다.
 * ===========================================================
 */

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("임정순");
        hashSet.add("박현정");
        hashSet.add("홍연의");
        hashSet.add("강감찬");
        hashSet.add("강감찬"); // 중복된 값이라 저장 X 제거됨
        // 강감찬이 있는지 없는지 검사하고 없으면 추가 있으면 제거 // add의 핵심은 중복을 찾는것이다.

        // 중복된 문자열은 제거되고 출력 순서와 입력 순서는 상관없음.
        System.out.println(hashSet);
        System.out.println(hashSet.size());

    }
}
