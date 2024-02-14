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
        DBCreate myDB = new DBCreate();
        myDB.connectDB();
        myDB.createTableUser();
        myDB.closeDB();
    }
}
