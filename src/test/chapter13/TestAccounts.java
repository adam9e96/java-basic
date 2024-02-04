package test.chapter13;

public class TestAccounts {
    public static void main(String[] args) {
        Accounts aCcounts = new Accounts(10000);
        aCcounts.setBalance(1000002);
        System.out.println("현재 금액 : " + aCcounts.getBalance());


    }

}
