package chapter25_jdbc;

import java.sql.SQLException;

/**
 * ===========================================================
 * fileName       : SelectUser
 * date           : 2024-02-15
 * description    :
 * ===========================================================
 */
public class SelectUser {
    public static void main(String[] args) throws SQLException {
        DBSelect myDB = new DBSelect();
        myDB.connectDB();
        myDB.getAllUser();
//        myDB.getOneUser();
        myDB.closeDB();
    }
}
