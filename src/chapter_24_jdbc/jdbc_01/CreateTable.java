package chapter_24_jdbc.jdbc_01;

public class CreateTable {
    public static void main(String[] args) {
        DBCreate myDB = new DBCreate(); // DBCreate 클래스에 DB를 상속해서 ConnectDB, closeDB 메소드 사용가능
        myDB.connectDB();   // DB 클래스에 있던거
        myDB.createTableUser(); // 이게 여기서 새로 생긴거
        myDB.closeDB(); // DB 클래스에 있던거
    }
}
