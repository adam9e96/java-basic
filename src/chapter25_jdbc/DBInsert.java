package chapter25_jdbc;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : DBInsert
 * date           : 2024-02-14
 * description    :
 * ===========================================================
 */ // insert into 테이블명 (필드) values (값); 값넣을때
public class DBInsert extends DB {
    private User setUser() throws SQLException {    // setUser() 메서드의 반환형이 User
        // setUser 의 메소드는 콘솔로 입력받는 기능만 있다.
        /* 콘솔로 입력을 받음 */
        User user = new User();// new 키워드로 인스턴스 를 생성해서
        // User 클래스 객체가 heap 메모리에 올려져잇음 setUser 메소드를 실행하면
//        public String userID;
//        public String name;
//        public int age;
//        public String  job;
        Scanner scanner = new Scanner(System.in);

        boolean validate = false;
        String validateTemp;    // do while을 진행하기 위해 사용 isRun 같은 변수들
        do {
            System.out.println("신규 회원의 아이디를 입력하세요(영어나 숫자, 이전 데이터에서 사용한 값은 안됨): ");
            user.userID = scanner.nextLine();
            if (isDupUserID(user.userID)) { // isDupUserID => 중복이면 true
                System.out.println(user.userID + "는 중복되는 아이디 입니다.");
                validate = true;
                continue;
            }
            System.out.println("신규 회원의 이름을 입력하세요: ");
            user.name = scanner.nextLine();
            System.out.println("신규 회원의 나이를 입력하세요(숫자만): ");
            user.age = Integer.parseInt(scanner.nextLine());
            System.out.println("신규 회원의 직업을 입력하세요: ");
            user.job = scanner.nextLine();

            System.out.println("신규 회원 : " + user.userID + " / " + user.name
                    + " / " + user.age + " / " + user.job + "이 맞습니까? (y/n)");
            validateTemp = scanner.nextLine(); // 입력값 저장

            validate = !validateTemp.equals("y");   // 입력값이 y 가 아닌 경우 true, 같은 경우(y 입력시) false 반환
//            System.out.println(validate);

        } while (validate); // y 입력하면 false 로 결과값을 반환되어 반복문을 빠져나옴.
        scanner.close();    // 썼으니까 닫아주고
        return user; // 입력된 데이터를 던져줌
    }
//    public String userID;
//    public String name;
//    public int age;
//    public String  job == ㄹ;
    // 실제 실행되는 메소드
    public void insertUser() throws SQLException {
        /* setUser() 호출 후 정보를 받아서 디비에 입력 */
        User user = setUser();  // setUser 을 호출한 결과값을 user 변수에 넘겨줌  // SetUser 메소드를 실행하고 반환값을 User user 참조변수에 돌려줘요

        if (isDupUserID(user.userID)) {
            System.out.println(user.userID + "는 중복되는 아이디 입니다.");
            return;
        }
        // 매개변수화된 SQL 문 작성
        String insertSql = " INSERT INTO tUser (userID, name, age, job) VALUES (?,?,?,?) ";
        System.out.println(insertSql); // 테스트 코드
        System.out.println("user.userID 확인 : "+user.userID);    // 이것도 테스트 코드.

        // PreparedStatement 얻기 및 값 지정
//        preparedStatement = conn.prepareStatement(insertSql); // 쿼리 실행 준비
        preparedStatement = conn.prepareStatement(insertSql); // 쿼리 실행 준비
        // ? 에 들어갈 값을 지정 해주는데, ? 는 순서에 따라 1번 부터 번호가 부여.
        preparedStatement.setString(1, user.userID); // 3
        preparedStatement.setString(2, user.name);
        preparedStatement.setInt(3, user.age);
        preparedStatement.setString(4, user.job);
        System.out.println(preparedStatement); // 테스트 코드

        // SQL 문 실행
        // executeUpdate ( ) 메소드가 리턴하는 값은 저장된 행 수 // executeUpdate() 메소드는 반환값이 executeQuery() 메소드랑 달라요. resultSet
        int rows = preparedStatement.executeUpdate(); // executeUpdate() 을 호출하면 sql 문이 실행.  // 수행결과로 int 타입의 값을 반환 (처리된 레코드(row)의 개수)
        // 영향을 받은 데이터 갯수(정수) 반환.    하이디 SQL 에서 로그창에 영향받은 ~~ 그거를 반환받는거임.
        // pstmt.executeQuery()  : select
        // pstmt.executeUpdate() : insert, update, delete ...   : 반환형이 int.
        // CREATE / DROP 관련 문구에서는 -1 반환
        System.out.println("저장된 행 수: " + rows); // 테스트 코드 // 1로 반환이 됨
        // insert의 경우 정상적으로 실행이 되었으면 1을 리턴. // SQL 문이 틀리거나 해서 실행이 제댈 안되었으면 0 반환되요
        if (rows == 1) {
            System.out.println("데이터 입력에 성공했습니다.");
        } else { // 1이 아니라면(아마 0일거임) `insert`문이 제대로 실행이 안되었다는 경우임.
            System.out.println("데이터 입력에 실패했습니다.");
        }
    }

