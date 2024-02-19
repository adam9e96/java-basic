package Project1;

import java.util.ArrayList;

public interface IAccountDao {
    void getConnection(); // 데이터 베이스 연결
    boolean insertMember(Member member); // 회원 등록 디비 처리
    boolean insertAccount(Account account); // 계좌 개설 디비 처리
    void insertAccountHistory(AccountHistory accountHistory); // 거래 내역 저장
    ArrayList<AccountHistory> selectAccountHistories(String accountId); // 특정 계좌 번호에 대한 거래 내역 조회
    void disConnect(); // 데이터 베이스 연결 해제
    Account selectAccount(String accountId); // 특정 계좌 번호의 정보를 가져옴
    double selectBalance(String accountId); // 특정 계좌 번호의 잔액을 가져옴
    void updateBalance(String accountId, double balance); // 특정 계좌 번호의 잔액을 수정
    int selectAccountIdCnt(String accountId); // 해당 계좌번호의 계좌 개수를 반환
    int selectMemberIdCnt(String memberId); // 해당 아이디의 회원 개수를 반환
}
