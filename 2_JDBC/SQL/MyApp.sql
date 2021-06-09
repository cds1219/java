--users 테이블
--java에서 member클래스
--id[PK], pw, name, email
--insert 10개 데이터 만들기
--CURD
--login 처리 sql 구문 완성

DROP TABLE users;
CREATE TABLE users(
    id VARCHAR2(12) PRIMARY KEY,
    password VARCHAR2(12) NOT NULL,
    name VARCHAR2(20) NOT NULL,
    role VARCHAR2(5) DEFAULT 'user'
);

SELECT * FROM users;
-- 회원 가입
INSERT INTO users (id,password,name) VALUES ('java01','1234','홍길동');
INSERT INTO users (id,password,name) VALUES ('java02','1234','김길동');
INSERT INTO users (id,password,name) VALUES ('java03','1234','나길동');
INSERT INTO users (id,password,name,role) VALUES ('admin','1234','관리자','admin');

ROLLBACK;
COMMIT;

-- 회원 정보 수정
UPDATE users SET password = '1111' WHERE id = 'java01';     -- 비밀번호 변경

UPDATE users SET password = '&password' WHERE id = '&id';

-- 회원 탈퇴
DELETE FROM users WHERE id = 'java01';

DELETE FROM users WHERE id = '&id';

-- 회원 검색
SELECT * FROM users;

-- id, pw 찾기
SELECT id FROM users WHERE name = '홍길동';
SELECT password FROM users WHERE id = 'java01';

-- 로그인 처리
SELECT * FROM users WHERE id = 'java01' and password = '1234';

SELECT * FROM users WHERE id = '&id' and password = '&password';


-----------------------------------------------------------------------------
drop TABLE book;
CREATE TABLE book(
    bookno NUMBER(5) PRIMARY KEY,       -- unique + not null, index 생성
    title VARCHAR2(30),          
    publisher VARCHAR2(30),
    price number(9),
    pubdate DATE default sysdate
);

SELECT * FROM book;

CREATE SEQUENCE bookno;
    INSERT INTO book (bookno,title,publisher,price) VALUES (BOOKNO.nextval,'html5','한빛미디어',23000);
    INSERT INTO book (bookno,title,publisher,price) VALUES (BOOKNO.nextval,'jQuery','이지스',19000);
drop SEQUENCE bookno;       -- auto commit

INSERT INTO book (bookno,title,publisher,price) VALUES ((SELECT nvl(max(bookno),0) FROM book)+1,'html5','한빛미디어',23000);
INSERT INTO book (bookno,title,publisher,price) VALUES ((SELECT nvl(max(bookno),0) FROM book)+1,'jQuery','이지스',19000);

ROLLBACK;

INSERT INTO book (bookno,title,publisher,price) VALUES ((SELECT nvl(max(bookno),0) FROM book)+1,'&title','&publisher',&price);

-- book 등록
INSERT INTO book (bookno,title,publisher,price) VALUES ((SELECT nvl(max(bookno),0) FROM book)+1,'&title','&publisher',&price);

-- book 삭제
DELETE FROM book WHERE bookno = &bookno;

-- book 변경
UPDATE book SET price = &price where bookno = &bookno;

-- book 검색
SELECT * FROM book where upper(title) like upper('%&title%') and upper(publisher) like upper('%&publisher%');
 