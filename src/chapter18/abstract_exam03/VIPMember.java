package chapter18.abstract_exam03;

public class VIPMember extends Member {
    public VIPMember(String name, int membershipYear) {
        super(name, membershipYear);
    }

    @Override
    public int calculateAnnualFee() {
        return 50;
    }
}
