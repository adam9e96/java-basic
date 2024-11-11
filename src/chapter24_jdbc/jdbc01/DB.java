package chapter24_jdbc.jdbc01;

import java.sql.*;

/**
 * DB 클래스 : 데이터베이스 연결과 자원을 관리하는 메인 클래스.
 * <p>
 * JDBC(Java Database Connectivity)는 자바 프로그래밍 언어에서 데이터베이스와 연결하고,
 * 데이터베이스에 쿼리를 실행하며, 결과를 처리할 수 있게 해주는 API입니다.
 * </p>
 *
 * @author adam9e96
 * @version 1.0
 * @since 2024-06-12
 */

public class DB {
    // 사용할 객체를 위한 참조변수 선언.
    // 클래스 내의 여러 메서드에서 사용해야 되서 인스턴스 변수로 선언.
    /**
     * DB와 자바 프로그램의 연결을 관리하는 Connection 객체.
     */
    Connection conn = null;

    /**
     * SQL 쿼리를 임시로 저장하고 실행하는 PreparedStatement 객체.
     */
    PreparedStatement preparedStatement = null;

    /**
     * SQL 쿼리의 결과를 저장하는 ResultSet 객체 (주로 SELECT 쿼리에서 사용).
     */
    ResultSet resultSet = null;

    // 데이터베이스 접속 정보 상수
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_HOST = "127.0.0.1";
    private static final String DB_PORT = "3306"; // 마리아 DB 포트
    private static final String DB_NAME = "sample_jdbc_01"; // 스키마 이름
    private static final String DB_URL = "jdbc:mariadb://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
    private static final String DB_USER = "root";
    private static final String DB_PASS = "3033";

    /**
     * JDBC 드라이버를 등록하고 데이터베이스와 연결을 설정하는 메서드.
     * <p>연결 성공 시 "DB 접속 성공" 메시지를 출력합니다.</p>
     */
    public void connectDB() {
        try {
            // JDBC 드라이버 등록
            Class.forName(DRIVER);    // JDBC 드라이버 등록
            // 데이터베이스 연결 설정
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            // 데이터베이스 연결이 성공적으로 이루어졌는지 확인
            if (conn != null) {
                System.out.println("DB 접속 성공");
            }
        } catch (ClassNotFoundException e) { // JDBC 드라이버를 찾을 수 없을 때 발생하는 예외 처리
            e.printStackTrace();
        } catch (SQLException e) {   // 데이터베이스 연결에 실패했을 때 발생하는 예외 처리
            System.out.println("DB 접속 실패");
            e.printStackTrace();
        }
    }

    /**
     * ResultSet, PreparedStatement, Connection 객체를 닫아 자원을 해제하고 데이터베이스 연결을 종료하는 메서드.
     * <p>모든 자원을 안전하게 해제하여 메모리 누수를 방지합니다.</p>
     */
    public void closeDB() {
        try {
            if (resultSet != null) {    // ResultSet이 열려 있는 경우 닫음
                resultSet.close();
            }
            if (preparedStatement != null) {  // PreparedStatement가 열려 있는 경우 닫음
                preparedStatement.close();
            }
            if (conn != null && !conn.isClosed()) {  // Connection이 열려 있는 경우 닫음
                conn.close();
                System.out.println("DB 접속 해제");
            }
        } catch (SQLException e) {  // 자원 해제 시 발생할 수 있는 SQLException을 처리
            e.printStackTrace();
        }
    }
}
