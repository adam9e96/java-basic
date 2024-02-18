package chapter25_jdbc;

import java.sql.Connection;

/**
 * ===========================================================
 * fileName       : LoadDriver01
 * date           : 2024-02-14
 * description    : DB 연결 1단계
 * - JDBC 를 이용하는 프로그램 작성 과정.
 * 1. 사용하고자 하는 RDBMS 에서 제공하는 JDBC 드라이버를 설치. // 저희가 jar 폴더에 로드에서 설치를 해서 완료됨.
 * 2. JDBC 드라이버를 로딩. (메모리로 로딩하는 것임) // 끝.
 * 드라이버를 로딩할 때는 클래스의 동적 바인딩을 제공하는 Class 클래스의 메서드인 forName() 메서드를 사용. todo 동적 바인딩? <-- 저도 모름.
 * 3. DBMS 와 연결을 설정.
 * java.sql 패키지가 제공하는 Connection 객체를 사용.
 * 4. SQL 을 실행.
 * select 구문을 실행할 때에는 java.sql 패키지가 제공하는 Statement 객체와 ResultSet 객체를 사용.
 * Statement 객체는 SQL 구문을 위한 것이고 ResultSet 는 select 구문을 실행한 결과를 다루기 위한 객체.
 * 위 방법 대로만 알면 select, insert, 등등 다 응용이 가능해요 .
 * ===========================================================
 */

// 아래의 과정은 2번임.
    //  Java에서 JDBC(Java Database Connectivity) 드라이버를 로드하는 과정
public class LoadDriver01 { // JDBC 드라이버를 로드하는 메인 클래스
    // 드라이버 클래스를 로드
    public static void loadDriver() {   // JDBC 드라이버를 로드하기 위한 메소드
        try {   // Class의 static forName 메소드를 사용    // Class.forName() 메소드를 사용하여 문자열로 지정된 클래스를 JVM 메모리에 로드 -> 로드가 되면 드라이버 클래스는 초기화되며, JDBC 드라이버가 `DriverManager`에 자동으로 등록됨
            Class.forName("org.mariadb.jdbc.Driver"); // org.mariadb.jdbc.Driver 클래스를 메모리에 로딩   // Point1
            System.out.println("Driver Load Success!"); // 로드를 성공하면 실행될 코드
        } catch (ClassNotFoundException e) { // 만약 JDBC Driver 클래스를 찾을 수 없다면 `ClassNotFoundException`이 발생하므로 예외 처리를 해야 한다.
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {    /// 메인 메소드
        loadDriver();
    }
}
// 위 과정이 성공하면((DriverManager에 JDBC Driver)가 등록되면 ) getConnection() 메소드로 DB와 연결을 할 수 있다.