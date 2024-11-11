package chapter24_jdbc.jdbc01;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * DBDelete 클래스는 데이터베이스에서 특정 사용자를 삭제하는 기능을 제공합니다.
 * <p>
 * 이 클래스는 DBSelect 클래스를 상속받아 데이터베이스 연결과 관련된 기능을 상속받습니다.
 * `deleteUser` 메서드를 통해 사용자의 ID를 입력받아 해당 사용자를 삭제할 수 있습니다.
 * </p>
 *
 * @author adam9e96
 * @version 1.0
 * @since 2024-02-16
 */
public class DBDelete extends DBSelect {    // DBSelect가 DB를 상속받고 있어서 다중 상속이 적용된 클래스입니다.

    /**
     * 사용자의 ID를 입력받아 해당 사용자를 데이터베이스에서 삭제하는 메서드.
     * <p>
     * 이 메서드는 콘솔을 통해 삭제할 사용자의 ID를 입력받은 후, 해당 ID를 가진 사용자를 데이터베이스에서 삭제합니다.
     * </p>
     *
     * @throws SQLException 데이터베이스 작업 중 발생할 수 있는 SQL 예외
     */
    public void deleteUser() throws SQLException {
        Scanner scanner = new Scanner(System.in);   // 콘솔에서 값을 입력받기 위해 Scanner 객체를 사용

        System.out.println("삭제할 유저의 아이디를 입력하세요: ");
        String userID = scanner.nextLine(); // 사용자로부터 삭제할 유저 ID를 입력받음

        // 사용자의 ID를 기반으로 DELETE SQL 쿼리 생성
        String deleteSQL = "DELETE FROM tUser WHERE userID='" + userID + "' ";

        // DELETE 쿼리 실행 준비
        preparedStatement = conn.prepareStatement(deleteSQL);
        preparedStatement.setString(1, userID); // 사용자 ID를 쿼리에 바인딩
        int cnt = preparedStatement.executeUpdate(); // DELETE 쿼리를 실행하고, 영향을 받은 행의 수를 반환

        // 디버깅을 위한 SQL 출력
        System.out.println(deleteSQL);

        /*
        `statement`와 `preparedStatement`의 차이점:
        - `statement`는 실행할 때 완전한 SQL 쿼리문을 필요로 합니다. 디버깅하기에는 편리하지만,
        - `preparedStatement`는 성능과 보안 측면에서 더 우수하기 때문에 주로 사용됩니다.
         */

        // 삭제 결과에 따른 처리
        if (cnt == 1) {
            System.out.println("영향 받은 데이터: " + cnt);   // 삭제된 행의 수 출력
            System.out.println("데이터 삭제에 성공했습니다.");
        } else {    // 삭제된 행이 없는 경우
            System.out.println("데이터 삭제에 실패했습니다.");
        }
        scanner.close(); // Scanner 자원 해제
    }
}
