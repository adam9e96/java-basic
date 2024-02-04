package test.chapter13;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Tom");
        account.setBalance(10000);

        System.out.println("이름은 " + account.getName() + "통장 잔고는 " +
                account.getBalance() + "입니다.");

        System.out.println("====================");
    }
}
