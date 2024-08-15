package chapter_24_jdbc.jdbc_01;

import java.sql.*;

/**
 * DB 클래스 : 데이터베이스 연결과 자원을 관리하는 메인 클래스
 * <p>
 * JDBC(Java Database Connectivity)는 자바 프로그래밍 언어에서 데이터베이스와 연결하고,
 * 데이터베이스에 쿼리를 실행하며, 결과를 처리할 수 있게 해주는 API
 *
 * @since 2024-06-12
 */

public class DB {
    // 사용할 객체를 위한 참조변수 선언.
    // 클래스 내의 여러 메서드에서 사용해야 되서 인스턴스 변수로 선언.
    Connection conn = null; // DB와 자바프로그램의 연결을 관리
    PreparedStatement preparedStatement = null; // SQL 쿼리를 임시로 저장하고 실행한다.
    ResultSet resultSet = null; // SQL 쿼리의 결과를 저장한다 ( 주로 select 에 주로 사용)

    // 데이터베이스 접속 정보 상수
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_HOST = "127.0.0.1";
    private static final String DB_PORT = "3306"; // 마리아 db 포트
    private static final String DB_NAME = "sample_jdbc_01"; // 스키마 이름
    private static final String DB_URL = "jdbc:mariadb://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
    private static final String DB_USER = "root";
    private static final String DB_PASS = "3033";

    /**
     * JDBC 드라이버를 등록하는 메서드.
     * 데이터베이스 연결을 설정한다.
     * 연결 성공 시 메시지를 출력한다.
     */
    public void connectDB() {
        /* 데이터 베이스 연결 */
        // URL 양식 동일함 e.g) http://naver.com:443/
        // jdbc:mariadb://127.0.0.1:3306/

        // 디비 접속
        try {
            // JDBC Driver 등록(JDBC 드라이버 로드)
            Class.forName(DRIVER);    // JDBC 드라이버 등록. point1
            // 데이터베이스 연결하기
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);   // 디비 연결    // point2
            //  DriverManager.getConnection : 데이터베이스 연결을 설정
            if (conn != null) { // null 이 아니라면. 객체가 저장되어 있다면
                System.out.println("DB 접속 성공"); // 연결 성공
            }
//            System.out.println("conn 객체 주소: "+conn); // 테스트 코드
        } catch (ClassNotFoundException e) { // JDBC 드라이버 등록실패 시 point1 예외
            e.printStackTrace();
        } catch (SQLException e) {   // DRiverManger.getConnection() 실패 시 // point2 예외
            System.out.println("DB 접속 실패");
            e.printStackTrace();
        }

    }

    /**
     * resultSet, preparedStatement, conn을 닫아 자원을 해제하고 연결을 종료
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
