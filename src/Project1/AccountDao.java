package Project1;

import java.util.ArrayList;

/**
 * ===========================================================
 * fileName       : AccountDao
 * date           : 2024-02-20
 * description    :
 * ===========================================================
 */
public class AccountDao implements IAccountDao{
    @Override
    public void getConnection() {

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
