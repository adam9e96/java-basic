package chapter_20_collection_list.exam01;

/**
 * ===========================================================
 * fileName       : MemberArrayListTest
 * date           : 2024-01-25
 * description    : ArrayList 연습문제1
 * ===========================================================
 */
public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();    // MemberArrayList() 객체 생성

        // 새로운 회원 인스턴스 생성
        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서원");
        Member memberHong = new Member(1004, "홍길동");

        // ArrayList 에 회원 추가
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();    // 전에 회원 출력

        memberArrayList.removeMember(1004); // 홍길동 회원 삭제
        memberArrayList.showAllMember();
    }
}
