package chapter26_designPattern.mvc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : AccountManager
 * date           : 2024-02-16
 * description    : Controller
 * 이 클래스의 목적이
 * 시험 2인가 3에서 했던 은행 생성및 넣고 빼기 저장 추력 같은거를
 * 자바 내부에 저장하지 말고 DB랑 소통해서 DB에 저장해보는게 목적인 프로그램
 * 이거 관련된 모든 기능들이 이 클래스에 다 들어가 있음.
 * ===========================================================
 */
/*
    2차 패키지에서
    1) Controller 에 있는 데이터 베이스 관련 처리를 따로 분리. DAO 클래스 생성.
    Model 은 DTO와 DAO로 구성.
    2) try with resourse 와 PreparedStatement 사용으로 수정
    3) 메서드 이름으로만으로 Controller 에 있는 메서드인지, DAO에 있는 메서드인지 구분이 될 수 있도록
    DAO 의 메서드에는 select, insert, update, delete 단어로 메서드의 이름을 시작.
    Controller 에서는 select, insert, update, delete 단어를 사용하지 않음

    4) DAO 의 메서드는 메서드당 하나의 쿼리만 실행.

    1. 데이베이스 연결 메서드 getConnection () 를 DAO로 이동

    2. 계좌개설 makeAccount() 메서드 수정

    3. 계좌 개설 makeAccount() 메서드 수정
 */
public class AccountManager {   // Controller 역할 // 내부 로직? 같은거  // 컨트롤러 클래스이고
    private final Scanner stdIn;
    private final AccountDAO accountDAO;
    //    private ArrayList<Account> list;    // 여기서 쓸 멤버들 // 내부적으로 저장할 때 쓸려고 만든거
    private Connection connection = null;   ///DB랑 소통할 객체 생성

    public AccountManager() {
        this.accountDAO = new AccountDAO();   // 생성자
//        getConnection();// 생성자를 초기화 하는 순간. 즉 메인 메소드에서 AccountManager 클래스 객체를 생성하는 순간 DB연결 메소드도 실행됨
//        this.list = new ArrayList<>();  // 생성
        this.stdIn = new Scanner(System.in);    // Scanner 객체도 생성
    }

    // 디비 관련 시작
//    private void getConnection() {  // DB랑 연결하는 메소드
//         디비 연결. 생성자에서 실행
//        try {
//            final String DB_URL = "jdbc:mariadb://localhost:3306/sample_java"; // 첫번째 매개값. 연결 문자열
//            final String DB_USER = "root";
//            final String DB_PASS = "3033";
//
//            try {
//                Class.forName("org.mariadb.jdbc.Driver");    // JDBC 드라이버 등록. point1
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//            this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public void makeAccount() { // 계좌 개설
        Account account = new Account(); // Account 객체 생성

        System.out.print("계좌 번호: ");    // 계좌 번호가 9999
        account.setId(stdIn.nextInt()); // 9999

        System.out.print("이름: ");
        account.setName(stdIn.next()); // 이수빈

        System.out.print("입금액: ");
        account.setBalance(stdIn.nextLong()); // 10000
//        list.add(account);  // ArrayList 에 추가 DB로 할거니까 필요X // 이건 DB랑 연결안하고 자바에서만 저장할거면
        // Account 타입의 인스턴스(콘솔로 Id,Name,Balance 를 입력한)를 넘겨준다.
        if (this.addAccount(account)) {  // 이게 INSER INTO 쿼리를 해서 성공한 결과를 불린값으로 돌려주기만 하면 되서 그래요
            System.out.println("계좌가 개설되었습니다.");
//            System.out.println(list.toString()+ "\t");
        } else {    // 0 일때         // insert into account (id, name, balance) VALUES (9999,'이수빈',100000); 이게 안된 경우
            System.out.println("계좌 생성에 실패했습니다.");
        }
//        System.out.println("계좌가 개설되었습니다.");
//        System.out.println(list.toString() + "\t");
    }

    // 내부에서 호출되어 사용되기만 하기 때문에 private 로 지정
    private boolean addAccount(Account account) {   //계좌는 id를 의미함 // 매개변수로 Account 타입의 변수를 받는다.
        /* 계좌 생성 */
//        Statement statement = null;
        if (isAccount(account.getId())) { // 계좌 생성전에 동일한 계좌 번호가 존재하는지 확인 // 중복검사
            System.out.println(account.getId() + " 계좌가 존재합니다.");
            return false;
        }
        return accountDAO.insertAccount(account);
    }

    // 1
    private boolean isAccount(int id) { // 동일한 계좌가 있는지 // 중복 검사
        return accountDAO.selectAccountCnt(id) == 1;    // 중복 검사 // 중복된게 있으면 1이 반환
    }

    // 2 // DAO로 옮길 필요 X // 사용자에게 입력을 받는 메소드
    public void deposit() throws SQLException { // 입금
        System.out.print("계좌번호: ");
        int id = stdIn.nextInt();   // int 9999

        System.out.print("입금액: ");
        long money = stdIn.nextLong();  // long 10000

        // 해당 계좌 찾기 // 이건 아직 DB랑 안되어있음 . 자바랑만 소통하도록 list.add
        if (isAccount(id)) {
            accountDAO.updateBalance(id, money, true);
        } else {
            System.out.println("해당 계좌번호가 존재하지 않습니다.");
        }
    }

    // 3
    public void withdraw() throws SQLException { // 출금
        System.out.print("계좌번호: ");
        int id = stdIn.nextInt();   // 9876

        System.out.print("출금액: ");
        long money = stdIn.nextLong(); // 50000

        if (!isAccount(id)) { // 해당 계좌 찾기
            System.out.println("해당 계좌번호가 존재하지 않습니다.");
            return;
        }

        Account account = accountDAO.selectOne(id);
        if (account.getBalance() < money) { // 출금할 때는 잔액 비교를 해야됨
            System.out.println("잔앢이 부족합니다.");
        } else {
            accountDAO.updateBalance(id, money, false);    // 맞는 계좌를 찾으면 출금
            System.out.println("출금완료 되었습니다.");
        }

    }

    public void inquire() { // 잔액 조회
        System.out.print("계좌번호: ");
        int id = stdIn.nextInt();

        Account account = accountDAO.selectOne(id);
        if (account == null) {
            System.out.println("해당 계좌번호가 존재하지 않습니다.");
            return;
        }
        System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
    }

    public void display() { // 출력
        ArrayList<Account> list = accountDAO.selectAll();  // 목록을 사용할 때는 ArrayList를 사용한다..
        for (Account account : list) {
            System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
        }

    }

    public void disConnect() {
        accountDAO.disConnect();
        stdIn.close();
    }


}