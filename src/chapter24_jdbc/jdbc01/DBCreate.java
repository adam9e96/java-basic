package chapter24_jdbc.jdbc01;

/**
 * DBCreate 클래스는 JDBC를 사용하여 데이터베이스에 특정 테이블을 생성하는 역할을 합니다.
 * 이 클래스는 DB 클래스를 상속받아 데이터베이스 연결 속성을 상속받습니다.
 * <p>
 * 이 클래스는 `tuser` 테이블을 생성하는 기능을 제공합니다.
 * </p>
 *
 * @author adam9e96
 * @version 1.0
 * @since 2024-06-12
 */
public class DBCreate extends DB {

    // 예상되는 테이블 스키마를 설명한 주석
    /*
    CREATE TABLE tuser (
        UserID VARCHAR(100) PRIMARY KEY,
        name VARCHAR(100),
        age INT,
        job VARCHAR(100)
    );
     */

    // 실제로 사용할 테이블 DDL(Data Definition Language) 쿼리를 설명한 주석
    /*
    create table tuser
    (
        UserID varchar(100) not null primary key,
        name varchar(100) null,
        age int null,
        job varchar(100) null
    );
     */


    /**
     * 미리 정의된 스키마로 `tuser` 테이블을 생성합니다.
     * <p>테이블이 이미 존재하면 다시 생성하지 않습니다.</p>
     */
    public void createTableUser() {
        // 생성할 테이블의 이름과 SQL 쿼리를 정의
        String tableName = "tuser";
        String sql = "CREATE TABLE " + tableName + " (UserID VARCHAR(100) PRIMARY KEY, "
                + "name VARCHAR(100), age INT, job VARCHAR(100)) ";

        // `createTable` 메서드를 호출하여 테이블 생성 시도
        createTable(tableName, sql);
    }


    /**
     * 데이터베이스에 테이블을 생성하는 메서드.
     *
     * @param tableName 생성할 테이블의 이름
     * @param sql       테이블을 생성하기 위한 SQL 쿼리
     * @apiNote 이 메서드는 다음 단계를 수행합니다: <br>
     * 1. `tableName` 이름의 테이블이 이미 존재하는지 확인합니다. <br>
     * 2. 테이블이 존재하지 않으면 제공된 SQL 쿼리를 사용하여 테이블을 생성합니다.
     */
    private void createTable(String tableName, String sql) {

        // SQL 구문을 확인하기 위한 디버깅 코드
        System.out.println(sql); // 실행할 SQL 쿼리를 출력

        try {
            // 모든 테이블을 보여주는 SQL 쿼리
            String tableSql = "SHOW TABLES";
            boolean isTable = false;    // 테이블이 이미 존재하는지 확인하는 플래그

            // SQL 문을 실행할 PreparedStatement 객체를 생성
            preparedStatement = conn.prepareStatement(tableSql);    // `SHOW TABLES` 쿼리 실행 준비
            resultSet = preparedStatement.executeQuery();   // 쿼리를 실행하고 결과를 ResultSet에 저장

            // 결과 집합에서 테이블 중복 여부를 확인
            System.out.println("SHOW TABLES 쿼리 후 결과 집합: " + resultSet); // 결과 확인을 위한 디버깅 라인
            while (resultSet.next()) {   // resultSet은 1번 인덱스부터 시작
                System.out.println(tableName.equals(resultSet.getString(1)));
                if (tableName.equals(resultSet.getString(1))) {  // 동일한 이름의 테이블이 있는 경우
                    isTable = true; // 테이블이 존재한다는 플래그 설정
                    break; // 중복이 확인되면 반복문 종료
                }
            }

            if (isTable) {   // 테이블이 이미 존재하는 경우
                System.out.println(tableName + " 테이블이 이미 존재합니다.");
            } else {    // 테이블이 존재하지 않는 경우
                // 테이블 생성 쿼리를 실행할 PreparedStatement 객체를 준비
                preparedStatement = conn.prepareStatement(sql); // 테이블 생성 쿼리 준비
                resultSet = preparedStatement.executeQuery(); // 쿼리 실행

                // 테이블 생성 결과를 확인
                if (resultSet != null) {
                    System.out.println(tableName + " 테이블 생성에 성공했습니다.");
                } else {
                    System.out.println(tableName + " 테이블 생성에 실패했습니다.");
                }
            }
        } catch (Exception e) {
            // 데이터베이스 연결 및 쿼리 실행 중 발생할 수 있는 예외 처리
            System.out.println("데이터베이스 연결 오류: " + e);
        }
    }
}
