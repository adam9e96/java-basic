package chapter25_jdbc;

import java.sql.SQLException;

/**
 * ===========================================================
 * fileName       : UpdateUser
 * date           : 2024-02-16
 * description    :
 * ===========================================================
 */
public class UpdateUser {
    public static void main(String[] args) throws SQLException {
        DBUpdate myDB = new DBUpdate();
        myDB.connectDB();   // DB 클래스에 선언된 메서드
        myDB.getAllUser();  // DBSelect 클래스에 선언된 메서드

        myDB.updateUser();  // 순수하게 UpdateDB 클래스에서 작성한 메소드

        myDB.getAllUser();  // DBSelect 클래스에 선언된 메서드
        myDB.closeDB(); // DB 크랠스에 선언된 메서드
    }
}
