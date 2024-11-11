package chapter19_InnerClass;

/*
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

/**
 * MemberManagement 클래스는 회원을 관리하기 위한 기능을 제공합니다.
 * 회원 정보를 저장하는 배열과 회원 관리 기능을 위한 메서드를 포함합니다.
 * 내부 클래스 Member를 통해 회원 객체를 정의합니다.
 */
class MemberManagement { // 외부 클래스
    private Member[] members = null; // 회원 객체를 저장하는 배열
    private int index = 0; // 회원 배열의 현재 인덱스를 추적

    /**
     * Member 클래스는 MemberManagement 클래스의 내부 클래스로,
     * 개별 회원의 정보를 관리합니다.
     *
     * @param memberID   회원의 아이디
     * @param memberName 회원의 이름
     * @param memberAge  회원의 나이
     */
    record Member(String memberID, String memberName, int memberAge) { // 내부 클래스
        /**
         * Member 클래스의 생성자로, 회원의 아이디, 이름, 나이를 초기화합니다.
         *
         * @param memberID   회원의 고유 아이디
         * @param memberName 회원의 이름
         * @param memberAge  회원의 나이
         */
        Member {
        }

        /**
         * 회원의 아이디를 반환합니다.
         *
         * @return 회원의 고유 아이디
         */
        @Override
        public String memberID() {
            return memberID;
        }

        /**
         * 회원의 이름을 반환합니다.
         *
         * @return 회원의 이름
         */
        @Override
        public String memberName() {
            return memberName;
        }

        /**
         * 회원의 나이를 반환합니다.
         *
         * @return 회원의 나이
         */
        @Override
        public int memberAge() {
            return memberAge;
        }
    }   // 내부 클래스 끝

    /**
     * 새 회원을 추가하는 메서드로, 회원의 아이디, 이름, 나이를 받아
     * 새로운 Member 객체를 생성하여 members 배열에 추가합니다.
     *
     * @param memberID   회원의 고유 아이디
     * @param memberName 회원의 이름
     * @param memberAge  회원의 나이
     */
    public void addMember(String memberID, String memberName, int memberAge) {
        if (members == null) {  // 참조 배열이 null이면 새로운 배열 생성
            members = new Member[10];
        }
        members[index++] = new Member(memberID, memberName, memberAge);
    }

    /**
     * 주어진 아이디에 해당하는 회원을 찾아 반환하는 메서드입니다.
     *
     * @param memberID 검색할 회원의 아이디
     * @return Member 객체, 해당 아이디의 회원이 존재하지 않으면 null 반환
     */
    public Member findMember(String memberID) {
        for (int i = 0; i < index; i++) {
            if (memberID.equals(members[i].memberID())) {
                return members[i];  // 일치하는 회원을 찾으면 반환
            }
        }
        return null;  // 해당 회원이 없으면 null 반환
    }

    /**
     * 모든 회원 정보를 출력하는 메서드입니다.
     * 각 회원의 아이디, 이름, 나이를 출력합니다.
     */
    void displayAllMembers() {
        for (int i = 0; i < index; i++) {
            System.out.println("회원의 아이디: " + members[i].memberID() +
                    " / 회원의 이름: " + members[i].memberName() +
                    " / 회원의 나이: " + members[i].memberAge());
        }
    }
}

/**
 * InnerClassDemo02 클래스는 프로그램의 진입점으로,
 * MemberManagement 객체를 생성하고 회원을 추가, 검색, 출력하는 기능을 수행합니다.
 */
public class InnerClassDemo02 {
    /**
     * 프로그램의 메인 메서드로, 회원 관리 작업을 수행합니다.
     *
     * @param args 프로그램 실행 시 전달되는 인자 (사용되지 않음)
     */
    public static void main(String[] args) {
        MemberManagement memberManagement = new MemberManagement(); // 외부 클래스 생성

        memberManagement.addMember("123", "tom", 20);
        memberManagement.addMember("234", "jim", 21);
        memberManagement.addMember("345", "gin", 22);

        MemberManagement.Member member = memberManagement.findMember("234");
        if (member != null) {
            System.out.println("회원의 아이디: " + member.memberID() +
                    " / 회원의 이름: " + member.memberName() +
                    " / 회원의 나이: " + member.memberAge());
        } else {
            System.out.println("해당 아이디의 회원을 찾을 수 없습니다.");
        }

        memberManagement.displayAllMembers();
        /*
        출력 결과:
        회원의 아이디: 234 / 회원의 이름: jim / 회원의 나이: 21
        회원의 아이디: 123 / 회원의 이름: tom / 회원의 나이: 20
        회원의 아이디: 234 / 회원의 이름: jim / 회원의 나이: 21
        회원의 아이디: 345 / 회원의 이름: gin / 회원의 나이: 22
         */
    }
}