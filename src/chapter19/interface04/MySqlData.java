package chapter19.interface04;
/**
 * ===========================================================
 * fileName       : MySqlData
 * date           : 2024-01-24
 * description    : 인스테이스 연습4
 * ===========================================================
 */
public class MySqlData implements DataAccessObject {
    @Override
    public void insert() {
        System.out.println("MySql DB에 삽입");
    }

    @Override
    public void select() {
        System.out.println("MySql DB에서 검색");
    }

    @Override
    public void update() {
        System.out.println("MySql DB를 수정");
    }

    @Override
    public void delete() {
        System.out.println("MySql DB에서 삭제");
    }
}
