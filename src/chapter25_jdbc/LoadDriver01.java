package chapter25_jdbc;

/**
 * ===========================================================
 * fileName       : LoadDriver01
 * date           : 2024-02-14
 * description    :
 * - JDBC 를 이용하는 프로그램 작성 과정.
 * 1. 사용하고자 하는 RDBMS 에서 제공하는 JDBC 드라이버를 설치.
 * 2. JDBC 드라이버를 로딩.
 * 드라이버를 로딩할 때는 클래스의 동적 바인딩을 제공하는 Class 클래스의 메서드인 forName() 메서드를 사용.
 * 3. DBMS 와 연결을 설정.
 * java.sql 패키지가 제공하는 Connection 객체를 사용.
 * 4. SQL 을 실행.
 * select 구문을 실행할 때에는 java.sql 패키지가 제공하는 Statement 객체와 ResultSet 객체를 사용.
 * Statement 객체는 SQL 구문을 위한 것이고 ResultSet 는 select 구문을 실행한 결과를 다루기 위한 객체.
 * ===========================================================
 */

// 아래의 과정은 2번임.
public class LoadDriver01 { // JDBC 드라이버를 로드하는 메인 클래스
    // 드라이버 클래스를 로드
    public static void loadDriver() {   // JDBC 드라이버를 로드하기 위한 메소드
        try {   // Class의 static forName 메소드를 사용
            Class.forName("org.mariadb.jdbc.Driver"); // org.mariadb.jdbc.Driver 클래스를 메모리에 로딩
            System.out.println("Driver Load Success!"); // 로드를 성공하면 실행될 코드
        } catch (ClassNotFoundException e) { // 만약 클래스를 찾을 수 없다면 `ClassNotFoundException`이 발생하고 해당 예외가 처리
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        loadDriver();
    }
}
