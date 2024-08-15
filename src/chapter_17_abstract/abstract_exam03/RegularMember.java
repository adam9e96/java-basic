package chapter_17_abstract.abstract_exam03;

public class RegularMember extends Member {

    public RegularMember(String name, int membershipYear) {
        super(name, membershipYear);
    }

    @Override
    public int calculateAnnualFee() {
        return getMembershipYear() > 3 ? 80 : 100;
    }
}
