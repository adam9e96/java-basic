package chapter24_jdbc.jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * ===========================================================
 * File Name       : LoadDriverAndConnect
 * Date           : 2024-02-14
 * Description    : JDBC 드라이버를 로드한 후 데이터베이스에 연결하고,
 * SQL SELECT 문을 실행하여 결과를 출력하는 예시입니다.
 * ===========================================================
 */

public class LoadDriver02AndConnect {

    /**
     * JDBC 드라이버를 로드하는 메서드입니다.
     */
    public static void loadDriver() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Driver Load Success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 데이터베이스에 연결하고 SELECT 문을 실행하여 결과를 출력하는 메서드입니다.
     */
    public static void connectAndQuery() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 데이터베이스 연결 설정 (URL, 사용자 이름, 비밀번호)
            String url = "jdbc:mariadb://localhost:3306/sample_jdbc_01";
            String user = "root";
            String password = "3033";

            // 데이터베이스 연결
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected!");

            // Statement 객체 생성
            stmt = conn.createStatement();

            // SQL SELECT 문 실행
            String sql = "SELECT age, name FROM sample_jdbc_01.tuser";
            rs = stmt.executeQuery(sql);

            // 결과 출력
            while (rs.next()) {
                int age = rs.getInt("age");
                String name = rs.getString("name");
                System.out.println("ID: " + age + ", Name: " + name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 리소스 해제 (역순으로 해제)
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 프로그램의 메인 메서드입니다.
     * `loadDriver()` 메소드를 호출하여 JDBC 드라이버를 로드하고,
     * `connectAndQuery()` 메소드를 호출하여 데이터베이스와 연결 후 쿼리를 실행합니다.
     */
    public static void main(String[] args) {
        loadDriver();
        connectAndQuery();
    }
}
