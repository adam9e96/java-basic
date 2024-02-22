package Project1;

import java.sql.*;
import java.util.ArrayList;

/**
 * ===========================================================
 * fileName       : AccountDao
 * date           : 2024-02-20
 * description    :
 * ===========================================================
 */
public class AccountDao implements IAccountDao {
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
        String sql = "INSERT INTO account VALUES (?,?,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, member.getMemberId());
            preparedStatement.setString(2, member.getUserId());
            preparedStatement.setString(3, member.getName());
            preparedStatement.setInt(4, member.getAge());
            preparedStatement.setString(5, member.getAddr());

            return preparedStatement.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean insertAccount(Account account) {
            String sql = "INSERT INTO account VALUES (?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, account.getMemberid());
            preparedStatement.setString(2, account.getAccountId());
            preparedStatement.setDouble(3, account.getBalance());

            return preparedStatement.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
        String sql;
        boolean flag = true;
        if (flag) {
            sql = "UPDATE account SET balance = ? where (accountID = ?)";
        } else {
            sql = "slkjfslk";
        }

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setDouble(1, balance);
            preparedStatement.setString(2, accountId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int selectAccountIdCnt(String accountId) {
        String sql = "SELECT COUNT(*) FROM account WHERE id = ? ";
        int cnt;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, accountId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                resultSet.next();
                cnt = resultSet.getInt(1);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cnt;
    }

    @Override
    public int selectMemberIdCnt(String memberId) {
        String sql = "SELECT COUNT(*) FROM account WHERE id = ? ";
        int cnt;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, memberId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                resultSet.next();
                cnt = resultSet.getInt(1);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cnt;    }

    public int selectTypeRate(Account account) {
        // 현재 계좌의 유형 중복검사
        return 1;
    }
}
