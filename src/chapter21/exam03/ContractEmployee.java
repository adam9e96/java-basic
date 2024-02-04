package chapter21.exam03;

public class ContractEmployee extends FullTimeEmployee {
    private int contractDuration; // 계약기간 (개월)

    public ContractEmployee(String name, String employeeId, int contractDuration, int monthlySalary) {
        super(name, employeeId, monthlySalary);
        this.contractDuration = contractDuration;
    }

    @Override
    public int calculateSalary() {
        return contractDuration * monthlySalary; // getMonthlySalry() 메소드르 만들어서 가져와도 됨 protected를 쓴다면
    }
}
