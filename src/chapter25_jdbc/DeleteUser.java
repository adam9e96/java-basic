package chapter25_jdbc;

import java.sql.SQLException;

/**
 * ===========================================================
 * fileName       : DeleteUser
 * date           : 2024-02-16
 * description    :
 * ===========================================================
 */
public class DeleteUser {
    public static void main(String[] args) throws SQLException {
        DBDelete myDB = new DBDelete();
        myDB.connectDB();   // DB 꺼
        myDB.getAllUser();  // DBSelect 꺼
        myDB.deleteUser();  // DBDelete 클래스에서 직접 구현한 코드
        myDB.getAllUser(); // DBSelect 꺼
        myDB.closeDB(); //DB 꺼
    }
}
/*
DB 접속 성공
전체 회원 목록입니다.
~~~

=========
삭제 할 유저의 아이디를 입력하세요:
String
영향 받은 데이터 : 1
데이터 삭제에 성공했습니다.
전체 회원 목록입니다.
resultSet.getRow() : 13
 */

// 결과1.
// 문자열 대소문자 관계없이 삭제가 되고 있음.
// >>> 애초에 SQL에서 소문자로만 저장하기 때문에 대소문자 상관이 없음
