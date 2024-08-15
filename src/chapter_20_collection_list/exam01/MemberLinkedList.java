package chapter_20_collection_list.exam01;

import java.util.LinkedList;

/**
 * ===========================================================
 * fileName       : MemberLinkedList
 * date           : 2024-01-25
 * description    : LinkedList 연습문제1
 * ===========================================================
 */
public class MemberLinkedList {
    private LinkedList<Member> linkedList;  // linkedList 선언

    public MemberLinkedList() {
        linkedList = new LinkedList<>();
    }

    public void addMember(Member member) {  // void addMember() 회원을 추가하는 메소드
        linkedList.add(member);  // 회원을 추가
    }

    // arrayList도 for문 가능하긴함
    public boolean removeMember(int memberID) { // boolean removeMember() 회원을 삭제하는 메소드
        for (int i = 0; i < linkedList.size(); i++) {
            Member member = linkedList.get(i);
            if (member.getMemberId() == memberID) { // 회원 아이디와 매개변수가 일치하면
                linkedList.remove(i);   // 해당 회원을 삭제
                return true;
            }
        }
        System.out.println(memberID + "가 존재하지 않습니다.");  // 반복문을 돌려서 해당 아이디를 찾지 못한 경우
        return false;
    }

    public void showAllMember() {    // 전체 회원을 출력하는 메소드 void showAllMember()
        for (Member member : linkedList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
