package chapter25_jdbc;

/**
 * ===========================================================
 * fileName       : CreateTable
 * date           : 2024-02-14
 * description    :
 * ===========================================================
 */
public class CreateTable {
    public static void main(String[] args) {
        DBCreate myDB = new DBCreate(); // DBCreate 클래스에 DB를 상속해서 ConnectDB, closeDB 메소드 사용가능
        myDB.connectDB();
        myDB.createTableUser();
        myDB.closeDB();
    }
}
