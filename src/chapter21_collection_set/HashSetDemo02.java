package chapter21_collection_set;


import java.util.HashSet;

/**
 * ===========================================================
 * fileName       : Member
 * date           : 2024-01-25
 * description    : ArrayList 연습문제1
 * ===========================================================
 */
class Member {
    private int memberId = 0;   // 회원 아이디
    private String memberName = null;  // 회원 이름

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public Member() {

    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원의 아이디는 " + memberId + "입니다.";
    }

    /*
            // 보통  아이디는 중복되지 않도록하는데 지금은 되고 있다
            >>> 멤버 클래스에서 hashCode와 equals 오버라이딩
     */

    @Override
    public int hashCode() {
        return memberName.hashCode() + memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member member) {
            return member.memberId == this.memberId && member.memberName.equals(this.memberName);
        } else {
            return false;
        }
    }
}

/**
 * ===========================================================
 * fileName       : MemberHashSet
 * date           : 2024-01-26
 * description    : hashSet 연습문제-1
 * set의 가장 큰 목적
 * - 중복을 저장하지 않기
 * ===========================================================
 */
class MemberHashSet {
    private final HashSet<Member> hashSet;    // HashSet 선언

    public MemberHashSet() {
        hashSet = new HashSet<>();  // HashSet 생성.
    }

    public void addMember(Member member) {  // HashSet 객체에 회원 추가.
        hashSet.add(member);    // HashSet에 회원 추가.
    }

    public boolean removeMember(int memberId) {
        // 매개변수로 받은 회원 아이디에 해당하는 회원 삭제.
        for (Member member : hashSet) {     // iterator 으로도 한번 해봐라
            int tempId = member.getMemberId();  // 아이디 비교.
            if (tempId == memberId) {    // 같은 아이디인 경우.
                hashSet.remove(member); // 회원 삭제.
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() { // 모든 회원 출력
        for (Member member : hashSet) {
            System.out.println(member); // toString으로 오버라이딩된거 출력됨
        }
        System.out.println();
    }

}

/**
 * ===========================================================
 * fileName       : MemberHashSetTest
 * date           : 2024-01-26
 * description    : HashSet 테스트 클래스
 * ===========================================================
 */
public class HashSetDemo02 {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서훤");
        System.out.println("멤버 박의 해시코드 : "+ memberPark.hashCode());

        // 저장되는 순서는 상관없음
        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberSon);
        memberHashSet.addMember(memberPark);
        memberHashSet.showAllMember();

        memberHashSet.addMember(memberLee); // 중복된 객체 저장
        memberHashSet.showAllMember();  // 중복된 객체는 저장되지 않음.

        Member memberHong = new Member(1003, "홍길동"); // 1003 아이디 중복 회원 추가.
        memberHashSet.addMember(memberHong);    // 추가됨
        System.out.println("멤버 홍의 해시코드 : "+ memberPark.hashCode());

        memberHashSet.showAllMember();

        memberHashSet.removeMember(1002);
        memberHashSet.showAllMember();
    }
}
