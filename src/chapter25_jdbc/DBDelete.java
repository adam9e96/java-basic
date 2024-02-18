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
public class DBDelete extends DBSelect {    // DBSelect가 DB를 상속받고 있어서  N차 상속이에요.
    public void deleteUser() throws SQLException {
        Scanner scanner = new Scanner(System.in);   // 값을 이미 정해두고 삭제하지 말고 콘솔로
        // 값을 입력 받고 삭제할려고 Scanner 객체를 사용

        System.out.println("삭제 할 유저의 아이디를 입력하세요: ");
        String userID = scanner.nextLine();

        String deleteSQL = "DELETE FROM tUser WHERE userID='" + userID + "' ";

        preparedStatement = conn.prepareStatement(deleteSQL);   // 쿼리 실행 준비
        preparedStatement.setString(1, userID);
        int cnt = preparedStatement.executeUpdate(); // 영향을 받은 데이터 갯수 반환
        System.out.println(deleteSQL);
//        Statement statement = conn.createStatement();
//        int cnt = statement.executeUpdate(deleteSQL);// 값을 실행할때 넘겨줘요 쿼리문을 statement 객체는
        // 삭제 성공하면 1  /실패하면 0

        /*
        statement 의 차이점.
        `statement`는 실행할때 ?가 없는 완벽한 쿼리문을 넘겨줘야 함 > 디버깅 하기에는 좋음.
        뭐 삭제할지 명확해서 좋지만
        `preparedStatement`를 주로씀 <-- 근데 이게 성능이나 안전성? 면에서 더 좋아서 이걸 주로 써요.
        "이유는 몰라요."
         */

        // pstmt.executeQuery()  : select   -> resultSet에 테이블 값을 넘겨줌
        // pstmt.executeUpdate() : insert, update, delete ...   : 반환형이 int. int row
        // CREATE / DROP 관련 문구에서는 -1 반환

        if (cnt == 1) {
            System.out.println("영향 받은 데이터 : " + cnt);   // 테스트 코드
            System.out.println("데이터 삭제에 성공했습니다.");
        } else {    // 1이 아닌경우(==0)
            System.out.println("데이터 삭제에 실패했습니다.");
        }
        scanner.close();
    }
}
