package chapter19.interface04;

/**
 * ===========================================================
 * fileName       : Main
 * date           : 2024-01-24
 * description    : 인스테이스 연습4
 * DataAccessObject 인터페이스와 이 인터페이스를 구현하는 OracleData, MySqlData 클래스가 있습니다.
 * 메인 클래스를 보고 출력 결과가 다음과 같을 때 인터페이스와 클래스를 만들어서 완성하세요.
 * <p>
 *
 * ===========================================================
 */
public class Main {
    public static void dbWork(DataAccessObject dao) {   // 다형성을 이용
        dao.insert();
        dao.select();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleData());
        // Oracle DB에 삽입
        // Oracle DB에서 검색
        // Oracle DB 수정
        // Oracle DB에서 삭제
        System.out.println();

        dbWork(new MySqlData());
        // MySql DB에 삽입
        // MySql DB에서 검색
        // MySql DB를 수정
        // MySql DB에서 삭제
    }
}
