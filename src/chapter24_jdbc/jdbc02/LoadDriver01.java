package chapter24_jdbc.jdbc02;

/**
 * ===========================================================
 * File Name       : LoadDriver01
 * Date           : 2024-02-14
 * Description    : JDBC를 이용한 DB 연결 1단계
 * <p>
 * 이 클래스는 Java에서 JDBC를 사용하여 데이터베이스에 연결하는 과정 중 첫 번째 단계인
 * JDBC 드라이버를 로드하는 과정을 설명합니다.
 * <p>
 * 1. 사용하고자 하는 RDBMS에서 제공하는 JDBC 드라이버 설치
 * - 드라이버는 RDBMS에서 제공하며, 이 프로젝트에서는 해당 드라이버를 JAR 파일로 로드하여 사용합니다.
 * <p>
 * 2. JDBC 드라이버 로딩
 * - 드라이버를 메모리에 로드하는 단계로, Java의 `Class.forName()` 메소드를 이용하여
 * 드라이버 클래스를 동적으로 로드합니다.
 * - `Class.forName()`은 지정된 클래스 이름을 인수로 받아 클래스 로더를 통해 해당 클래스를
 * 메모리에 로드하며, 이 과정에서 드라이버는 자동으로 `DriverManager`에 등록됩니다.
 * <p>
 * 3. DBMS와의 연결 설정
 * - 로드된 드라이버를 통해 `java.sql.Connection` 객체를 사용하여 데이터베이스와의 연결을 설정할 수 있습니다.
 * <p>
 * 4. SQL 실행
 * - SQL 구문을 실행하기 위해 `java.sql.Statement` 객체를 사용하며,
 * select 구문 결과 처리를 위해 `java.sql.ResultSet` 객체를 사용합니다.
 * <p>
 * ===========================================================
 */

public class LoadDriver01 {

    /**
     * JDBC 드라이버를 로드하는 메서드입니다.
     * `Class.forName()` 메소드를 사용하여 드라이버 클래스를 메모리에 로드합니다.
     * <p>
     * 드라이버 로드가 성공하면 "Driver Load Success!" 메시지를 출력합니다.
     * 만약 드라이버 클래스를 찾지 못하면 `ClassNotFoundException`이 발생하며, 이를 처리합니다.
     */
    public static void loadDriver() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Driver Load Success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 프로그램의 메인 메서드입니다.
     * `loadDriver()` 메소드를 호출하여 JDBC 드라이버를 로드합니다.
     */
    public static void main(String[] args) {
        loadDriver();
    }
}
