package chapter_20_collection_list.exam01;

import java.util.ArrayList;

/**
 * ===========================================================
 * fileName       : MemberArrayList
 * date           : 2024-01-25
 * description    : ArrayList 연습문제1
 * ===========================================================
 */
public class MemberArrayList {  // Member 클래스를 ArrayList로
    private ArrayList<Member> arrayList;    // ArrayList 선언

    MemberArrayList() {
        this.arrayList = new ArrayList<>(); // Member 형으로 선언한 ArrayList 생성
    }

    public void addMember(Member member) {  // void addMember() 회원을 추가하는 메소드
        arrayList.add(member);  // 회원을 추가
    }

    // 인덱스값을 이용하면 for문, 이용하지 않으면 foreach 문이 좋음
    public boolean removeMember(int memberID) { // boolean removeMember() 회원을 삭제하는 메소드
        for (Member member : arrayList) {   // arrayList에 있는 Member 객체를 하나씩 조회
            if (member.getMemberId() == memberID) { // 회원 아이디와 매개변수가 일치하면
                arrayList.remove(member);   // 해당 회원을 삭제
                return true;
            }
        }//  매개변수로 받은 memberID에 해당하는 회원을 ArrayList에서 찾아서 삭제하는 역할
        System.out.println(memberID + "가 존재하지 않습니다.");  // 반복문을 돌려서 해당 아이디를 찾지 못한 경우
        return false;
    }

    public void showAllMember() {    // 전체 회원을 출력하는 메소드 void showAllMember()
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
