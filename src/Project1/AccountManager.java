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
        member.setName(stdIn.nextLine()); // 이수빈
        System.out.print("나이: "); // 유저_나이
        member.setAge(stdIn.nextInt());
        System.out.print("거주지: ");
        member.setAddr(stdIn.nextLine());

        // 회원가입 시 아이디 중복 검사
        if (isMember(member.getUserId())) {
            // 회원 등록
            accountDAO.insertMember(member);
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
        account.setAccountNumber(stdIn.nextInt());
        System.out.print("잔액: ");
        account.setBalance(stdIn.nextDouble());
//
        // 사용중인 아이디인지
        if (isMember(member.getUserId())) {
            // 사용중인 계좌 번호인지
            if (isAccount(member.getUserId())) {
                // 해당 아이디가 같은 계좌 종류를 사용 하는지
//                if (isPart()==1) { // todo 1 여기를 모르겠음
//                    accountDAO.insertAccount(account);
//                    System.out.println("계좌 등록이 되었습니다.");
//                } else {
//                    System.out.println("이미 계좌가 개설되어 있습니다.");
//                }
//            else{
//                    System.out.println(account.getAccountNumber() + "는 사용중인 계좌번호입니다.");
//                } else{
//                    System.out.println(member.getMemberId() + "는 없는아이디입니다.");
//                }

            }
        }
    }

    @Override
    public void deposit() { // case 3번
        System.out.print("계좌번호: ");
        account.setAccountNumber(stdIn.nextInt());
        System.out.print("입금액: ");
        double money = stdIn.nextDouble();

        if (isAccount(member.getUserId())){
            accountDAO.updateBalance(String.valueOf(account.getMemberid()),money);
        } else {
            System.out.println("해당 계좌번호가 존재하지 않습니다.");
        }
    }

    @Override
    public void withdraw() { // case 4번
        System.out.print("계좌번호: ");
        account.setAccountNumber(stdIn.nextInt());
        System.out.print("출금액: ");
        double money = stdIn.nextDouble();
        if (!isAccount(member.getUserId())){
            accountDAO.updateBalance(String.valueOf(account.getMemberid()),money);
        } else {
            System.out.println("해당 계좌번호가 존재하지 않습니다.");
        }
    }

    @Override
    public void viewHistory() { // case 5번
        // todo 2 미완성
    }

    @Override
    public void disConnect() { // case 6번
        accountDAO.disConnect();
        stdIn.close();
    }

    @Override
    public boolean isMember(String memberId) {
        if (accountDAO.selectMemberIdCnt(memberId) == 1) {
            // select count(userId) from member where userId='test'; // test는 예시
            return true;
        }
        return false;
    }

    @Override
    public boolean isAccount(String accountId) {
        if (accountDAO.selectAccountIdCnt(accountId) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isPart(Account account) {
        // todo 못한거3
//        if (accountDAO.selectAccount(account.getAccountType()))
        // select count(accountType) from account where memberid= (
        // select memberId from member where userId='test');
        return false;
    }
}
