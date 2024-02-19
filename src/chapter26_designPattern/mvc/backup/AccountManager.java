package chapter26_designPattern.mvc.backup;

import chapter26_designPattern.mvc.Account;
import chapter26_designPattern.mvc.AccountDAO;

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
    private ArrayList<Account> list;    // 여기서 쓸 멤버들 // 내부적으로 저장할 때 쓸려고 만든거
    private  final AccountDAO accountDAO;
    private final Scanner stdIn;
    private Connection connection = null;   ///DB랑 소통할 객체 생성

    public AccountManager(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;   // 생성자
        getConnection();// 생성자를 초기화 하는 순간. 즉 메인 메소드에서 AccountManager 클래스 객체를 생성하는 순간 DB연결 메소드도 실행됨
        this.list = new ArrayList<>();  // 생성
        this.stdIn = new Scanner(System.in);    // Scanner 객체도 생성
    }

    // 디비 관련 시작
    private void getConnection() {  // DB랑 연결하는 메소드
        // 디비 연결. 생성자에서 실행
        try {
            final String DB_URL = "jdbc:mariadb://localhost:3306/sample_java"; // 첫번째 매개값. 연결 문자열
            final String DB_USER = "root";
            final String DB_PASS = "3033";

            try {
                Class.forName("org.mariadb.jdbc.Driver");    // JDBC 드라이버 등록. point1
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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
        if (addAccount(account)) {  // 이게 INSER INTO 쿼리를 해서 성공한 결과를 불린값으로 돌려주기만 하면 되서 그래요
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
        Statement statement = null;
        if (isAccount(account.getId())) { // 계좌 생성전에 동일한 계좌 번호가 존재하는지 확인 // 중복검사
            System.out.println(account.getId() + " 계좌가 존재합니다.");
            return false;
        }
        // 중복검사에서 0 이 나온경우 false 인경우
        boolean res = false;
        int cnt = 0;
        try {           // insert into account (id, name, balance) VALUES (9999,'이수빈',100000);
            String sql = String.format("INSERT INTO account VALUES (%d, '%s', %d)" //  Java에서 문자열을 형식화(format)하기 위해 사용하는 메소드
                    , account.getId(), account.getName(), account.getBalance()); // printf 라고 보면됨
            // 이 메소드를 사용하면 변수의 값을 문자열 안에 삽입하거나, 특정 형식에 맞춰 문자열을 구성할 수 있습니다.
            System.out.println(sql); // 테스트 코드
            // INSERT INTO account VALUES (9999, '이수빈', 100000)
            statement = connection.createStatement();
            cnt = statement.executeUpdate(sql); // insert, update 등은 반환값 int
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // 저희는 그때 DB 클래스에 closeDB 메소드에다 닫는기능을 다 통합했는데
            try {
                if (statement != null) {
                    statement.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        // 이건 성공 여부
        res = (cnt == 0) ? false : true; // insert into ~~ 해서 성공하면 1이니까
        return res; // // res가 쿼리 실행한 결과값으로 1 아니면 0
    }

    // 1
    private boolean isAccount(int id) { // 동일한 계좌가 있는지 // 중복 검사
        int res = 0;
        try {
            // SELECT COUNT(*) AS cnt FROM account WHERE id =9999;
            String sql = "SELECT COUNT(*) AS cnt FROM account WHERE id ='" + id + "'";
//            System.out.println(sql); // 테스트 코드
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            res = resultSet.getInt("cnt"); // 라벨을 이용해서 값을 얻어 낼 수도 있다.
//            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        return res != 0;
        return res != 0 ? true : false; //true 면 계좌 생성을 중지 1이 나온경우다 쿼리문 결과가
    }

    // 2
    public void deposit() throws SQLException { // 입금
        System.out.print("계좌번호: ");
        int id = stdIn.nextInt();   // int 9999

        System.out.print("입금액: ");
        long money = stdIn.nextLong();  // long 10000

        // 해당 계좌 찾기 // 이건 아직 DB랑 안되어있음 . 자바랑만 소통하도록 list.add
        if (isAccount(id)) {
            updateBalance(id, money, true);
        } else {
            System.out.println("해당 계좌번호가 존재하지 않습니다.");
        }
    }

    private void updateBalance(int id, long money, boolean flag) throws SQLException {  // 입금과 출금 동시에 할거임
        /* 입금, 출금 처리 */
        // flag true : 출금 / falg false : 입금
        Statement statement = null;
        boolean res = false;
        int upd = 0;
        try {
            String sql;
            if (flag) { // 입금
                sql = String.format("UPDATE account SET balance = balance + %d WHERE (id=%d)", money, id);
            } else {    // 출금
                sql = String.format("UPDATE account SET balance = balance - %d WHERE (id=%d)", money, id);
            }
            statement = connection.createStatement();
            upd = statement.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        res = (upd == 0) ? false : true;
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

        Account account = selectOne(id);
        if (account.getBalance() < money) { // 출금할 때는 잔액 비교를 해야됨
            System.out.println("잔앢이 부족합니다.");
        } else {
            updateBalance(id, money, false);    // 맞는 계좌를 찾으면 출금
            System.out.println("출금완료 되었습니다.");
        }

    }

    private Account selectOne(int id) throws SQLException { // 계좌 잔액 확인을 위해 정보를 가지고 옴
        /* 계좌 번호를 받아 계좌 정보를 전달 */
        Account account = null;
        Statement statement = null;
        try {
            String sql = String.format("SELECT * FROM account WHERE id=%d", id); // printf
            System.out.println(sql); // 테스트 코드
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) { // 가져올때 라벨로 할 수도 있고 인덱스로 가져올 수도 있음
                account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setName(resultSet.getString("name"));
                account.setBalance(resultSet.getInt("balance"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
//                if (resultSet != null) {    // 열린 경우 닫음
//                    resultSet.close();
//                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return account;
    }


    public void inquire() throws SQLException { // 잔액 조회
        System.out.print("계좌번호: ");
        int id = stdIn.nextInt();

        if (!isAccount(id)) {
            System.out.println("해당 계좌번호가 존재하지 않습니다.");
            return;
        }
        Account account = selectOne(id);
        System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
    }

    public void display() { // 출력
        ArrayList<Account> list = selectAll();  // 목록을 사용할 때는 ArrayList를 사용한다..
        for (Account account : list) {
            System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
        }

    }

    private ArrayList<Account> selectAll() {
        // 전체 정보 전달
        Statement statement = null;
        ArrayList<Account> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM account ";
            System.out.println(sql);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {

                Account account = new Account(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getInt("balance"));
                list.add(account);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public void disConnect() { // 연결 해제. 서비스 종료시에 사용.
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}