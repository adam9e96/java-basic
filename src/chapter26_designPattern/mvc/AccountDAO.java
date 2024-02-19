package chapter26_designPattern.mvc;

import java.sql.*;
import java.util.ArrayList;

/**
 * ===========================================================
 * fileName       : AccountDAO
 * date           : 2024-02-19
 * description    :
 * ===========================================================
 */
/*
    2차 패키지에서
    1) Controller 에 있는 데이터 베이스 관련 처리를 따로 분리. DAO 클래스 생성.
    Model 은 DTO와 DAO로 구성.
    2) try with resourse 와 PreparedStatement
 */
public class AccountDAO {
    /*
        DB 서버와 접속하고 레코드를 처리하는 기능.
        데이터베이스 처리에 관한 기능만으로 구성되는 객체를 DAO  Data Access Object 객체라고 함.
     */
    private Connection connection = null;

    public AccountDAO() {
        getConnection();
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


    public int selectAccountCnt(int id) {   // 반환형이 int인데 0과 1만 나오므로 return에 == 연산자로 boolean으로 결과값을 주도록하면됨.
        /* 해당 계좌번호의 계좌가 있는지 리턴 */
        String sql = "SELECT COUNT(*) AS cnt FROM sample_java.account WHERE id = ? ";
        int cnt = 0;
        // try-with-resources 사용으로 preparedStatement 는 자동으로 close 됨. 즉 clone 코딩을 안해도 됨.
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                resultSet.next();
                cnt = resultSet.getInt(1);  // 1 혹은 0의 값을 반환.
            }
        } catch (SQLException e) {
            throw new RuntimeException();
//            e.printStackTrace();// todo
        }
        return cnt;
    }

    public boolean insertAccount(Account account) {

        String sql = "INSERT INTO account VALUES (?,?,?)";
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, account.getId());
            preparedStatement.setString(2, account.getName());
            preparedStatement.setLong(3, account.getBalance());

            return preparedStatement.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public boolean updateBalance(int id, long money, boolean flag) {  // 입금과 출금 동시에 할거임
        /* 입금, 출금 처리 */
        // flag true : 출금 / falg false : 입금

        String sql;
        int cnt = 0;
        if (flag) { // 입금
            sql = String.format("UPDATE account SET balance = balance + ? WHERE (id = ?)");
        } else {    // 출금
            sql = String.format("UPDATE account SET balance = balance - ? WHERE (id=?)");
        }

        try (PreparedStatement preparedStatement = this.connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, money);
            preparedStatement.setInt(2, id);
            cnt = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cnt == 1;
    }

    public Account selectOne(int id) { // 계좌 잔액 확인을 위해 정보를 가지고 옴
        /* 계좌 번호를 받아 계좌 정보를 전달 */
        Account account = new Account();
        String sql = String.format("SELECT * FROM account WHERE id=?"); // printf
        System.out.println(sql); // 테스트 코드

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) { // 가져올때 라벨로 할 수도 있고 인덱스로 가져올 수도 있음
                    account = new Account();
                    account.setId(resultSet.getInt("id"));
                    account.setName(resultSet.getString("name"));
                    account.setBalance(resultSet.getInt("balance"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }

    public ArrayList<Account> selectAll() {
        // 전체 정보 전달
        String sql = "SELECT * FROM account ";
        ArrayList<Account> list = new ArrayList<>();

        try (
                PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()
        ) {
            while (resultSet.next()) {
                Account account = new Account(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getInt("balance"));
                list.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();

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