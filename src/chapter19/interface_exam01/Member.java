package chapter19.interface_exam01;

public interface Member{
    String getMemberInfo(); // 회원 정보를 반환하는 추상 메서드
}

class SuperMember {
    private String memberId;
    private String memberName;

    public SuperMember(String memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }
}
