package chapter_20_collection_list.exam01;

/**
 * ===========================================================
 * fileName       : MemberLinkedListTest
 * date           : 2024-01-25
 * description    : LinkedList 연습문제1
 * ===========================================================
 */
public class MemberLinkedListTest {
    public static void main(String[] args) {
        MemberLinkedList memberLinkedList = new MemberLinkedList();    // MemberArrayList() 객체 생성

        // 새로운 회원 인스턴스 생성
        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서원");
        Member memberHong = new Member(1004, "홍길동");

        // ArrayList 에 회원 추가
        memberLinkedList.addMember(memberLee);
        memberLinkedList.addMember(memberSon);
        memberLinkedList.addMember(memberPark);
        memberLinkedList.addMember(memberHong);

        memberLinkedList.showAllMember();    // 전에 회원 출력

        memberLinkedList.removeMember(1004); // 홍길동 회원 삭제
        memberLinkedList.showAllMember();
    }
}
/*
todo ArrayList 와 LinkedList 는 크게 차이가 나지 않는다.
속도와 방식의 차이일뿐
 */
