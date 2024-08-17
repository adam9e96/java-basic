package chapter_21_collection_set.hashSet01;
/*
 * ===========================================================
 * fileName       : HashSet02
 * date           : 2024-01-26
 * description    :
 * Set 컬렉션은 인덱스로 객체를 검색해서 가져오는 메소드가 없다.
 * 객체를 한 개씩 반복해서 가져와야 하는데 두 가지 방법이 있다.
 * 1. for문이용
 * 2. Set컬렉션의 `iterator()` 메소드로 반복자를 얻어 객체를 하나씩 가져오는 것이다.
 * ===========================================================
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet03 {
    // String 객체를 중복 없이 저장하는 HashSet
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();  // 자동 형변환 ?

        //set에 요소 추가
        set.add("JAVA");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("JAVA");    // JAVA는 한 번만 저장됨.
        set.add("iBATIS");

        int size = set.size();  // 저장된 객체 수 얻기
        System.out.println("총 객체수: " + size);    // 총 객체수 : 4

        // case1 foreach문을 이용한 요소 순회 출력
        System.out.println("foreach 문으로 출력 시작");
        for (String s : set) {  // 인덱스 번호가 없어 foreach문만 가능 for문은 X
            System.out.println("\t" + s);
        }
        System.out.println();

        // case2 Iterator을 이용한 요소 순회 출력
        // iterateor.hasNext => 결과값 boolean 객체가 있으면 true 없으면 false
        Iterator<String> iterator = set.iterator(); // 반복자 얻기 // Iterator 인터페이스
        while (iterator.hasNext()) { // 객체 수만큼 루핑
            String element = iterator.next();   // 1개의 객체를 가져 옴.
            System.out.println("\t" + element);
        }
        
        set.remove("JDBC"); // 1개의 객체 삭제
        set.remove("iBATIS"); // 1개의 객체 삭제

        System.out.println("총 객체 수 : " + set.size());

        System.out.println("foreach 문으로 출력 시작");

        for (String s : set) {
            System.out.println("\t" + s);
        }
        System.out.println();

        // 모든 요소를 제거
        set.clear();    // 모든 객체를 제거하고 비움.
        if (set.isEmpty()) {
            System.out.println("비어있음");
        }
    }
}
