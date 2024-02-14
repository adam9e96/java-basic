package chapter25_jdbc;

/**
 * ===========================================================
 * fileName       : ConnectDB
 * date           : 2024-02-14
 * description    :
 * ===========================================================
 */
public class ConnectDB {
    // Connection 객체를 생성해 DataBase 연결하기
    public static void main(String[] args) {
        DB myDB = new DB();
        myDB.connectDB();
        myDB.closeDB();
    }
}
