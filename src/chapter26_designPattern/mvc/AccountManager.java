package chapter26_designPattern.mvc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : AccountManager
 * date           : 2024-02-16
 * description    : Controller
 * ===========================================================
 */
public class AccountManager {
    private ArrayList<Account> list;
    private Scanner stdIn;
    private Connection connection = null;

    public AccountManager() {
        getConnection();
        this.list = new ArrayList<>();
        this.stdIn = new Scanner(System.in);
    }

    // 디비 관련 시작
    private void getConnection() {
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

        System.out.print("계좌 번호: ");
        account.setId(stdIn.nextInt());

        System.out.print("이름: ");
        account.setName(stdIn.next());

        System.out.print("입금액: ");
        account.setBalance(stdIn.nextLong());

//        list.add(account);  // ArrayList 에 추가 DB로 할거니까 필요X
        if (addAccount(account)) {
            System.out.println("계좌가 개설되었습니다.");
//            System.out.println(list.toString()+ "\t");
        } else {
            System.out.println("계좌 생성에 실패했습니다.");
        }

//        System.out.println("계좌가 개설되었습니다.");
//        System.out.println(list.toString() + "\t");
    }

    // 내부에서 호출되어 사용되기만 하기 때문에 private 로 지정
    private boolean addAccount(Account account) {
        /* 계좌 생성 */
        Statement statement = null;
        if (isAccount(account.getId())) { // 계좌 생성전에 동일한 계좌 번호가 존재하는지 확인
            System.out.println(account.getId() + " 계좌가 존재합니다.");
            return false;
        }
        boolean res = false;
        int cnt = 0;
        try {
            String sql = String.format("INSERT INTO account VALUES (%d, '%s', %d)"
                    , account.getId(), account.getName(), account.getBalance());
            System.out.println(sql); // 테스트 코드
            statement = connection.createStatement();
            cnt = statement.executeUpdate(sql);
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
        res = (cnt == 0) ? false : true;
        return res;

    }

    private boolean isAccount(int id) { // 동일한 계좌가 있는지
        int res = 0;
        try {
            String sql = "SELECT COUNT(*) AS cnt FROM account WHERE id ='" + id + "'";
//            System.out.println(sql); // 테스트 코드
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            res = resultSet.getInt("cnt");
//            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res != 0 ? true : false; //true 면 계좌 생성을 중지
    }

    public void deposit() { // 입금
        System.out.print("계좌번호: ");
        int id = stdIn.nextInt();   // int

        System.out.print("입금액: ");
        long money = stdIn.nextLong();  // long

        // 해당 계좌 찾기
        for (Account account : list) {
            if (account.getId() == id) { // 동일한 계좌가 있다면
                account.setBalance(money + account.getBalance());
                System.out.println("입금완료 되었습니다.");
                return;
            }
        }
        System.out.println("해당 계좌번호가 존재하지 않습니다.");
    }

    public void withdraw() { // 출금
        System.out.print("계좌번호: ");
        int id = stdIn.nextInt();

        System.out.print("출금액: ");
        long money = stdIn.nextLong();

        // 해당 계좌 찾기
        for (Account account : list) {
            if (account.getId() == id) { // 동일한 계좌가 있다면
                if (account.getBalance() < money) {
                    System.out.println("잔액이 부족합니다.");
                } else {
                    account.setBalance(account.getBalance() - money);
                    System.out.println("출금완료 되었습니다.");
                }
                return;
            }
        }
        System.out.println("해당 계좌번호가 존재하지 않습니다.");
    }

    public void inquire() { // 잔액 조회
        System.out.print("계좌번호: ");
        int id = stdIn.nextInt();

        // 해당 계좌 찾기
        for (Account account : list) {
            if (account.getId() == id) { // 동일한 계좌가 있다면
                System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
                return;
            }
        }
        System.out.println("해당 계좌번호가 존재하지 않습니다.");
    }

    public void display() { // 출력
//        ArrayList<Account> list = selectAll(); // todo 숙제임  노션에 있는거 붙이면 된다. resultSet을 Account 객체로 변환해서 출력하는 거임
        for (Account account : list) {
            System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
        }
    }
}