package chapter13.account;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Tom");
        account.setBalance(10000);

        System.out.println("이름은 " + account.getName() + "통장 잔고는 " +
                account.getBalance() + "입니다.");

        System.out.println("====================");

        account.setRegNumber(234567);
        account.setName("김유식");
        account.setBalance(0); // 원래는 초기화 값이 0이라 안해줘도 됨
        account.setBalance(100);
        System.out.println("이름은 " +account.getName() + "통장 잔고는 "+account.getBalance()
        + "이고 계좌 번호는 "+ account.getRegNumber());
    }
}
/*
* 계좌 생성시에 계좌번호와 이름만 입력
(잔액은 0)

계좌 번호는 조회가능하지만 이름은 변경하지 못하도록 하기 < -- setName 막으면 됨
getRegNumber - O
setName - X <- setName 메소드를 만들지 않으면 이름 변경할 방법이 없어짐
* private로 필드를 접근을 막은상태에서 setter를 만들지 않으면 외부에서 접근/수정할 방법이 없음.
 */