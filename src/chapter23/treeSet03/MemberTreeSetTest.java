package chapter23.treeSet03;/*
 * ===========================================================
 * fileName       : MemberTreeSetTest
 * date           : 2024-01-29
 * description    :
 이런식으로 인터페이스를 활용하는 구나를 숙지하는게 중요함
 Set 잘안쓰니까..
 * ===========================================================
 */

import java.util.Comparator;
import java.util.TreeSet;

public class MemberTreeSetTest {
    public static void main(String[] args) {

        // TreeSet 생성자에 Comparator 를 구현한 객체를 매개변수로 전달함.
        // String 클래스를 수정할 수 없으니 TreeSEt 생성자에 넘김.
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.compareTo(o2))  *-1;
            }
        });

        MemberTreeSet memberTreeSet = new MemberTreeSet();
        Member memberPark = new Member(1003,"박서현");
        Member memberLee = new Member(1004,"이지원");
        Member memberSon = new Member(1005,"손민국");

        memberTreeSet.addMember(memberPark);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);

        Member memberHong = new Member(1003,"홍길동"); // 1003 아이디 중복
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();

        // 정렬 기준이 없어 에러가 뜬다
    }
}
