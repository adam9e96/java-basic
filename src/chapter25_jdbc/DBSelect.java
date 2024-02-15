package chapter25_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : DBSelect
 * date           : 2024-02-15
 * description    :
 * ===========================================================
 */
public class DBSelect extends DB {
    Scanner scanner = new Scanner(System.in);

    public void getAllUser() throws SQLException {
        /* 전체출력 */
        System.out.println("전체 회원 목록입니다.");
        String sql = "SELECT * FROM tUser ";
        printUser(sql);
        System.out.println("=========");
    }

    private void printUser(String sql) throws SQLException {
        /* select 실행 결과를 받아서 콘솔에 출력.
        전체 목록 출력과 한 열만 출력하는 기능
         */
        int totalRow;
        int num = 1;
        ResultSet resultSet = querySelect(sql);

        // ResultSet 의 개수를 구해서 1일 경우와 1이 아닐 경우를 분리.
        // ResultSet 의 개수를 구하는 메서드는 없어서 다른 방법으로 개수를 구함.
        resultSet.last();   // 마지막 row 로 이동.
        totalRow = resultSet.getRow(); // row count 를 추출.
        resultSet.beforeFirst();    // 처음 row 로 커서를 이동.(초기 상태로 돌려 놓음)
        if (totalRow == 1) {
            // 데이터가 하나
            if (resultSet.next()) {
                System.out.println("아이디 : " + resultSet.getString(1));
                System.out.println("이름 : " + resultSet.getString(2));
                System.out.println("나이 : " + resultSet.getString(3));
                System.out.println("직업 : " + resultSet.getString(4));
                System.out.println();
            }
        } else if (totalRow > 1) {
            // 전체 목록 출력
            // 데이터의 처음부터 읽어 오므로 next를 만나면 한 줄로 읽어오고, 다음 줄로 커서가 이동.
            // 한줄 한줄 내려가면서 데이터를 가져오고, 데이터가 끝까지 가면 종료.
            while (resultSet.next()) {
                System.out.println(num + "번째 회원");
                System.out.println("아이디 : " + resultSet.getString("userID"));
                System.out.println("이름 : " + resultSet.getString("name"));
                System.out.println("나이 : " + resultSet.getString("age"));
                System.out.println("직업 : " + resultSet.getString("job"));
                System.out.println();
                num++;
            }
        } else {    // 1보다 작은 경우.
            System.out.println("입력하신 아이디의 데이터는 존재하지 않습니다.");
        }
    }


    // 추가된 코드   // 자식 객체에서도 사용이 필요해서 protected
    protected ResultSet querySelect(String sql) {
        /*
        select 실행 후 결과 반환
        이후 update 와 delete 관련 클래스에서 사용하기 위해 protected 사용 */
        try {
            preparedStatement = conn.prepareStatement(sql); // 쿼리 실행 준비

            // INSERT, UPDATE, DELETE 일 경우에는 executeUpdate() 메소드를 호출하지만,
            // 데이터를 가져오는 SELECT 문일 경우에는 executeQuery () 메소드를 호출.
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("error: " + e);
        }
        // ResultSet 은 SELECT 문에 기술된 컬럼으로 구서오딘 행 row 의 집합
        return resultSet;
    }
}
