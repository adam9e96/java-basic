package chapter19.interface04;
/**
 * ===========================================================
 * fileName       : OracleData
 * date           : 2024-01-24
 * description    : 인스테이스 연습4
 * ===========================================================
 */
public class OracleData implements DataAccessObject {
    @Override
    public void insert() {
        System.out.println("Oracle DB에 삽입");
    }

    @Override
    public void select() {
        System.out.println("Oracle DB에서 검색");
    }

    @Override
    public void update() {
        System.out.println("Oracle DB 수정");
    }

    @Override
    public void delete() {
        System.out.println("Oracle DB에서 삭제");
    }
}
