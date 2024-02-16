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
        myDB.getAllUser();  // 직접 구현한 코드1 <-- 이거는 했고
        myDB.getOneUser();  // 직접 구현한 코드2
        myDB.closeDB();
    }
}
