package chapter24_jdbc.jdbc01;

/**
 * 이 클래스는 데이터베이스에 연결하기 위한 간단한 예제를 제공합니다.
 * <p>
 * `DB` 클래스의 인스턴스를 생성하고, 데이터베이스에 연결한 후, 연결을 종료하는 기능을 수행합니다.
 * </p>
 *
 * <p>이 클래스는 JDBC를 사용한 기본적인 데이터베이스 연결 및 종료 작업을 설명하기 위한 것입니다.</p>
 *
 * @author      adam9e96
 * @version     1.0
 * @since       2024-02-14
 */
public class ConnectDB {

    /**
     * 메인 메서드로, 프로그램의 시작점입니다.
     * <p>
     * `DB` 클래스의 인스턴스를 생성하고, 데이터베이스에 연결한 후 연결을 종료합니다.
     * </p>
     *
     * @param args 커맨드 라인 인수 (사용되지 않음)
     */
    public static void main(String[] args) {
        DB myDB = new DB(); // DB 인스턴스 생성
        myDB.connectDB();    // 데이터베이스 연결
        myDB.closeDB();      // 데이터베이스 연결 종료
    }
}
