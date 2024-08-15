package chapter_17_abstract.abstract_exam03;

public abstract class Member {
    private String name; // 회원의 이름
    private int membershipYear; //  회원 가입 연도

    public Member(String name, int membershipYear) {
        this.name = name;
        this.membershipYear = membershipYear;
    }

    public abstract int calculateAnnualFee(); // 회원의 연간 회비를 계산하는 추상 메서드

    public String getName() {
        return name;
    }

    public int getMembershipYear() {
        return membershipYear;
    }
}
