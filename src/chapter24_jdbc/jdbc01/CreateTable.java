package chapter24_jdbc.jdbc01;

/**
 * CreateTable 클래스는 데이터베이스에 테이블을 생성하는 예제를 보여줍니다.
 * <p>
 * 이 클래스는 DBCreate 클래스를 사용하여 데이터베이스에 연결하고,
 * 새로운 테이블을 생성한 후, 데이터베이스 연결을 종료하는 작업을 수행합니다.
 * </p>
 *
 * @author adam9e96
 * @version 1.0
 * @since 2024-06-12
 */
public class CreateTable {

    /**
     * 프로그램의 시작점으로, 데이터베이스에 테이블을 생성하는 작업을 수행합니다.
     * <p>
     * DBCreate 클래스는 DB 클래스를 상속받아, `connectDB`, `closeDB` 메소드를 사용하며,
     * `createTableUser` 메소드를 통해 새로운 테이블을 생성합니다.
     * </p>
     *
     * @param args 커맨드 라인 인수 (사용되지 않음)
     */
    public static void main(String[] args) {
        // DBCreate 클래스의 인스턴스를 생성
        DBCreate myDB = new DBCreate(); // DBCreate 클래스에 DB를 상속해서 ConnectDB, closeDB 메소드 사용 가능

        // 데이터베이스에 연결
        myDB.connectDB();   // DB 클래스의 connectDB 메소드 호출

        // 새로운 테이블을 생성
        myDB.createTableUser(); // DBCreate 클래스에 새롭게 추가된 createTableUser 메소드 호출

        // 데이터베이스 연결 해제
        myDB.closeDB(); // DB 클래스의 closeDB 메소드 호출
    }
}
