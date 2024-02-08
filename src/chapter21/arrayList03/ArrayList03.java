package chapter21.arrayList03;

import javax.management.AttributeList;
import java.util.ArrayList;

/**
 * ===========================================================
 * fileName       : ArrayList03
 * date           : 2024-01-25
 * description    : ArrayList연습_03
 * ===========================================================
 * ArrayList
 * 배열에서 발전된 형태
 * 요소를 추가하면 0번 인덱스부터 차례대로 저장됨.
 * 메서드를 사용해서 원하는 위치에 요소를 추가하거나, 삭제, 반환 할 수 있음
 */
public class ArrayList03 {
    public static void main(String[] args) {
        // 제네릭으로 타입을 지정하지 않은 형태 (Object 형식으로 저장하기 때문에 모든 타입을 저장할 수 있음)
        // 초기 capa 값을 지정할 수도 있음. 저장 갯수에 접근하면 자동으로 capa가 늘어남.
        ArrayList list = new ArrayList(2); // 타입을 지정하지 않은 형태. 초기 capa 값을 지정할 수도 있음.
        // 크기를 2로 해놔도 list.add 2에 접근할려고 하면 알아서 크기를 늘려버려서 큰 의미는 없다.
        list.add("A");  // 제네릭을 지정하지 않으면 속도가 느려서 잘 안씀. 이건 예제다. 지정안해본 형태 체험기.
        list.add("C");  // ArrayList<> 타입 지정하지 않았으므로 모든 타입을 저장 가능.
        list.add("E");
        list.add("D");
        list.add(30);

        System.out.print("초기상태 : "); // ArrayList는 순서대로 저장됨
        System.out.println(list);   // 초기상태 : [A, C, E, D, 30]
        // `ArrayList`가 자체적으로 `toString` 을 구현해서 모든 내용이 출력됨

        System.out.print("인덱스 1 위치에 B 추가 : "); // 1번 인덱스에 B를 넣고 인덱스 1 이후로는 한칸씩 다밀림
        list.add(1, "B");   // 인덱스 번호를 지정하고 추가하는 형태
        // 1번 인덱스에 B를 넣어라. // 자료에 순서가 있다면 인덱스가 있다는 뜻이다. list 인터페이스를 구현한 ArrayList는 인덱스가 있다는 말.
//        list.add("B"); 를 했다면 맨 뒤에 B가 g붙음 // stack 자료구조와 유사함
        System.out.println(list);   // 인덱스 1 위치에 B 추가 : [A, B, C, E, D, 30]

        System.out.print("인덱스 2 위치의 값 삭제 : ");  // C 삭제
        list.remove(2); // 인덱스 번호를 이용해서 삭제
        // 배열은 그냥 덮어씌우기인데 리스트는 아님
        System.out.println(list);    // 인덱스 2 위치의 값 삭제 : [A, B, E, D, 30]

        System.out.print("원하는 값 삭제(30을 삭제함): ");
//        int del = 30;
//        list.remove(del);
//        list.remove(del); // todo 정수 요소는 삭제 어떻게함? index 값으로 인식한다..
        list.remove("D");
//        list.remove(Integer.valueOf(30)); // Integer 객체로 감싸서 전달
        System.out.println(list);   // [A, B, E]
//        list.remove("30"); // 안됨
        System.out.println("인덱스 2번 위치의 값 반환 : " + list.get(2)); // E
        // 배열이였다면 list[2].get(2) 였다.. todo 검증 필요

        System.out.println(list);

    }
}
