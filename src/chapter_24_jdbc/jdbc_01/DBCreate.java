package chapter_24_jdbc.jdbc_01;

/**
 * DBCreate 클래스는 JDBC를 사용하여 데이터베이스에 특정 테이블을 생성하는 역할을 합니다.
 * 이 클래스는 DB 클래스를 상속받아 데이터베이스 연결 속성을 상속받습니다.
 */
public class DBCreate extends DB {

    // 예상되는 테이블 스키마
    /*
    CREATE TABLE tuser (
        UserID VARCHAR(100) PRIMARY KEY,
        name VARCHAR(100),
        age INT,
        job VARCHAR(100)
    );
     */

    // 실제 테이블 DDL
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
     * 미리 정의된 스키마로 tuser 테이블을 생성합니다.
     * 테이블이 이미 존재하면 다시 생성하지 않습니다.
     */
    public void createTableUser() {
        String tableName = "tuser";
        String sql = "CREATE TABLE " + tableName + " (UserID VARCHAR(100) PRIMARY KEY, "
                + "name VARCHAR(100), age INT, job VARCHAR(100)) ";
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

        // SQL 구문을 확인하기 위한 테스트 코드
        System.out.println(sql); // 디버깅을 위해 SQL 쿼리를 출력

        try {
            // 모든 테이블을 보여주는 SQL 쿼리
            String tableSql = "SHOW TABLES";
            boolean isTable = false;    // 테이블이 이미 존재하는지 확인하는 플래그

            // 아래 두 항목은 부모 클래스에서 정의
            // SQL 문을 전송할 수 있는 PreparedStatement 객체를 생성
            preparedStatement = conn.prepareStatement(tableSql);    // 쿼리 실행 준비
            resultSet = preparedStatement.executeQuery();   // 쿼리 실행 후 결과 받음    // show 나 select 같은건 Query

            // 테이블에 대한 정보는 resultSet 에 저장되어있다. 이제 중복 검사필요

            // 중복검사는 while로 하는게 편하고 또 다른 방법이 하나 있었던거 같은데
            System.out.println("SHOW TABLES 쿼리 후 결과 집합: " + resultSet); // 디버깅 라인
            while (resultSet.next()) {                      // getString 은 1번부터 시작함.
                System.out.println(tableName.equals(resultSet.getString(1)));
                if (tableName.equals(resultSet.getString(1))) {  // 동일한 테이블이 있는 경우
                    isTable = true; // 플래그를 true로 설정
                    break;
                }
            }

            if (isTable) {   // 테이블이 이미 존재하는 경우
                System.out.println(tableName + " 테이블이 이미 존재합니다.");
            } else {    // 테이블이 존재하지 않는 경우 생성
                preparedStatement = conn.prepareStatement(sql); // 테이블 생성 쿼리 준비
                resultSet = preparedStatement.executeQuery(); // 쿼리 실행

                // 테이블 생성이 성공했는지 확인
                if (resultSet != null) {
                    System.out.println(tableName + " 테이블 생성에 성공했습니다.");
                } else {
                    System.out.println(tableName + " 테이블 생성에 실패했습니다.");
                }
            }
        } catch (Exception e) {
            // 데이터베이스 연결 오류 처리
            System.out.println("데이터베이스 연결 오류: " + e);
        }
    }
}