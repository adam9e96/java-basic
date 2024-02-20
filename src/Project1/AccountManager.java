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
public class AccountManager implements IAccountManager{

    // Controller 역할을 하는 클래스
    private final Scanner stdIn;
    private final AccountDao accountDAO;
    private ArrayList<Account> list;
    private Connection connection;


    public AccountManager() {
        this.accountDAO = new AccountDao();  // AccountDAO 인스턴스 생성 // getConnection() 실행
        this.stdIn = new Scanner(System.in);
    }

    @Override
    public void addMember() { // choice : 1 일때
       Member member = new Member();

        System.out.print("아이디: ");    // test 입력
        member.setId(stdIn.nextLine()); // test (문자열형식)

        System.out.print("이름: ");
        member.setName(stdIn.next()); // 이수빈

        System.out.print("나이: ");
        member.setAge(stdIn.nextInt());
        System.out.print("거주지: ");
        member.setAddress(stdIn.nextLine());

        if (accountDAO.insertMember(member)){
            // 성공하면 1
            System.out.println();
        } else {

        }

//
//                // Account 타입의 인스턴스(콘솔로 Id,Name,Balance 를 입력한)를 넘겨준다.
//        if (this.addAccount(account)) {  // 이게 INSER INTO 쿼리를 해서 성공한 결과를 불린값으로 돌려주기만 하면 되서 그래요
//            System.out.println("계좌가 개설되었습니다.");
////            System.out.println(list.toString()+ "\t");
//        } else {    // 0 일때         // insert into account (id, name, balance) VALUES (9999,'이수빈',100000); 이게 안된 경우
//            System.out.println("계좌 생성에 실패했습니다.");
//        }
////        System.out.println("계좌가 개설되었습니다.");
////        System.out.println(list.toString() +

    }

    @Override
    public void addAccount() {

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
