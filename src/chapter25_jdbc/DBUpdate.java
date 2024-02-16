package chapter25_jdbc;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : DBUpdate
 * date           : 2024-02-16
 * description    :
 * ===========================================================
 */
public class DBUpdate extends DBSelect { // `DBSelect`는 DB를 상속 받아서 `DB`클래스의  기능도 사용가능. getAllUser 메소드도 사용가능
    private User modifyUser() throws SQLException {
        /* 콘솔로 수정할 사용자 정보를 입력 받아서 반환 */
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        boolean validate = false;
        String validateTemp;    // do-while


        do {
            System.out.println("정보 수정 할 회원의 아이디를 입력하세요: ");
            user.userID = scanner.nextLine();

            if (!isDupUserID(user.userID)){ // 반대로 중복겂사 아니라 없냐 검사
                System.out.println(user.userID+ " 는 없는 아이디 입니다. 다시 입력해주세요.");
                validate = true;
                continue;
            }
            // 중복이 있으면 아래꺼 실행. 값이 있어야 update를 할 수 있어서
            System.out.println("회원의 이름을 입력하세요: ");
            user.name = scanner.nextLine();
            System.out.println("회원의 나이를 입력하세요: ");
            user.age = Integer.parseInt(scanner.nextLine());
//            user.age = scanner.nextInt();
            System.out.println("회원의 직업을 입력하세요: ");
            user.job = scanner.nextLine();

            System.out.println("수정 된 회원 : " + user.userID + " / " + user.name + " / " + user.age + " / " + user.job
                    + "이 맞습니까? (y/n)");
            validateTemp = scanner.nextLine();

            // 입력 값이 y가 아닌 경우 true, 같은 경우 false 반환
            validate = !validateTemp.equals("y");
        } while (validate);// y를 입력하면 false

        scanner.close();
        return user;   // 수정될 사용자 정보를 돌려줌
    }

    public User updateUser() throws SQLException {
        User user = modifyUser();
        String updateSQL = "UPDATE tUser SET name = ?, age = ?, job = ? WHERE userID = ? ";

        preparedStatement = conn.prepareStatement(updateSQL); // 쿼리 실행 준비
        // ? 자리에 순서대로 데이터 입력
        preparedStatement.setString(1, user.name);
        preparedStatement.setInt(2, user.age);
        preparedStatement.setString(3, user.job);
        preparedStatement.setString(4, user.userID);
        int cnt = preparedStatement.executeUpdate(); // 영향을 받은 데이터 갯수 반환 // Update()메소드니까 반환값 int
        // pstmt.executeQuery() : select , create, show < "ResultSet"
        // pstmt.executeUpdate() : insert, update, delete .. < int row or cnt

        if (cnt == 1) {
            System.out.println("영향 받은 데이터 : " + cnt);
            System.out.println("데이터 수정에 성공했습니다.");
        } else {    // SQL 문법 에러 아마도.
            System.out.println("데이터 수정에 실패했습니다.");
        }

        return user;
    }
    private boolean isDupUserID(String userID) throws SQLException {
        /* 중복이 되면 true 반환 */ // count니까 변화된행이 1아니면 0이 나와요
        String sql = "SELECT COUNT(*) FROM tUser WHERE userID = ?";  // 문자열로 된 쿼리문   // 매개변수화된 쿼리문 으로 안하면 어떻게 됨?
        preparedStatement = conn.prepareStatement(sql); // 쿼리 실행 준비
        // ?에 들어갈 값을 지정해주는데, ? 는 순서에 따라 1번부터 번호가 부여.
        preparedStatement.setString(1, userID); // ? 자리에 userID값을 넣음
        // SELECT COUNT(*) FROM tUser WHERE userID ='fpkm3033';
        resultSet = preparedStatement.executeQuery();   // 쿼리는 int cnt/row랑 다른거
        /*
        테이블 값을 반환됨
        ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
          |   `COUNT(*)`   | <-- 기본 커서 위치
        1 |   1 or 0       | <-- next() 메소드 최초 실행시 . 결과값은 true
        ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
         */

        resultSet.next();   // boolean next() -> 다음 행이 있을 경우 true, 없을 경우 false 이걸 안하고 getInt/getString 메소드 실행시 에러뜸 // 커서가 아무것도 가르키지 않고 있기 때문.
        System.out.println(resultSet.getInt(1));// 테스트 코드
        return resultSet.getInt(1) == 1; // 나올 수 있는 수가 0 아니면 1임. // getInt(1) 는 해당 컬럼의 1번째 해당 값을 불러옴.
                                    // 중복이면 1이니까 == 1 조건식 으로 결과는 true
    }
}
