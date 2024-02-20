package Project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * ===========================================================
 * fileName       : AccountDao
 * date           : 2024-02-20
 * description    :
 * ===========================================================
 */
public class AccountDao implements IAccountDao{
    private Connection connection = null;

    public AccountDao() {
        getConnection();
    }

    @Override
    public void getConnection() {  // DB랑 연결하는 메소드
        // 디비 연결. 생성자에서 실행
        try {
            final String DB_URL = "jdbc:mariadb://localhost:3306/sample_java"; // 첫번째 매개값. 연결 문자열
            final String DB_USER = "root";
            final String DB_PASS = "3033";

            try {
                Class.forName("org.mariadb.jdbc.Driver");    // JDBC 드라이버 등록. point1
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean insertMember(Member member) {
        return false;
    }

    @Override
    public boolean insertAccount(Account account) {
        return false;
    }

    @Override
    public void insertAccountHistory(AccountHistory accountHistory) {

    }

    @Override
    public ArrayList<AccountHistory> selectAccountHistories(String accountId) {
        return null;
    }

    @Override
    public void disConnect() {

    }

    @Override
    public Account selectAccount(String accountId) {
        return null;
    }

    @Override
    public double selectBalance(String accountId) {
        return 0;
    }

    @Override
    public void updateBalance(String accountId, double balance) {

    }

    @Override
    public int selectAccountIdCnt(String accountId) {
        return 0;
    }

    @Override
    public int selectMemberIdCnt(String memberId) {
        return 0;
    }
}
