package chapter25_jdbc_2;


public class ConnectDB {
    // Connection 객체를 생성해 DataBase 연결하기
    public static void main(String[] args) {
        DB myDB = new DB(); // DB 인스턴스 생성
        myDB.connectDB();
        myDB.closeDB();
    }
}
