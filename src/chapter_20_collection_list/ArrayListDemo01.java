package chapter_20_collection_list;

import java.util.ArrayList;

/*
 * ===========================================================
 * Class Name      : MemberArrayListExample
 * Author          : adam9e96
 * Created Date    : 2024-01-27
 * Version         : 1.0
 * Description     : ArrayList를 사용하여 회원(Member) 객체를 관리하는 예제
 * ===========================================================
 * Summary:
 * - 이 클래스는 ArrayList를 사용하여 회원(Member) 객체를 추가, 삭제, 조회하는 방법을 연습하는 예제입니다.
 * - 회원 목록을 관리하는 MemberArrayList 클래스와, 이를 테스트하는 MemberArrayListExample 클래스가 포함되어 있습니다.
 *
 * Usage:
 * - 이 클래스는 ArrayList를 사용하여 객체를 관리하는 방법을 배우고자 하는 개발자를 위한 예제입니다.
 * - 새로운 회원을 추가하고, 특정 회원을 삭제하며, 전체 회원 목록을 출력하는 기능을 제공합니다.
 *
 * Notes:
 * - ArrayList는 가변 크기의 배열을 제공하며, 객체의 추가, 삭제, 검색이 용이합니다.
 * - ArrayList를 사용하여 객체를 관리할 때, 객체의 ID나 이름을 기준으로 검색하거나 삭제할 수 있습니다.
 */

/**
 * Member 클래스
 * 회원(Member) 객체를 정의한다.
 */
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

/**
 * MemberArrayList 클래스는 memberArrayList를 사용하여 회원 목록을 관리합니다.
 */
class MemberArrayList {
    private final ArrayList<Member> memberArrayList;

    public MemberArrayList() {
        this.memberArrayList = new ArrayList<>(); // ArrayList 선언
    }

    /**
     * 회원을 memberArrayList 에 추가합니다.
     *
     * @param member 추가할 회원 객체
     */
    public void addMember(Member member) {
        memberArrayList.add(member);
    }

    /**
     * 회원을 ID를 기준으로 memberArrayList 에서 삭제합니다.
     *
     * @param memberID 삭제할 회원의 ID
     * @return 회원 삭제 성공 여부
     */
    public boolean removeMember(int memberID) {
        for (Member member : memberArrayList) {
            if (member.getMemberId() == memberID) {
                memberArrayList.remove(member);   // 해당 회원 삭제
                return true;
            }
        }
        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    /**
     * memberArrayList 에 저장된 모든 회원을 출력합니다.
     */
    public void showAllMember() {
        for (Member member : memberArrayList) {
            System.out.println(member);
        }
    }
}

/**
 * MemberArrayListExample 클래스는 MemberArrayList 클래스의 기능을 테스트하는 예제
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList(); // MemberArrayList 객체 생성

        Member Samsung = new Member(24, "갤럭시");
        Member Apple = new Member(15, "아이폰");
        Member Google = new Member(8, "픽셀");
        Member NOTHING = new Member(2, "낫싱");

        // ArrayList에 회원 추가
        memberArrayList.addMember(Samsung);
        memberArrayList.addMember(Apple);
        memberArrayList.addMember(Google);
        memberArrayList.addMember(NOTHING);

        // 전체 회원 출력
        memberArrayList.showAllMember();

        System.out.println();

        // 회원 삭제 - 픽셀
        memberArrayList.removeMember(8); // 픽셀 삭제
        memberArrayList.showAllMember(); // 회원 목록 재출력
    }
}
