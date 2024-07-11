package chapter25_jdbc_2;

import java.sql.*;

/**
 * DB 클래스는 MariaDB 데이터베이스와 연결을 관리하는 클래스.
 * 데이터베이스와 연결, 쿼리 실행, 결과 처리 및 연결 해제 기능을 제공
 */
public class DB {
    private Connection conn = null; // DB와 자바 프로그램을 연결하는 데 사용
    private PreparedStatement preparedStatement = null; // 쿼리문을 임시로 저장하고 실행하는 데 사용
    private ResultSet resultSet = null; // 쿼리 결과를 저장하는 데 사용. 주로 SELECT 문에서 사용

    /**
     * 데이터베이스에 연결합니다.
     * MariaDB JDBC 드라이버를 로드하고 데이터베이스 URL, 사용자 이름, 비밀번호를 사용하여 연결을 설정합니다.
     */
    public void connectDB() {
        final String driver = "org.mariadb.jdbc.Driver";
        final String DB_HOST = "127.0.0.1"; // localhost 주소
        final String DB_PORT = "3306";  // Port 번호
        final String DB_NAME = "sample_java2";  // 데이터 베이스 이름    // DB 명
        final String DB_URL = "jdbc:mariadb://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME; // 첫번째 매개값. 연결 문자열
        final String DB_USER = "root";
        final String DB_PASS = "3033";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            if (conn != null) {
                System.out.println("DB 접속 성공");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB 접속 실패");
            e.printStackTrace();
        }

    }

    /**
     * 데이터베이스 연결을 해제합니다.
     * 연결된 ResultSet, PreparedStatement, Connection 객체를 닫습니다.
     */
    public void closeDB() {
        /* 데이터베이스 연결 해제 */
//                System.out.println("result 객체주소 : "+resultSet);  // 테스트 코드
//                System.out.println("preparedStatement 객체주소 : "+preparedStatement); // 테스트 코드
        try {
            if (resultSet != null) {    // 열린 경우 닫음
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("DB 접속 해제");
            }
        } catch (SQLException e) {  // DB를 끊을 때 SQLException 이 발생할 수 있어서 예외 처리가 필요하다.
            e.printStackTrace();
        }
    }
}
