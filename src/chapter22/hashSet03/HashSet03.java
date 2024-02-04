package chapter22.hashSet03;/*
 * ===========================================================
 * fileName       : HashSet03
 * date           : 2024-01-26
 * description    :
 이름과 나이가 동일할 경우 MemberShip 객체를 HashSet에 중복 저장하지 않는다.
 이름과 나이가 동일하다면 해시코드가 리턴되도록 하는 hashCoed()를 재정의 하고,
 equals() 메소드가 true를 리턴하도록 재정의 했기 때문이다.
 * ===========================================================
 */

import java.util.HashSet;
import java.util.Set;

public class HashSet03 {
    public static void main(String[] args) {
        Set<MemberShip> set = new HashSet<>();

        // 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
//        set.add(new MemberShip("홍길동", 30));
//        set.add(new MemberShip("홍길동", 30)); //  왜 2개가 찍힌거냐? 두개가 서로 다른거임. new를 사용해서
        // 서로 다론 주소값을 가짐
        // 동일한 객체 주소값을 검사하기 때문에. 주소값은 다르다.

        //  - 주소값을 확인해서 똑같은지 확인하는게 정석인데 위에꺼처럼 안에 내용이 같은데 이걸 검사하고 번지를 검사 안하려면 어떻게 해야 되나
        //  -  안에 있는 값을 검사할려면 어떻게 해야할까? 주소값 말고
        // hashSet은 답을 알고있다 #hashCode #equals

        // 위에 코드랑 같음
        MemberShip memberShip1 = new MemberShip("홍길동", 30);
        MemberShip memberShip2 = new MemberShip("홍길동", 30);
        set.add(memberShip1);
        set.add(memberShip2);  //  set의 목적은 중복값을 저장 안하는거임 // 2대신 memberShip1로 하면 또 1이됨. 동일한 객체 주소이므로 저장이 되지 않음
//object 안에 hashcode가 상속되어있음

        System.out.println("총 객체수: " + set.size());   // 1 
        // 중복 추가 코드를 오버라이딩하고 실행하면 2 - > 1로 변경되었다.

//        System.out.println(memberShip2.name);
    }
}
/*
set기본은 객체주소로 판단하는데 우리는 현재 저장된 값자체로 판단하고 싶음
 */