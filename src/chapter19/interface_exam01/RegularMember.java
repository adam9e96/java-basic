package chapter19.interface_exam01;

public class RegularMember extends SuperMember implements Member {
//    private String memberId; // 회원의 고유 아이디
//    private String memberName; // 회원의 이름
    private int membershipYear; // 회원의 가입 연도
    public RegularMember(String memberId, String memberName, int membershipYear){
        super(memberId,memberName);
//        this.memberId = memberId;
//        this.memberName =memberName;
        this.membershipYear = membershipYear;
    }

    @Override
    public String getMemberInfo() { // 회원 정보를 문자열로 반환
        return "회원 ID:" + this.getMemberId() + ", 이름:" + this.getMemberName() +
                ", 가입 연도:" + this.membershipYear;
    }
}
