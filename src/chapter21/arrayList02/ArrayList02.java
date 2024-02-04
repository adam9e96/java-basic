package chapter21.arrayList02;

import java.util.ArrayList;
import java.util.List;
// todo
//  문제는 인터페이스 구현 및 추상 클래스 상속, 리스트(배열이 아님) 를 이용한 은행계좌 관련,
//  지난번 평과와 기본 구조는 비슷하니 주말에 다시 풀어볼것.

/**
 * ===========================================================
 * fileName       : ArrayList02
 * date           : 2024-01-25
 * description    : ArrayList연습_02
 * <p>
 * ===========================================================
 */
public class ArrayList02 {
    // String 객체를 저장하는 ArrayList
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//      List<String> list2 = new ArrayList<>(); 뒷부분에는 타입 명시하지않아도됨. 앞쪽에 적었으면
        // String 객체 저장
        list.add("Java");   // 0
        list.add("JDBC");   // 1
        list.add("Serverlet/JSP");  // 2 -> 3
        list.add(2, "Database");    //2
        list.add("iBATIS"); // 4

        int size = list.size(); // 저장된 총 객체수 얻기
        System.out.println("총 객체수: " + size);   // 총 객체수 : 5
        System.out.println();

        String skill = list.get(2); // 2번 인덱스에 저장된 객체 얻기
        System.out.println("2: " + skill);   // 2: Database
        System.out.println();

        // 저장된 객체 출력
        for (int i = 0; i < list.size(); i++) { // 저장된 갯수만큼 반복
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
//        0:Java
//        1:JDBC
//        2:Database
//        3:Serverlet/JSP
//        4:iBATIS

        // 코드 추가 됨 //
        // foreach 문을 써도 됨.
        System.out.println();
        for (String str : list) {    // `foreach`으로 출력가능. 저장된 개수 만큼만 반복 되기 때문에 null 체크가 필요없음
            System.out.println(str);    // foreach 쓰기 더 편함
        }
        System.out.println();
        list.remove(2); // 2번 인덱스 Database 삭제
        list.remove(2); // 2번 인덱스 Serverlet/JSP 삭제

        for (int i = 0; i < list.size(); i++) { // 저장된 갯수만큼 반복
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
//        0:Java
//        1:JDBC
//        2:iBATIS
        // foreach 문 변환 // foreach 문은 인덱스를 사용할 수 없다. 인덱스를 알고 활용할려면 일반 for문을 사용해야 한다.
        for (String str2 : list) {
            System.out.print(str2 + " ");
        }
    }
}
