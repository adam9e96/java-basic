package chapter25_jdbc;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : DBDelete
 * date           : 2024-02-16
 * description    :
 * ===========================================================
 */
public class DBDelete extends DBSelect {
    public void deleteUser() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("삭제 할 유저의 아이디를 입력하세요: ");
        String userID = scanner.nextLine();

        String deleteSQL = "DELETE FROM tUser WHERE userID='" + userID + "' ";

//        preparedStatement = conn.prepareStatement(deleteSQL);   // 쿼리 실행 준비
//        int cnt = preparedStatement.executeUpdate(); // 영향을 받은 데이터 갯수 반환

        Statement statement = conn.createStatement();
        int cnt = statement.executeUpdate(deleteSQL);

        /*
        statement 의 차이점.
        `statement`는 실행할때 ?가 없는 완벽한 쿼리문을 넘겨줘야 함 > 디버깅 하기에는 좋음.
        뭐 삭제할지 명확해서 좋지만
        `preparedStatement`를 주로씀
         */

        // pstmt.executeQuery()  : select
        // pstmt.executeUpdate() : insert, update, delete ...   : 반환형이 int.
        // CREATE / DROP 관련 문구에서는 -1 반환

        if (cnt == 1) {
            System.out.println("영향 받은 데이터 : " + cnt);
            System.out.println("데이터 삭제에 성공했습니다.");
        } else {
            System.out.println("데이터 삭제에 실패했습니다.");
        }
        scanner.close();
    }
}
