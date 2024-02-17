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
public class AccountManager {   // Controller 역할 // 내부 로직? 같은거  // 컨트롤러 클래스이고
    private ArrayList<Account> list;    // 여기서 쓸 멤버들 // 내부적으로 저장할 때 쓸려고 만든거
    private Scanner stdIn;
    private Connection connection = null;   ///DB랑 소통할 객체 생성

    public AccountManager() {   // 생성자
        getConnection();// 생성자를 초기화 하는 순간. 즉 메인 메소드에서 AccountManager 클래스 객체를 생성하는 순간 DB연결 메소드도 실행됨
        this.list = new ArrayList<>();  // 생성
        this.stdIn = new Scanner(System.in);    // Scaaner 객체도 생성
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
    private boolean addAccount(Account account) {   //계좌 . 즉 계좌에 데이터를 입력하는 쿼리문
        /* 계좌 생성 */
        Statement statement = null;
        if (isAccount(account.getId())) { // 계좌 생성전에 동일한 계좌 번호가 존재하는지 확인
            System.out.println(account.getId() + " 계좌가 존재합니다.");
            return false;
        }
        boolean res = false;
        int cnt = 0;
        try {           // insert into account (id, name, balance) VALUES (9999,'이수빈',100000);
            String sql = String.format("INSERT INTO account VALUES (%d, '%s', %d)"
                    , account.getId(), account.getName(), account.getBalance());
            System.out.println(sql); // 테스트 코드
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

    private boolean isAccount(int id) { // 동일한 계좌가 있는지 // 중복 검사
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
        int id = stdIn.nextInt();   // int 9999

        System.out.print("입금액: ");
        long money = stdIn.nextLong();  // long 10000

        // 해당 계좌 찾기 // 이건 아직 DB랑 안되어있음 . 자바랑만 소통하도록 list.add

        // 이거를 월요일에 DB랑 소통하는 쿼리문으로 바꿀듯
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
 // todo 숙제임  노션에 있는거 붙이면 된다. resultSet을 Account 객체로 변환해서 출력하는 거임
    //여기서 노션에 있던 코드
//            private ArrayList<Account> selectAll()
//    {
//                // 전체 정보 전달
//                Statement statement = null;
//                ArrayList<Account> list = new ArrayList<>();
//                try {
//                    String sql = "SELECT * FROM account ";
//                    System.out.println(sql);
//                    statement = connection.createStatement();
//                    ResultSet resultSet = statement.executeQuery(sql);
//                    while (resultSet.next()) {
//
//                        Account account = new Account(resultSet.getInt("id"), resultSet.getString("name"),
//                                resultSet.getInt("balance"));
//                        list.add(account);
//                    }
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//                    try {
//                        if (statement != null) {
//                            statement.close();
//                        }
//                    } catch (SQLException e) {
//                        e.printStackTrace();
//                    }
//                }
//                return list;
//            }
    }
}