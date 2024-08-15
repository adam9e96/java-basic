package chapter_20_collection_list.exam01.test2;/*
 * ===========================================================
 * fileName       : MemberLinkedListExample
 * date           : 2024-01-27
 * description    :
 * ===========================================================
 */

import java.util.LinkedList;

class Member {
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

class MemberLinkedList {
    private LinkedList<Member> linkedList;

    public MemberLinkedList() {
      linkedList = new LinkedList<>();
    }

    // addMember
    public void addMember(Member member) {
        linkedList.add(member);
    }

    // removeMember
    public boolean removeMember(int memberId) {
        for (Member member : linkedList) {
            if (member.getMemberId() == memberId) {
                linkedList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }
    // showAllMember
    public void showAllMember(){
        for (Member member: linkedList) {
            System.out.println(member);
        }
        System.out.println();
    }
}

public class MemberLinkedListExample {
    public static void main(String[] args) {
        MemberLinkedList memberLinkedList = new MemberLinkedList();

        Member Samsung = new Member(24, "갤럭시");
        Member Apple = new Member(15, "아이폰");
        Member Google = new Member(8, "픽셀");
        Member NOTHING = new Member(2, "낫싱");

        memberLinkedList.addMember(Samsung);
        memberLinkedList.addMember(Apple);
        memberLinkedList.addMember(Google);
        memberLinkedList.addMember(NOTHING);
        memberLinkedList.addMember(NOTHING);
        memberLinkedList.addMember(NOTHING);

        memberLinkedList.showAllMember();

        memberLinkedList.removeMember(15);
        memberLinkedList.showAllMember();

    }
}
