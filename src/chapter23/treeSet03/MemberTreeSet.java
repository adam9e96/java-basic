package chapter23.treeSet03;/*
 * ===========================================================
 * fileName       : MemberTreeSEt
 * date           : 2024-01-29
 * description    :
 * ===========================================================
 */

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet; // TreeSet 선언

    public MemberTreeSet() {
        treeSet = new TreeSet<>();  // treeSet 생성.
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int MemberId) { // treeSet에서 회원 삭제
        for (Member member : treeSet) { // iterator 가능
            int tempId = member.getMemberId();
            if (tempId == MemberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(MemberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {  // 전체 회원을 출력
        for (Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();

    }
}
