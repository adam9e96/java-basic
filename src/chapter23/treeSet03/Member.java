package chapter23.treeSet03;/*
 * ===========================================================
 * fileName       : Member
 * date           : 2024-01-29
 * description    :
 * ===========================================================
 */

public class Member implements Comparable<Member> {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    @Override
    public String toString() {
        return memberName + "회원님의 아이디는" + memberId + "입니다.";
    }

    @Override
    public int compareTo(Member member) {
        // 비교하는 두 값중 this 값이 더 크면 양수를 반환하여 오름차순으로 정렬.
        // 메서드를 호출하는 객체가 인자로 넘어온 객체보다 작을 경우에는 음수를 리턴하고,
        // 크기가 동일하다면 0, 클 경우에는 양수를 리턴

        return (this.memberId - member.memberId) *-1; // memberId 가 정수이기 떄문에 오름차순으로 정렬
//        return (this.memberId - member.memberId) * (-1); // 내림차순으로 정렬하기 위해 반환값을 음수로 만듬

    }
}
