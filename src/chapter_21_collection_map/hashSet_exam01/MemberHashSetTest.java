package chapter_21_collection_map.hashSet_exam01;/*
 * ===========================================================
 * fileName       : MemberHashSetTest
 * date           : 2024-01-26
 * description    :
 * ===========================================================
 */

public class MemberHashSetTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서훤");
        // 저장되는 순서는 맘대로임
        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberSon);
        memberHashSet.addMember(memberPark);
        memberHashSet.showAllMember();

        memberHashSet.addMember(memberLee); // 중복된 객체 저장
        memberHashSet.showAllMember();  // 중복된 객체는 저장되지 않음.

        Member memberHong = new Member(1003, "홍길동"); // 1003 아이디 중복 회원 추가.
        memberHashSet.addMember(memberHong);    // 추가됨
        memberHashSet.showAllMember();
        /*
        손민국 회원의 아이디는 1002입니다.
        홍길동 회원의 아이디는 1003입니다.
        박서훤 회원의 아이디는 1003입니다.
        이지원 회원의 아이디는 1001입니다.
         */
        memberHashSet.removeMember(1002);
        memberHashSet.showAllMember();
        /*
        홍길동 회원의 아이디는 1003입니다.
        박서훤 회원의 아이디는 1003입니다.
        이지원 회원의 아이디는 1001입니다.
         */
    }
}
