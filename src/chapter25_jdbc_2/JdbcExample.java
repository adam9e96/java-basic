package chapter25_jdbc_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 * JdbcExample 클래스는 MariaDB 데이터베이스와 연결하여 SQL 쿼리를 실행하고 결과를 처리하는 예제
 * 트랜잭션을 이용하여 조회
 */
public class JdbcExample {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample_java2";
        String user = "root";
        String password = "3033";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // JDBC 드라이버 로드
            Class.forName("org.mariadb.jdbc.Driver");

            // 데이터베이스 연결
            connection = DriverManager.getConnection(url, user, password);

            // SQL 쿼리 실행
            String sql = "SELECT * FROM employees WHERE id = ?"; // SQL 쿼리문 employees의 id 조회

            preparedStatement = connection.prepareStatement(sql);
            System.out.println("preparedStatement 값 : "+preparedStatement.toString());
            preparedStatement.setInt(1, 1);

            resultSet = preparedStatement.executeQuery();

            // 결과 처리
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 자원 해제
            try {
                if (resultSet != null) resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
