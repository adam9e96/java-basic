package chapter25_jdbc;

import java.sql.*;
// 자바에서 정석적인 DB 연결 방법
/**
 * ===========================================================
 * fileName       : DB
 * date           : 2024-02-14
 * description    :
 * DBMS 와 연결하기.
 * <p>
 * ===========================================================
 */
public class DB {
    // 사용할 객체를 위한 참조변수 선언. 클래스 내의 여러 메서드에서 사용해야 되서 인스턴스 변수로 선언.
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null; // 쿼리시에 결과를 저장하는 용도로 사용. select 에 주로 사용

    public void connectDB() {
        /* 데이터 베이스 연결 */
        // 데이터베이스 접속정보 // DB정보가 변경되면 이것만 수정해주면됨
        final String driver = "org.mariadb.jdbc.Driver";
        final String DB_HOST = "127.0.0.1";
        final String DB_PORT = "3306";
        final String DB_NAME = "sample_java";  // 데이터 베이스 이름
        final String DB_URL = "jdbc:mariadb://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
        final String DB_USER = "root";
        final String DB_PASS = "3033";
    // URL 양식 동일함 e.g) http://naver.com:443/
//                          jdbc:mariadb://127.0.0.1:3306/
        // 디비 접속
        try {
            Class.forName(driver);    // JDBC 드라이버 등록.
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);   // 디비 연결
            if (conn != null) {
                System.out.println("DB 접속 성공");
            }
        } catch (ClassNotFoundException e) { // JDBC 드라이버 등록실패 시
            e.printStackTrace();
        } catch (SQLException e) {   // DRiverManger.getConnection() 실패 시
            System.out.println("DB 접속 실패");
            e.printStackTrace();
        }
    }

    public void closeDB() {
        /* 데이터베이스 연결 해제 */
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
