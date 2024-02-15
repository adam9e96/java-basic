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
        myDB.connectDB();
        myDB.insertUser();
        myDB.closeDB();
    }
}
