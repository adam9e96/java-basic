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
    private Connection connection;
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
        if (isMember(member.getUserId())){
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

        // 사용중인 아이디인지
        if (accountDAO.selectMemberIdCnt(member.getUserId()) == 0) {    // 중복이여야 한다 (중복은  0반환)
            // 사용중인 계좌 번호인지
            if (accountDAO.selectAccountIdCnt(String.valueOf(account.getAccountNumber())) == 1) { // 중복이 아니여야 한다.
                // todo 여기부터
                // 해당 아이디가 같은 계좌 종류를 사용 하는지
//                if(accountDAO.selectAccountIdCnt(){
                
                    accountDAO.insertAccount(account);
                    System.out.println("계좌 등록이 되었습니다.");
                    // 쿼리문 
                    // select count(accountType) from account where memberid= (
                    // select memberId from member where userId='test');

//                } else {
//                    System.out.println("이미 계좌가 개설되어 있습니다.");
//                } // todo 여기까지 잘 모르겠음
            } else {
                System.out.println(account.getAccountNumber() + "는 사용중인 계좌번호입니다.");
            }
        } else {
            System.out.println(member.getMemberId() + "는 없는아이디입니다.");
        }
    }

    @Override
    public void deposit() { // case 3번

    }

    @Override
    public void withdraw() { // case 4번

    }

    @Override
    public void viewHistory() { // case 5번

    }

    @Override
    public void disConnect() { // case 6번

    }

    @Override
    public boolean isMember(String memberId) {
        if (accountDAO.selectMemberIdCnt(memberId) == 1){
            // select count(userId) from member where userId='test';
            return true;
        }
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
