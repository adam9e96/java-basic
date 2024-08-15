package chapter_20_collection_list.exam01.test;/*
 * ===========================================================
 * fileName       : MemberArrayListExample
 * date           : 2024-01-27
 * description    :
 * ===========================================================
 */

import java.util.ArrayList;

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

class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList(){
        this.arrayList = new ArrayList<>(); // ArrayList 선언
    }
    // addMember
    public void addMember(Member member){
        arrayList.add(member);
    }
    // removeMember
    public boolean removeMember(int memberID){
        for (Member member: arrayList) {
            if (member.getMemberId() == memberID){
                arrayList.remove(member);   // 해당 회원 삭제
                return true;
            }
        }
        System.out.println(memberID+ "가 존재하지 않습니다.");
        return false;
    }
    // showAllMember
    public void showAllMember(){
        for (Member member : arrayList) {
            System.out.println(member);
        }
    }

//    @Override
//    public String toString() {
//        return "MemberArrayList{" +
//                "arrayList=" + arrayList +
//                '}';
//    }
}

public class MemberArrayListExample {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();// 객체 생성
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
//        System.out.println(memberArrayList);
        memberArrayList.showAllMember();

        System.out.println();
        // 회원 삭제 - 픽셀
        memberArrayList.removeMember(8);// 픽셀 삭제
        memberArrayList.showAllMember();
    }
}
