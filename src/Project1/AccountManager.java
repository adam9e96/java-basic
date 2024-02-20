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
        if (accountDAO.selectMemberIdCnt(member.getUserId()) == 1) {
            // 회원 등록
            if (accountDAO.insertMember(member)) {
                System.out.println("회원 등록이 되었습니다.");
            }
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
            if (accountDAO.selectAccountIdCnt(account.getAccountNumber()) == 1){ // 중복이 아니여야 한다.
                // 해당 아이디가 같은 계좌 종류를 사용 하는지
                if (accountDAO.selectAccountIdCnt(member.getUserId()) == accountDAO.selectMemberIdCnt(member.getUserId()) ){
                    if (accountDAO.insertAccount(account)){
                        System.out.println("계좌 등록이 되었습니다.");
                    }
                    accountDAO.selectAccount(account.getAccountType()){
                        // 2024-02-20 수정중..
                    }
                }
            }

        }

        if (accountDAO.selectMemberIdCnt(member.getUserId()) == 1 { //
            if (accountDAO.selectAccountIdCnt(account.getAccountNumber())) {

            }
        } else{
            System.out.println(member.getMemberId() + "는 없는 아이디입니다.");
        }
        if (accountDAO.insertAccount(account)) {
//            insertAccount 메소드 -> private 중복 아이디 검사 메소드 -> 다시 insertAccount로 돌아와 계좌번호
//            검사 후 insert into 실행 -> 해당 아이디 동일 계좌를 가지고 있는지 검사 후 - 결과값 boolean으로 반환
//            계좌 등록시 1) 사용중인 아이디인지 2) 사용중인 계좌번호인지 3) 해당 아이디가 같은 계좌 종류를 사용중인지
//            체크 후에 계좌를 개설.
            System.out.println("계좌 등록이 되었습니다.");
        } else {
            System.out.println(member.getMemberId() + "는 없는 아이디입니다.");
        }

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
