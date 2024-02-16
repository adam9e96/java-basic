package chapter25_jdbc;

import java.sql.SQLException;

/**
 * ===========================================================
 * fileName       : InsertUser
 * date           : 2024-02-14
 * description    :
 * ===========================================================
 */
public class InsertUser {
    public static void main(String[] args) throws SQLException {
        DBInsert myDB = new DBInsert();
        myDB.connectDB();// DB
        myDB.insertUser();  // 직접 구현한 코드
        myDB.closeDB(); // DB
    }
}
