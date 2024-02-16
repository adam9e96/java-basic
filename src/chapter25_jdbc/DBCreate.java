package chapter25_jdbc;

/**
 * ===========================================================
 * fileName       : DBCreate
 * date           : 2024-02-14
 * description    :
 * ===========================================================
 */
// 매번 DB를 생성하기는 귀찮으니 상속을 이용한다.
public class DBCreate extends DB {
    // 생성할 테이블
    /*
    CREATE TABLE tuser (
    UserID VARCHAR(100) PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    job VARCHAR(100)
    );
     */
    public void createTableUser() {
        String tableName = "tuser3";
        String sql = "CREATE TABLE " + tableName + " (UserID VARCHAR(100) PRIMARY KEY, "
                + "name VARCHAR(100), age INT, job VARCHAR(100)) ";
        createTable(tableName, sql);
    }

    private void createTable(String tableName, String sql) {
        // 테이블을 생성하는 메서드.
        // 생성할 테이블 이름과 생성하는 sql 문을 매개 변수로 받음.
        // 1) 테이블이 존재하는 지 확인 후 2) 없으면 생성.

        // CREATE TABLE tuser3 (UserID VARCHAR(100) PRIMARY KEY, name VARCHAR(100), age INT, job VARCHAR(100))
        System.out.println(sql); // 테스트 코드 Syntax 오류가 뜨면 이거 보면 된다.
        try {
            // 테이블이 존재 하는지 확인
            String tableSql = "show tables";    // tables를 보여주는 쿼리문을 문자열로 작성
            boolean isTable = false;    // table 가 있는지 여부   // 디폴트가  false boolean isRun = false;

            // 아래 두 항목은 부모 클래스에서 정의
            // SQL 문을 전송할 수 있는 PreparedStatement 객체를 생성
            preparedStatement = conn.prepareStatement(tableSql);    // 쿼리 실행 준비
            resultSet = preparedStatement.executeQuery();   // 쿼리 실행 후 결과 받음    // show 나 select 같은건 Query
            // 테이블에 대한 정보는 resultSet에 담겼는데 이제 중복  검사 할 시간
            // 중복검사는 while로 하는게 편하고 또 다른 방법이 하나 있었던거 같은데
            while (resultSet.next()) {                      // getString 은 1번부터 시작함.
                System.out.println(tableName.equals(resultSet.getString(1)));
                if (tableName.equals(resultSet.getString(1))) {  // 동일한 테이블이 있는 경우
                    isTable = true;
                    break;
                }
            }
            if (isTable) {   // 테이블이 존재하는 경우
                System.out.println(tableName + "이란 이름의 테이블이 이미 존재합니다.");
            } else {    // 테이블이 없는 경우 생성한다. // isTalbe가 끝까지 false 인경우
                preparedStatement = conn.prepareStatement(sql); // 쿼리 실행 준비
                resultSet = preparedStatement.executeQuery(); // 쿼리 실행 후 결과 받음
//              System.out.println(resultSet); // org.mariadb.jdbc.client.result.CompleteREsult@3c5c5a99da <-- 제대로 들어가있으면
                if (resultSet != null) {
                    System.out.println(tableName + "테이블 생성에 성공했습니다.");
                } else {    // null 인경우
                    System.out.println(tableName + " 테이블 생성에 실패했습니다.");
                }
            }
        } catch (Exception e) {
            System.out.println("db connect err : " + e);
        }
    }
}
