package chapter18.abstract_exam03;

/*
1. Member 추상 클래스를 작성하세요. 이 클래스는 다음과 같은 추상 메서드를 가져야 합니다.

calculateAnnualFee(): 회원의 연간 회비를 계산하는 추상 메서드.

2. Member 추상 클래스를 상속받는 RegularMember 클래스를 작성하세요.
RegularMember 클래스는 다음과 같은 속성을 가져야 합니다.

name (문자열): 회원의 이름
membershipYear (정수): 회원 가입 연도
RegularMember 클래스에는 calculateAnnualFee() 메서드를 오버라이딩하여 정회원의 연간 회비를 계산하는 구체적인 구현을 제공하세요.
연간 회비는 가입 연도에 따라 다음과 같이 정해집니다.

가입 연도가 3년 이하인 경우: 100달러
가입 연도가 4년 이상인 경우: 80달러

3. Member 추상 클래스를 상속받는 VIPMember 클래스를 작성하세요.
VIPMember 클래스는 다음과 같은 속성을 가져야 합니다.

name (문자열): 회원의 이름
membershipYear (정수): 회원 가입 연도
VIPMember 클래스에는 calculateAnnualFee() 메서드를 오버라이딩하여 VIP 회원의 연간 회비를 계산하는 구체적인 구현을 제공하세요.
VIP 회원의 연간 회비는 항상 50달러입니다.

4. Main 클래스에서 다음과 같은 작업을 수행하세요.

RegularMember 객체와 VIPMember 객체를 각각 생성하고, 연간 회비를 출력하세요.
이 문제를 해결하기 위해 Member 추상 클래스와 이를 상속받는 RegularMember 및 VIPMember 클래스를 작성하고,
각 클래스에서 calculateAnnualFee() 메서드를 구현하여 연간 회비를 계산하세요.
그리고 Main 클래스에서 객체를 생성하여 연간 회비를 확인하세요.
 */
public class Main {
    public static void main(String[] args) {
        RegularMember regularMember1 = new RegularMember("tim", 3);
        RegularMember regularMember2 = new RegularMember("jim", 4);
        VIPMember vipMember = new VIPMember("lily", 10);

        Member[] members = new Member[3];
        members[0] = regularMember1;
        members[1] = regularMember2;
        members[2] = vipMember;

        for (Member member : members) {
            System.out.println(member.getName() + "의 연회비는 " + member.calculateAnnualFee() + "달러 입니다.");
        }
    }
}
