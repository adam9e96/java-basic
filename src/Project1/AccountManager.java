package Project1;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : AccountManager
 * date           : 2024-02-20
 * description    :
 * ===========================================================
 */
public class AccountManager implements IAccountManager {

    // Controller 역할을 하는 클래스
    private final Scanner stdIn;
    private final AccountDao accountDAO;
    private ArrayList<Account> list;
    private Connection connection;
    private Member member = new Member();
    private Account account = new Account();


    public AccountManager() {
        this.accountDAO = new AccountDao();  // AccountDAO 인스턴스 생성 // getConnection() 실행
        this.stdIn = new Scanner(System.in);
    }

    @Override
    public void addMember() { // choice : 1 일때

        System.out.print("아이디: ");    // test 입력
        member.setId(stdIn.nextLine()); // test (문자열형식)

        System.out.print("이름: ");
        member.setName(stdIn.next()); // 이수빈

        System.out.print("나이: ");
        member.setAge(stdIn.nextInt());
        System.out.print("거주지: ");
        member.setAddress(stdIn.nextLine());

        if (accountDAO.insertMember(member)) {
            // 성공하면 1
            System.out.println("회원 등록이 되었습니다.");
        } else {
            // 0 // 중복인 경우
            System.out.println(member + "는 사용중인 아이디입니다.");
        }
    }

    @Override
    public void addAccount() { // choice : 2 일 때 
      
        System.out.print("아이디: ");
        member.setId(stdIn.nextLine()); // member 테이블의 멤버 아이디
        System.out.print("계좌종류: (1: 예금계좌, 2: 대출계좌): ");
        account.setAccountType(stdIn.nextInt()); // 1 혹은 2만 입력 가능하도록 제약을 걸어두었음
        System.out.print("계좌번호: ");
        account.setAccountNumber(stdIn.nextInt());
        System.out.print("잔액: ");
        account.setBalance(stdIn.nextDouble());


        if (account.getAccountType() == 1){
            System.out.print("이자율: ");
            account.setInterestRate(stdIn.nextDouble());
        } else if (account.getAccountType() ==2) {
            System.out.print("수수료율: ");
            account.setChargeRate(stdIn.nextDouble());
        }

        if (!(member.getId().equals(accountDAO.selectAccount(member.getId())))){
            // 아이디가 없으면
            System.out.println(member.getId()+"는 없는 아이디 입니다.");
        }
//            if (account.getAccountNumber() == accountDAO.selectAccount(account.)) {
//
//        }

    }

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public void viewHistory() {

    }

    @Override
    public void disConnect() {

    }

    @Override
    public boolean isMember(String memberId) {
        return false;
    }

    @Override
    public boolean isAccount(String accountId) {
        return false;
    }

    @Override
    public boolean isPart(Account account) {
        return false;
    }
}
