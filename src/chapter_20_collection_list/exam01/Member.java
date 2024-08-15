package chapter_20_collection_list.exam01;

/**
 * ===========================================================
 * fileName       : Member
 * date           : 2024-01-25
 * description    : ArrayList 연습문제1
 * ===========================================================
 */
public class Member {
    private int memberId;   // 회원 아이디
    private String memberName;  // 회원 이름

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
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
}
