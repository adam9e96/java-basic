package Project1;

public interface IAccountManager {
    void addMember(); // 회원 등록
    void addAccount(); // 계좌 개설
    void deposit(); // 입금 처리
    void withdraw(); // 출금 처리
    void viewHistory(); // 조회 처리
    void disConnect(); // 종료 처리
    boolean isMember(String memberId);
    boolean isAccount(String accountId);
    boolean isPart(Account account); //
}
