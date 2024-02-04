package chapter13.account;
// 접근 제어자 연습

public class Account {
    // 필드가 모두 private 로 선언, 클래스 내부에서만 사용 가능.
    private int regNumber;
    String name;
    private int balance;

    // 접근자와 설정자를 사용. regNumber 필드에 관한 내용은 없어서 클래스 외부에서 접근, 설정이 안됨..
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance > 0){
        this.balance = balance;
        } else{
            System.out.println("0원 미만은 넣을 수 없습니다.");
        }
    }
    public int getRegNumber(){
        return regNumber;
    }
    public void setRegNumber(int regNumber){
        this.regNumber = regNumber;
    }
}
