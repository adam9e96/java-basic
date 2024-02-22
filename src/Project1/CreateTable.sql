create database sample_java;
use sample_java;
#회원등록 테이블
CREATE TABLE member
(
#자동증가정수, 아이디, 이름, 나이, 거주지
    memberid int AUTO_INCREMENT PRIMARY KEY, #자동증가 #중복 불가   // 얘는 insert into로 따로 안해도 자동으로 생기고 증가됨
    userId   VARCHAR(20) NOT NULL unique ,           #유저아이디
    name     VARCHAR(20) NOT NULL,           #유저이름
    age      INT(3)      NOT NULL,           #유저나이
    addr     VARCHAR(20) NOT NULL            #유저거주지
);
# userid는 Unique 걸어 놓지 않았음
# 로직에서 중복검사를 돌리기 떄문에

## 계좌 테이블
CREATE TABLE account
(
    userId      VARCHAR(20)   NOT NULL,                                            # 유저아이디
    accountType INT           NOT NULL CHECK (accountType = 1 or accountType = 2), # (1 : 예금계좌, 2 : 대출계좌) # 종류
    accountId   VARCHAR(20) PRIMARY KEY,                                           # 계좌 번호
    balance     DECIMAL(10, 2),                                                    # 잔액
    typeRate    DECIMAL(5, 2) NOT NULL,                                            # 이자율/ 수수료율 # 비율
    FOREIGN KEY (userId) REFERENCES member (userId)
);
SELECT COUNT(*)
FROM account
WHERE accountId = 12345;
select *
from member;
select *
from account;

CREATE TABLE accountHistory
(
    accountHistoryId INT AUTO_INCREMENT PRIMARY KEY,                                              # 거래내역의 고유 번호
    transactionType  INT            NOT NULL CHECK ( transactionType = 1 or transactionType = 2), # 거래 유형 (예: 1 - 입금, 2 출금) #in 은 1 또는
    amount           DECIMAL(10, 2) NOT NULL,                                                     # 거래 금액 (예금,출금시 money 값을 저장)
    balanceAfter     DECIMAL(10, 2) NOT NULL,                                                     # 거래 후 잔액
    accountId        varchar(20)    NOT NULL,                                                     # 계좌 번호
    FOREIGN KEY (accountId) REFERENCES account (accountId)                                        # 계좌번호 외래키,
);
select *
from member;
SELECT * FROM accountHistory WHERE accountId = '1234';
UPDATE account SET balance = 100000 where accountID = '1234';
# 테스트용 데이터
select *
from member;
select *
from account;
select count(*)
from member
where userId = 'test';

INSERT INTO member
VALUES (0, 'test', 'test', 25, 'test'); # memberid : 1번

insert into member
values (2, 'test1', 'test1', 26, 'addrtest'); # memberid : 2번

INSERT INTO member (userId, name, age, addr)
VALUES ('user02', '홍길동', 30, '서울');

INSERT INTO member (userId, name, age, addr)
VALUES ('fpkm', '홍길순', 25, '경기'); # memberid : 1번

INSERT INTO account (memberid, accountType, accountId, balance, typeRate)
VALUES (1, 1, 'ACC0001', 10000.00, 1.5), -- 예금계좌, 이자율 1.5%
       (2, 2, 'ACC0002', -5000.00, 2.0), -- 대출계좌, 수수료율 2.0%
       (3, 1, 'ACC0003', 15000.00, 1.2);
-- 예금계좌, 이자율 1.2%

# 테스트 코드 start !!
insert into member (userId, name, age, addr)
VALUES ('test', 'test', 25, 'test');
insert into member (userId, name, age, addr)
VALUES ('abc', '스몰더', 20, '경주');
select *
from member;
insert into account (memberid, accountType, accountId, balance, typeRate)
VALUES (1, 1, 'fpkm3033', 10000.0, 10.0);
insert into account (memberid, accountType, accountId, balance, typeRate)
VALUES (2, 2, 'list9999', 1000, 5.0);
insert into accountHistory (transactionType, amount, balanceAfter, accountId)
VALUES (1, 2000, 12000, 'fpkm3033');
# 테스트 코드 end !!!


