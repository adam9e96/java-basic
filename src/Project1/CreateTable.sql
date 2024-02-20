CREATE TABLE member
(
    memberId INT AUTO_INCREMENT PRIMARY KEY, # 일련번호
    userId   VARCHAR(50) UNIQUE NOT NULL,    #아이디 #중복 불가 처리
    name     VARCHAR(10)        NOT NULL,    # 이름
    age      INT                NOT NULL,    # 나이
    addr     VARCHAR(50)        NOT NULL     #거주지
);

create table account
(
    accountId     int AUTO_INCREMENT primary key,                  # 계좌 일련번호 #기본키
    # 계좌 아이디가 필요한듯 -> 예제 보니 계좌 아이디라는건 없고 member 테이블에서 생성한 userId를 이용함으로 외래키 설정함
    accountType   int not null check ( accountType in (1,2)),           # NOT NULL check (accountType < 3), # 계좌종류 (1: 예금계좌, 2: 대출계좌)
    accountNumber int            NOT NULL,                         # 계좌번호
    balance       DECIMAL(12, 2) NOT NULL,                         # 잔액
    interestRate  double,                                          # 이자율 null 허용, 예금 계좌에서만 사용
    chargeRate    double,                                          # 수수료율, null 허용, 대출 계좌에서만 사용
    userId        VARCHAR(50)    not null,                         # member아이디 (외래키)
    # Rate의 경우 double로 할지 DECIMAL로 할지 모르겠음.
    constraint unique_account UNIQUE (accountType, userId),        # 타입은 중복이 안되므로(각 1개씩 생성가능함)
    foreign key (userId) references member (userId)
);


create table accountHistory
(
    accountHistoryId   int auto_increment primary key, # 거래내역 일련번호
#     memberId         int not null,
    transactionType    int            not null,        # 거래유형
    accountNumber          int            not null,        # 계좌일련번호
    Transaction_amount DECIMAL(12, 2) NOT NULL,        # 거래금액

    CONSTRAINT UNIQUE_AH unique (transactionType, accountNumber),
#     foreign key (memberId) references member (memberId), # accountId가 이미 account 테이블 -> member와 연결외어 있어서 의미 없음
    foreign key (accountNumber) references account (accountNumber)
);

# 아직 수정안된거
