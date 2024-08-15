package chapter_24_jdbc;

import chapter_24_jdbc.jdbc_01.DBInsert;

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
