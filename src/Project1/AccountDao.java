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
        String sql = "INSERT INTO member (userId, name, age, addr) VALUES (?,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ;
//            preparedStatement.setInt(1,0);
            preparedStatement.setString(1, member.getUserId());
            preparedStatement.setString(2, member.getName());
            preparedStatement.setInt(3, member.getAge());
            preparedStatement.setString(4, member.getAddr());

            return preparedStatement.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean insertAccount(Account account) {
        // VALUES (1, 1, 'fpkm3033', 10000.0, 10.0);
        String sql = "INSERT INTO account (userId, accountType, accountId, balance, typeRate) " +
                "VALUES (?,?,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, account.getUserId());
            preparedStatement.setInt(2, account.getAccountType());
            preparedStatement.setString(3, account.getAccountId());
            preparedStatement.setDouble(4, account.getBalance());
            preparedStatement.setDouble(5, account.getTypeRate());

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
        String sql = "SELECT COUNT(*) FROM account WHERE (accountId = ?) ";
        int cnt;// select count(*) from account where accountId = 'fpkm3033';
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, accountId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                resultSet.next();
                cnt = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cnt;
    }

    @Override
    public int selectMemberIdCnt(String memberId) {
        String sql = "SELECT COUNT(*) FROM member WHERE userId = ? ";
        int cnt = 0;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, memberId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                resultSet.next();
                cnt = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cnt;
    }

    public boolean selectIsAccountType(Account account) {
        System.out.println(account.getAccountType()); // 테스트 코드
        if (account.getAccountType() == 1) {
            String sql = "SELECT accountType FROM account WHERE ( userId = ?  AND accountType = ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, account.getUserId());
                preparedStatement.setInt(2, 1);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    int cnt = resultSet.getInt(1);
                    if (cnt >= 1) {
                        return true;
                    }
                } else {
                    System.out.println("계좌 없음"); // 테스트 코드
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (account.getAccountType() == 2) {
            String sql = "SELECT accountType FROM account WHERE (userId = ?  AND accountType = ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, account.getUserId());
                preparedStatement.setInt(2, 2);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    int cnt = resultSet.getInt(1);
                    if (cnt >= 1) {
                        return true;
                    }
                } else {
                    System.out.println("계좌 없음"); // 테스트 코드
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
