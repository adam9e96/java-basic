package chapter_21_collection_map.hashSet_exam01;

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
        if (obj instanceof Member ){
            Member member = (Member) obj;
           return member.equals(this.memberId) && (member.memberId == this.memberId);
        }
        else {
            return false;
        }
    }
}
