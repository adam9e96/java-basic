package Project1;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : AccountManager
 * date           : 2024-02-20
 * description    : Controller 역할을 하는 클래스
 * ===========================================================
 */
public class AccountManager implements IAccountManager {

    private final Scanner stdIn;
    private final AccountDao accountDAO;
    private ArrayList<Account> list;
    private Connection connection = null;
    private Member member = new Member();
    private Account account = new Account();


    public AccountManager() {
        this.accountDAO = new AccountDao();  // AccountDAO 인스턴스 생성 // getConnection() 실행
        this.stdIn = new Scanner(System.in);
    }

    @Override
    public void addMember() { // choice : 1 일때

        System.out.print("아이디: ");    // 유저_아이디
        member.setUserId(stdIn.nextLine()); // test (문자열형식)
        System.out.print("이름: "); // 유저_이름
        member.setName(stdIn.nextLine()); // 김유니
        System.out.print("나이: "); // 유저_나이
        member.setAge(stdIn.nextInt()); // 25
        System.out.print("거주지: "); // 유저_거주지
        member.setAddr(stdIn.nextLine()); // 경북

        // 회원가입 시 아이디 중복 검사
        if (isMember(member.getUserId())) {
            // 회원 등록
            accountDAO.insertMember(member);
//           ㄴ INSERT INTO member (userId, name, age, addr) VALUES  ( 'test', '김유니', 25, '경북');
            // 이렇식으로
            System.out.println("회원 등록이 되었습니다.");
        } else { // 중복검사해서 중복이 나온 경우
            System.out.println(member.getUserId() + "는 사용중인 아이디입니다.");
        }

    }

    @Override
    public void addAccount() { // choice : 2 일 때 

        System.out.print("아이디: ");
        member.setUserId(stdIn.nextLine());    // 유저_아이디
        System.out.print("계좌종류: (1: 예금계좌, 2: 대출계좌): ");
        account.setAccountType(stdIn.nextInt()); // 1 혹은 2만 입력 가능하도록 제약을 걸어두었음
        System.out.print("계좌번호: ");
        account.setAccountNumber(stdIn.nextLine());
        System.out.print("잔액: ");
        account.setBalance(stdIn.nextDouble());
//
        // 사용중인 아이디인지
        if (isMember(member.getUserId())) {
            // 사용중인 계좌 번호인지
            if (isAccount(account.getAccountNumber())) {
                // 해당 아이디가 같은 계좌 종류를 사용 하는지
                if (isPart(account)) {
                    accountDAO.insertAccount(account);
                    System.out.println("계좌 등록이 되었습니다.");
                } else {
                    System.out.println("이미 계좌가 개설되어 있습니다.");
                }
            } else {
                System.out.println(account.getAccountNumber() + "는 사용중인 계좌번호입니다.");
            }
        } else {
            System.out.println(member.getMemberId() + "는 없는아이디입니다.");

        }
    }

    @Override
    public void deposit() { // case 3번
        System.out.print("계좌번호: ");
        account.setAccountNumber(stdIn.nextLine());
        System.out.print("입금액: ");
        double money = stdIn.nextDouble();

        if (isAccount(member.getUserId())) {
            if (isPart(account)) {
                // true : 예금 계좌
                accountDAO.updateBalance(account.getAccountNumber(), money);

            } else {
                // false : 출금 계좌
                accountDAO.updateBalance(account.getAccountNumber(), money + money * account.getTypeRate());
            }
        } else {
            System.out.println("해당 계좌번호가 존재하지 않습니다.");
        }
    }

    @Override
    public void withdraw() { // case 4번
        System.out.print("계좌번호: ");
        account.setAccountNumber(stdIn.nextLine());
        System.out.print("출금액: ");
        double money = stdIn.nextDouble();

        if (isAccount(member.getUserId())) {
            if (isPart(account)) {
                // true : 예금 계좌
                accountDAO.updateBalance(account.getAccountNumber(), money);
            } else {
                // false : 출금 계좌
                accountDAO.updateBalance(account.getAccountNumber(), -(money + money * account.getTypeRate()));
            }
        } else {
            System.out.println("해당 계좌번호가 존재하지 않습니다.");
        }
    }

    @Override
    public void viewHistory() { // case 5번


    }

    @Override
    public void disConnect() { // case 6번
        accountDAO.disConnect();
        stdIn.close();
    }

    @Override
    public boolean isMember(String userId) { // 해당 아이디의 회원 개수를 반환
        if (accountDAO.selectMemberIdCnt(userId) == 1) {
            //
            //SELECT COUNT(*) AS UserCount
            //FROM member
            //WHERE userId = 'test';
            return true;
        }
        return false;
    }

    @Override
    public boolean isAccount(String accountId) {    // 해당 계좌번호의 계좌 개수를 반환
        if (accountDAO.selectAccountIdCnt(accountId) == 1) {
            //select count(*) from account where accountId='3033';
            return true;
        }
        return false;
    }

    @Override
    public boolean isPart(Account account) { // 계좌 유형 중복검사
        return accountDAO.selectTypeRate(account) == 1; // DAO 클래스에서 만드는 편이 좋을듯 합니다.
        // 반환값이 1이면 예금 0이면 출금으로
    }
}