insert into account (memberid, accountType, accountId, balance, typeRate)
values (4, 2, '3033', 100000, 3.0);

INSERT INTO accountHistory (transactionType, amount, balanceAfter, accountId)
VALUES (1, 10000.00, 10000.00, 'ACC0001'), -- ACC001 계좌에 대한 입금 거래 # 1은 입금
       (2, 5000.00, 5000.00, 'ACC0002'),   -- ACC002 계좌에 대한 출금 거래 # 2는 출금
       (1, 200.00, 10200.00, 'ACC0001');
-- ACC001 계좌에 대한 이자지급 거래

# 조회
select *
from member;
select *
from account;
select *
from accountHistory;

select amount as 거래금액, balanceAfter as "입/출금하고 금액"
from accountHistory;

select count(userid)
from member
where userId = 'test';

select count(accountId)
from account
where accountId = 3033;

select *
from account
where memberid = (select member.memberId
                  from member
                  where memberId = 1);


select *
from member b
where b.memberid in ( # get으로 현재 memberid 가져오기
    select c.memberid
    from account c
    where c.accountType = 1); # get으로 현재 타입 가져오기

select *
from member;



SELECT *
FROM member
WHERE userid = 'test';

select count(userId)
from member
where userId = 'test';


select *
from member
where memberId = (select memberId
                  from member
                  where memberId = 2);

select memberId
from member
where memberId = 2;

select accountType
from account
where memberid = (select memberId
                  from member
                  where accountId = '12345'); # get으로 id 가져오기


select *
from account
where memberid = (SELECT member.memberId
                  FROM member
                  WHERE userid = 'test1');
# 테스트 (중복검사 관련 )
INSERT INTO member
VALUES (0, 'test', 'test', 25, 'test');
SELECT *
FROM member;
SELECT *
FROM ACCOUNT;
SELECT *
FROM member
WHERE userid = 'test';

INSERT INTO ACCOUNT
VALUES ((SELECT memberid FROM member WHERE userid = 'test'), 1, 3355, 1000, 0.5);
SELECT *
FROM member
WHERE memberid = (SELECT memberid
                  FROM ACCOUNT
                  WHERE accountId = 3355);

select count(*)
from account
where accountId = '3033';
select count(accountId)
from account
where accountId = 3033;

select *
from member;
SELECT COUNT(*) AS UserCount
FROM member
WHERE userId = 'test';


# accountHistory 거래 내역 데이터 (테스트용)
INSERT INTO accountHistory (transactionType, amount, balanceAfter, accountId)
VALUES (1, 1000.00, 1000.00, 'ACC0001'), -- ACC0001에 대한 입금 거래
       (2, 200.00, 800.00, 'ACC0001'),   -- ACC0001에 대한 출금 거래
       (1, 1500.00, 1500.00, 'ACC0002'), -- ACC0002에 대한 입금 거래
       (2, 500.00, 1000.00, 'ACC0002'),  -- ACC0002에 대한 출금 거래
       (1, 2000.00, 2000.00, 'ACC0003'), -- ACC0003에 대한 입금 거래
       (2, 1000.00, 1000.00, 'ACC0003'), -- ACC0003에 대한 출금 거래
       (1, 3000.00, 3000.00, '3033'),    -- 3033에 대한 입금 거래
       (2, 1500.00, 1500.00, '3033');
-- 3033에 대한 출금 거래

# case 5번
select *
from accountHistory
where accountId = 'ACC0001';
# transactionType : 1  ==> 입금
# transactionType : 2  ==> 출금


select *
from account;

select *
from member;

select count(*)
from account
where accountId = '3033';

select *
from account
where accountId = 'ACC0001';
