package chapter20_InnerClass.innerClass_Exam02;


/**
 * ===========================================================
 * fileName       : Exam02.java
 * date           : 2024-01-24
 * description    : 내부 클래스 연습문제-2
 * <p>
 * 1. MemberManagement 클래스를 작성하세요.
 * 이 클래스는 다음과 같은 속성을 가져야 합니다.
 * <p>
 * members : 회원 객체를 저장하는 배열
 * <p>
 * 2. MemberManagement 클래스 내에 내부 클래스 Member 를 작성하세요. <-- 회원 객체 == Member
 * Member 클래스는 다음과 같은 속성을 가져야 합니다.
 * <p>
 * memberID (문자열): 회원의 아이디
 * memberName (문자열): 회원의 이름
 * memberAge (정수): 회원의 나이
 * <p>
 * 3. MemberManagement 클래스 내에서 다음 메서드를 작성하세요.
 * <p>
 * addMember(String memberID, String memberName, int memberAge): 새 회원을 추가하는 메서드로,
 * Member 객체를 생성하여 members 리스트에 추가합니다.
 * findMember(String memberID): 주어진 아이디에 해당하는 회원을 찾아서 반환하는 메서드입니다.
 * displayAllMembers(): 모든 회원 정보를 출력하는 메서드입니다.
 * <p>
 * 4. Main 클래스에서 다음과 같은 작업을 수행하세요.
 * <p>
 * MemberManagement 객체를 생성하세요.
 * 다수의 회원을 추가하고, 몇몇 회원을 검색하고 삭제한 뒤, 모든 회원 정보를 출력하세요.
 * 이 문제를 해결하기 위해 MemberManagement 클래스 내에 내부 클래스 Member 를 작성하고,
 * 각종 메서드를 구현하여 회원 관리를 수행하세요. 그리고 Main 클래스에서 객체를 생성하고 작업을 수행하세요.
 * ===========================================================
 */
class MemberManagement { // 외부 클래스
    private Member[] members; // 회원 객체를 저장하는 `배열`
    // Course[] courses = new Course[10] 를 다시보자.
    private int index = 0; // for 문을 돌리기 위한 인덱스 역할

    class Member { // 내부 클래스
        private String memberID; // 회원의 아이디
        private String memberName; // 회원의 이름
        private int memberAge; // 회원의 나이

        public Member(String memberID, String memberName, int memberAge) {
            this.memberID = memberID;
            this.memberName = memberName;
            this.memberAge = memberAge;
        }

        public String getMemberID() {
            return memberID;
        }

        public String getMemberName() {
            return memberName;
        }

        public int getMemberAge() {
            return memberAge;
        }
    }   // 내부 클래스 끝.

    public void addMember(String memberID, String memberName, int memberAge) { // 새 회원을 추가하는 메서드
        if (members == null) {  // 참조 배열이 null 이라면 new Member[10]
            members = new Member[10];
        }
        members[index++] = new Member(memberID, memberName, memberAge);
        // Member 객체를 생성하여 members 리스트에 추가합니다.
    }
    // 반환형이 Member의 객체이기 때문에 Member임.
    public Member findMember(String memberID) { //주어진 아이디에 해당하는 회원을 찾아서 반환하는 메서드입니다.
        for (int i = 0; i < index; i++) {
            if (memberID.equals(members[i].getMemberID())) {
                return members[i];  // 리턴타입이 Member
            }
        }
        return null;
    }
    void displayAllMembers() {  // 모든 회원 정보를 출력하는 메서드 // 출려하라 했으니 System.out.println()
        for (int i = 0; i < index; i++) {
            System.out.println("회원의 아이디: " + members[i].getMemberID() + " / 회원의 이름: " + members[i].getMemberName() +
                    "/ 회원의 나이: " + members[i].getMemberAge());
        }
    }
}

public class Exam02 {
    public static void main(String[] args) {
        MemberManagement memberManagement = new MemberManagement(); // 외부 클래스 생성

        memberManagement.addMember("123", "tom", 20);
        memberManagement.addMember("234", "jim", 21);
        memberManagement.addMember("345", "gin", 22);

        MemberManagement.Member member = memberManagement.findMember("234");
        System.out.println("회원의 아이디: " + member.getMemberID() + " / 회원의 이름: " + member.getMemberName() +
                "/ 회원의 나이: " + member.getMemberAge());
        // 회원의 아이디 : 234 / 회원의 이름 : jim / 회원의 나이 : 21
        memberManagement.displayAllMembers();
        /*
        회원의 아이디: 234 / 회원의 이름: jim/ 회원의 나이: 21
        회원의 아이디: 123 / 회원의 이름: tom/ 회원의 나이: 20
        회원의 아이디: 234 / 회원의 이름: jim/ 회원의 나이: 21
        회원의 아이디: 345 / 회원의 이름: gin/ 회원의 나이: 22회원의 아이디: 123/
         */
        /*
        todo 여기서 변형을 한다면
            - 콘솔로 입력을 받아 보던가 #1
            - findmember 에서 아이디가 틀리면 에러를 뜨게 하던가 #2
         */
    }
}
