package chapter25_jdbc;

import java.sql.SQLException;

/**
 * ===========================================================
 * fileName       : UpdateUser2nd
 * date           : 2024-02-16
 * description    :
 * ===========================================================
 */
public class UpdateUser2nd {
    public static void main(String[] args) throws SQLException {
        DBUpdate myDB = new DBUpdate();
        myDB.connectDB();   // DB 클래스에 선언된 메서드
        myDB.getAllUser();  // DBSelect 클래스에 선언된 메서드
        myDB.updateUser();
        myDB.getAllUser(); // DBSelect 클래스에 선언된 메서드
        myDB.closeDB(); // DB 클래스에 선언된 메서드
    }
}
        
