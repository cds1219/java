-- DDL Table 생성 (auto commit) => rollback 불가능
-- 데이터 조작어  DML : Insert Update Delete => rollback 가능

drop TABLE book;

CREATE TABLE book(
    bookno NUMBER(5),
    title VARCHAR2(30),
    author VARCHAR2(30),
    pubdate DATE
);

SELECT * FROM book;
INSERT INTO book (bookno,title,author,pubdate)
VALUES (2,'html5','고길동',sysdate);
COMMIT;
ROLLBACK;

INSERT INTO book (bookno,title,author,pubdate) VALUES (3,'jsp','김길동','20/02/23');
INSERT INTO book (bookno,title,author,pubdate) VALUES (4,'spring','최길동',to_date('20/02/19','dd-mm-rr'));
INSERT INTO book (bookno,title,author,pubdate) VALUES (5,'spring boot','이길동',null);
INSERT INTO book (bookno,title,author) VALUES (6,'spring boot','이길동');
INSERT INTO book (title) VALUES ('....');
INSERT INTO book VALUES (7,'jsp',user,'20/02/23');
INSERT INTO book (bookno,title,author,pubdate) VALUES (8,'spring','길동',to_date('20/02/2019','dd-mm-rr'));
INSERT INTO book (bookno,title,author,pubdate) VALUES (9,'spring','길동',to_date('20/02/2019','dd-mm-yyyy'));

ROLLBACK;

delete from book where bookno=1;
COMMIT;

SELECT * FROM book;
UPDATE book SET title='****' where bookno is null;
UPDATE book SET title='****',author='우재남',pubdate=sysdate where bookno is null;

SELECT * FROM book where title like '%j%';


-- DDL Table 생성 (auto commit) => rollback 불가능
drop TABLE book;

CREATE TABLE book(
    bookno NUMBER(5),
    title VARCHAR2(30),
    author VARCHAR2(30),
    pubdate DATE
);

INSERT INTO book (bookno,title,author,pubdate) VALUES (2,'html5','고길동',sysdate);

alter table book add(price number(7));      -- auto commit
alter table book drop COLUMN price;
alter table book modify(price number(9,2)); -- 실수

INSERT INTO book (bookno,title,author,pubdate,price) VALUES (1,'html5','고길동',sysdate,9999);
INSERT INTO book (bookno,title,author,pubdate,price) VALUES (1,'html5','고길동',sysdate,999.90);
INSERT INTO book (bookno,title,author,pubdate,price) VALUES (1.0,'html5','고길동',sysdate,999.90);

COMMIT;
ROLLBACK;

SELECT * FROM book;
SELECT * FROM book2;

RENAME book to book2;   -- auto commit

DELETE from book;       -- rollback 가능
TRUNCATE table book;    -- auto commit
drop table book;
----------------------------------------------------------------------------------------


select * from emp;
select * from emp2;
select * from dept;
select * from dept2;

-- 제약조건 확인
CREATE table emp2 as select * from emp;
CREATE table dept2 as select * from dept;

desc dept;
desc dept2;

-- dept, dept2(50,'EDU','SEOUL')
insert into dept values (50,'EDU','SEOUL');
insert into dept2 values (50,'EDU','SEOUL');

insert into dept values (10,'EDU','SEOUL');
insert into dept values (null,'EDU','SEOUL');
insert into dept2 values (10,'EDU','SEOUL');
insert into dept2 values (null,'EDU','SEOUL');

insert into emp(empno,ename,hiredate,sal,deptno) values(9999,'홍길동',sysdate,0,90);
insert into emp2(empno,ename,hiredate,sal,deptno) values(9999,'홍길동',sysdate,0,90);

ROLLBACK;

------제약조건-----------------------------------------------------------------------
drop TABLE book;

CREATE TABLE book(
    bookno NUMBER(5) PRIMARY KEY,       -- unique + not null, index 생성
    title VARCHAR2(30) unique,          -- unique, index 생성
    author VARCHAR2(30),
    price number(9,2) check(price>0),
    pubdate DATE default sysdate
);

INSERT INTO book (bookno,title,author,price) VALUES (1,'html5','고길동',9999);
INSERT INTO book (bookno,title,author,price) VALUES (2,'JQuery','고길동',7999);
INSERT INTO book (bookno,title,author,price) VALUES (3,null,'고길동',7999);
INSERT INTO book (bookno,title,author,price) VALUES (null,null,'고길동',7999);

select * from book;
select * from book where title like '%e%';


drop TABLE book;
CREATE TABLE book(
    bookno NUMBER(5), --PRIMARY KEY,       -- unique + not null, index 생성
    title VARCHAR2(30) unique,          -- unique, index 생성
    author VARCHAR2(30),
    price number(9,2) check(price>0),
    pubdate DATE default sysdate
);

alter table book add CONSTRAINT book_bookno_pk PRIMARY KEY(bookno);
alter table book drop CONSTRAINT book_bookno_pk;

INSERT INTO book (bookno,title,author,price) VALUES (1,'html5','고길동',9999);
INSERT INTO book (bookno,title,author,price) VALUES (2,'jsp','고길동',9999);
INSERT INTO book (bookno,title,author,price) VALUES (3,'jsp2','고길동',9999);

delete from book;

----------- emp, dept ---------------------------------------------------------------
select * from emp;
select * from emp2;
select * from dept;
select * from dept2;

drop table emp2;
drop table dept2;

CREATE table emp2 as select * from emp;
CREATE table dept2 as select * from dept;

-- dept2 pk(deptno) 설정
alter table dept2 add CONSTRAINT dept2_deptno_pk PRIMARY KEY(deptno);

-- emp2 pk(empno) 설정
alter table emp2 add CONSTRAINT emp2_empno_pk PRIMARY KEY(empno);

-- emp2 fk(deptno) 설정 및 삭제
alter table emp2 add CONSTRAINT emp2_deptno_fk FOREIGN KEY(deptno) REFERENCES dept2;        -- 자식이 있으면 부모키 삭제 불가능
alter table emp2 drop CONSTRAINT emp2_deptno_fk;
alter table emp2 add CONSTRAINT emp2_deptno_fk FOREIGN KEY(deptno) REFERENCES dept2 on delete set null;     -- 자식이 있어도 부모키 삭제 가능
alter table emp2 add CONSTRAINT emp2_deptno_fk FOREIGN KEY(deptno) REFERENCES dept2 on delete CASCADE;      -- 자식도 같이 삭제


-- 삭제?
delete from emp2 where deptno=20;
ROLLBACK;

delete from dept2 where deptno=40;
delete from dept2 where deptno=20;

-- 뷰        system 계정
create or replace view emp_detail
as
SELECT ename, dname, sal, grade
FROM SCOTT.emp e 
    join SCOTT.salgrade
    on sal between losal and hisal
    join SCOTT.dept d
    on e.deptno = d.deptno;
    
SELECT ename, dname, sal, grade
FROM SCOTT.emp e 
    join SCOTT.salgrade
    on sal between losal and hisal
    join SCOTT.dept d
    on e.deptno = d.deptno;
    
SELECT
    *
FROM emp_detail;