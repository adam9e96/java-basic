package chapter_18_interface.interface04;

/**
 * ===========================================================
 * fileName       : Main
 * date           : 2024-01-24
 * description    : 인스테이스 연습4
 * DataAccessObject 인터페이스와 이 인터페이스를 구현하는 OracleData, MySqlData 클래스가 있다.
 * 메인 클래스를 보고 출력 결과가 다음과 같을 때 인터페이스와 클래스를 만들어서 완성하세요.
 * ===========================================================
 */
public class Main {

    // dbWork() 라는 메소드를 만드는데 다형성을 이용한다 타입은 인터페이스
    public static void dbWork(DataAccessObject dao) {   // 다형성을 이용
        dao.insert();
        dao.select();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new MySqlData());


        System.out.println();


        dbWork(new OracleData()); //
    }
}