    // 중복 검사하는 방법 case 1
    private boolean isDupUserID2(String userID) throws SQLException {
        /* 중복이 되면 true 반환*/
        int totalRow;   // 레코드 수를 저장 // 0
        String sql = "SELECT * FROM tUser WHERE userID = ?";

        preparedStatement = conn.prepareStatement(sql); // 쿼리 실행 준비
        // ? 에 들어갈 값을 지정해주는데, ?는 순서에 따라 1번 부터 번호가 부여.
        preparedStatement.setString(1, userID);
        resultSet = preparedStatement.executeQuery();   // Select 니까 executequery()
        // resultSet에 데이터가 몇 개인지는 자바에서 파악할 방법이 없음.

        // ResultSet 의 개수를 구하는 메서드는 없어서 다른 방법으로 개수를 구함.
        resultSet.last();   // 마지막 row 로 이동.    //  resultSet 을 이용해서 중복 검사를 할려면 커서 끝값으로 이동해요
        totalRow = resultSet.getRow(); // row count 를 추출.// 현재 열값을 반환 int로  resultSet의 메소드
        resultSet.beforeFirst();// 처음 row 로 커서를 이동.(초기 상태로 돌려놓음)
        // totalRow 가 10의 값을 얻고
        return totalRow == 1; // true/false 를 반환하는데   // == 두번은 검사라 불린값이 나옴 todo 나중에. // insert는 끝.
    }

    private boolean isDupUserID(String userID) throws SQLException {
        /* 중복이 되면 true 반환 */    // 아까처럼 show tables해서 while next() 문으로 중복검사를 해도 되요
        // 만약 이미 생성한 userID가 fpkm3033 이라면
//        show tables 할때는 where 뒤에 조건이나 값을 넣을 필요가 없어서 ?를ㄹ 안썼음
        String sql = "SELECT COUNT(*) FROM tUser WHERE userID =?";  // 문자열로 된 쿼리문   // "매개변수화된 쿼리문 "으로 안하면 어떻게 됨?
        preparedStatement = conn.prepareStatement(sql); // 쿼리 실행 준비
        System.out.println(conn.prepareStatement(sql)); // 테스트 코드
        // ?에 들어갈 값을 지정해주는데, ? 는 순서에 따라 1번부터 번호가 부여.
        preparedStatement.setString(1, userID); // ? 자리에 userID값을 넣음
        // SELECT COUNT(*) FROM tUser WHERE userID ='fpkm3033';
        resultSet = preparedStatement.executeQuery();   // 쿼리 실행

        resultSet.next();   // boolean next() -> 다음 행이 있을 경우 true, 없을 경우 false 이걸 안하고 getInt/getString 메소드 실행시 에러뜸 // 커서가 아무것도 가르키지 않고 있기 때문.
        System.out.println(resultSet.getInt(1));// 테스트 코드   // count에서 한개만 나왔다면 false
        return resultSet.getInt(1) == 1; // 나올 수 있는 수가 0 아니면 1임. // getInt(1) 는 해당 컬럼의 1번째 해당 값을 불러옴.
    }
}
