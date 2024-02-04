package chapter19.interface_exam01;

/*
1. Member 인터페이스를 작성하세요.
이 인터페이스는 다음과 같은 추상 메서드를 가져야 합니다.

getMemberInfo(): 회원 정보를 반환하는 추상 메서드.

2. Member 인터페이스를 구현하는 RegularMember 클래스를 작성하세요.
RegularMember 클래스는 다음과 같은 속성을 가져야 합니다.

memberID (문자열): 회원의 고유 아이디
memberName (문자열): 회원의 이름
membershipYear (정수): 회원 가입 연도
RegularMember 클래스에서 getMemberInfo() 메서드를 오버라이딩하여 회원 정보를 문자열로 반환하세요.
반환된 문자열은 아이디와 이름을 포함해야 합니다.

3. Member 인터페이스를 구현하는 VIPMember 클래스를 작성하세요.
VIPMember 클래스는 다음과 같은 속성을 가져야 합니다.

memberID (문자열): 회원의 고유 아이디
memberName (문자열): 회원의 이름
vipLevel (정수): VIP 회원 레벨 (1부터 5까지)
VIPMember 클래스에서 getMemberInfo() 메서드를 오버라이딩하여 회원 정보를 문자열로 반환하세요.
반환된 문자열은 아이디와 이름을 포함해야 합니다.

4. Main 클래스에서 다음과 같은 작업을 수행하세요.

RegularMember 객체와 VIPMember 객체를 각각 생성하고, getMemberInfo() 메서드를 호출하여 회원 정보를 출력하세요.
이 문제를 해결하기 위해 Member 인터페이스를 작성하고, 이를 구현하는 RegularMember 및 VIPMember 클래스를 작성하세요.
각 클래스에서 getMemberInfo() 메서드를 오버라이딩하여 회원 정보를 문자열로 반환하세요.
그리고 Main 클래스에서 객체를 생성하여 반복문을 이용하여 회원 정보를 확인하세요.
 */
public class Main {
    public static void main(String[] args) {
        Member[] members = new Member[2];
        members[0] = new RegularMember("9948", "김갑순", 6);
        members[1] = new VIPMember("99400", "김갑순", 5);

        Member[] members1 = new Member[]{new RegularMember("9948", "김갑순", 6),
                new VIPMember("99400", "김갑순", 5)};

        for (Member member : members ) {
            System.out.println(member.getMemberInfo());
        }
    }
}