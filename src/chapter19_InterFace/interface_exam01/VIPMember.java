package chapter19_InterFace.interface_exam01;

public class VIPMember extends SuperMember implements Member {
    //    private String memberId;
//    private String memberName;
    private int vipLevel;

    public VIPMember(String memberId, String memberName, int vipLevel) {
        super(memberId, memberName);
//        this.memberId = memberId;
//        this.memberName = memberName;
        this.vipLevel = vipLevel;
    }

    @Override
    public String getMemberInfo() { // 회원 정보를 문자열로 반환
        return "회원 ID:" + this.getMemberId() + ", 이름:" + this.getMemberName() +
                ", vipLevel:" + this.vipLevel;
    }

}
