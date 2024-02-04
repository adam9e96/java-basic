package chapter22.hashSet_exam01;/*
 * ===========================================================
 * fileName       : MemberHashSet
 * date           : 2024-01-26
 * description    : hashSet 연습문제-1
  set의 가장 큰 목적
    - 중복을 저장하지 않기
 * ===========================================================
 */

import java.util.HashSet;

public class MemberHashSet {
    private HashSet<Member> hashSet;    // HashSet 선언

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
