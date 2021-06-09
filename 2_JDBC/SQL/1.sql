오라클 설치 후
도스창

sqlplus system/111111		관리자 계정

alter user hr identified by hr account unlock;

create user hr identified by hr;

grant connect,resource,dba to hr;

######## 관리자 계정에서 명령 수행 계정관리 ########################################

create user test01 identified by 1234;		패스워드는 대소문자를 구별한다
create user test01 identified by 1234;		

grant connect to test01;				권한부여

revoke connect from test01;				권한강탈

grant connect,resource to test01;

grant connect,resource,dba to test01;

drop user test01 cascade;				계정삭제

###########################################################################

sqlplus test01/1234
conn test01/1234


sqlplus cds/111111
 select * from tab;			계정이 가진 테이블 확인
 
 set linesize 120;
 set pagesize 120;
 
 select * from emp;
 select * from dept;
 
 
 D:\app\A\product\18.0.0\dbhomeXE\rdbms\admin
 scott.sql
 
 @D:\lib\scott.sql
 
 
 
 
 
오라클 12c로 넘어오면서 계정이름 앞에 C##을 붙여야 계정생성이 가능하다고 한다...

CREATE USER C## 아이디 IDENTIFIED BY 비번;

만약 C##을 붙이기 싫으면 아래를 입력하여 설정을 변경하면 된다.

ALTER SESSION SET "_ORACLE_SCRIPT"=true;
 









SELECT user from dual;



SELECT
*
FROM emp;

SELECT user from dual;

desc dept;

SELECT
deptno,empno,ename
FROM emp;

SELECT
deptno,empno,ename as 사원명, sal as "월 급"
FROM emp;

SELECT
deptno,empno,ename 사원명, sal "월 급"
FROM emp;

SELECT
deptno,empno,ename 사원명, sal "월 급", sal*12 "년 봉"
FROM emp;

SELECT
deptno,empno,ename 사원명, sal || '원' "월 급", sal*12 "년 봉"
FROM emp;

--null

SELECT
ename,sal,comm
FROM emp;

SELECT
deptno,empno,ename,comm,NVL(comm,0),sal,sal+comm,sal+nvl(comm,0) "급 여"
FROM emp;

SELECT
empno,ename,mgr,NVL(TO_CHAR(mgr), '<TOP>') "사 수",sal,comm,sal+nvl(comm,0) "급 여"
FROM emp;

SELECT
ename ||' '|| job
FROM emp;

SELECT
DISTINCT job
FROM emp;

SELECT
DISTINCT deptno,job
FROM emp;

-- RR/MM/DD
SELECT
SYSDATE, user
FROM dual;

SELECT to_date('2021-06-01') from dual;

SELECT to_date('17-12-1980','dd-mm-yyyy') from dual;


SELECT * FROM emp ORDER by sal;

SELECT
deptno,empno,ename,sal+nvl(comm,0) "급 여" 
FROM emp order by "급 여";

SELECT
empno,ename,sal+nvl(comm,0) "급 여" 
FROM emp order by deptno;

SELECT
deptno,empno,ename,sal+nvl(comm,0) "급 여" 
FROM emp order by deptno DESC, "급 여";


-------------------------------day02--------------------------------------


select * from emp;

select * 
from emp
WHERE sal>1900;

select ename 이름, sal+nvl(comm,0) 급여 
from emp
--WHERE 급여>2000
ORDER BY 급여;

select ename 이름, sal+nvl(comm,0) 급여 
from emp
WHERE sal+nvl(comm,0)>2000
ORDER BY 급여;

select ename 이름, sal+nvl(comm,0) 급여 
from emp
WHERE deptno=30
ORDER BY 급여;

select deptno, ename 이름, job, sal+nvl(comm,0) 급여 
from emp
WHERE job='MANAGER';

select deptno, ename 이름, job, sal+nvl(comm,0) 급여 
from emp
WHERE upper(job)=upper('&job');

select deptno, ename 이름, job, sal+nvl(comm,0) 급여 
from emp
WHERE HIREDATE != '81/02/20';

select deptno, ename 이름, job, sal+nvl(comm,0) 급여 
from emp
WHERE HIREDATE <> '1981/02/20';

select deptno, ename 이름, job, sal+nvl(comm,0) 급여 
from emp
WHERE HIREDATE <> to_date('20/02/1981','dd-mm-yyyy'); -- '' -> Date     to_date

-- date -> ''   to_char
select sysdate, to_char(sysdate,'YYYY'), 
to_char(sysdate,'MM'), to_char(sysdate,'DD'), to_char(sysdate,'DAY') from dual;

-- emp에서 사원, 입사월, 입사요일
select ename 사원이름, 
to_char(HIREDATE,'MM') 입사월, 
to_char(HIREDATE,'DAY') 입사요일 
from emp;

-- 99-02-12
SELECT to_date('20-12-99','DD-MM-RR'), to_char(to_date('20-12-99','DD-MM-RR'),'YYYY'),
to_date('20-12-99','DD-MM-YY'), to_char(to_date('20-12-99','DD-MM-YY'),'YYYY')
from dual;

-- emp에서 2월 입사자 명단
select *
from emp
where to_char(HIREDATE,'MM') ='02';

-- 0이 없을때
select *
from emp
where to_char(HIREDATE,'MM') like'%2';

select *
from emp
where to_char(HIREDATE,'MM') like'%2';

-- sal 3000 이상 ~ 5000 이하 사원 목록
select *
from emp
where sal>=3000 and sal<=5000;

select *
from emp
where sal between 3000 and 5000;

select *
from emp
where sal between 3000 and 5000
order by sal;

-- deptno가 10 or 20
select *
from emp
where deptno=10 or deptno=20
order by deptno;

-- 집합 연산자
select *
from emp
where deptno in(10,20)
order by deptno;

select *
from emp
where deptno not in(10,20)
order by deptno;

select * from dept;

select * 
from emp
where (deptno,sal) in((10,5000),(20,3000));

-- like 연산자 % _
select * 
from emp
where ename like 'A%';

select * 
from emp
where upper(ename) like upper('a%');

select * 
from emp
where upper(ename) like upper('%a%');

select * 
from emp
where upper(ename) like upper('%l_k%');

-- null 검색
select * 
from emp
where comm is null;

select * 
from emp
where comm is not null;

-- mgr이 없는 사원 목록
select * 
from emp
where mgr is null;

-- rownum 작다만 됨
select rownum, EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO 
from emp;

select rownum, EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO 
from emp
where rownum <3;

select rownum, EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO 
from emp
where rownum >3;

select rownum, EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO 
from emp
ORDER BY deptno;

select rownum, EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO 
from emp
ORDER BY sal desc;

select rownum, EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
from (select * from emp ORDER BY sal desc);

select rownum, EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
from (select * from emp ORDER BY sal desc)
where rownum<4;

select rownum row#, EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
from (select * from emp ORDER BY sal desc);

select *
from
(
select rownum row#, EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
from (select * from emp ORDER BY sal desc)
)
where row# between 3 and 6;

select *
from
(
select rownum row#, EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
from (select * from emp ORDER BY sal desc)
)
where row# between &start and &end;

-- 내장함수 : single row function
select ename, lower(ename), job, SUBSTR(lower(job),3,4)
from emp;

select 3+4.5,1/2,'3.5'+4
from dual;

-- decode 함수
select ename,sal,decode(deptno,10,sal*0.5,20,sal*0.6,0) 보너스,deptno
from emp
ORDER BY 4;

-- case
select ename,sal,
decode(deptno,10,sal*0.5,20,sal*0.6,0) 보너스_decode,
CASE
 when deptno=10 then sal*0.5
 when deptno=20 then sal*0.6
 else 0
end 보너스_case,
deptno
from emp
ORDER BY 4;

-- hr/hr
-- employees,  급여순 정렬 내림차순, 5~10 로우 출력
select *
from
(
select rownum row#,
    employee_id,
    first_name,
    last_name,
    email,
    phone_number,
    hire_date,
    job_id,
    salary,
    commission_pct,
    manager_id,
    department_id
from employees
ORDER BY salary desc
)
where row# between &start and &end;

-----------------Join--------------------------------
select * from emp;
select * from dept;

select ename, dname 
from emp,dept;

-- 오라클 방식의 이퀴조인
select ename, dname, dept.deptno 
from emp,dept
where emp.deptno = dept.deptno;     --  조인조건 fk = pk

select ename, dname, d.deptno 
from emp e,dept d
where e.deptno = d.deptno;

-- sal >= 2500 사원의 이름과 부서이름, 급여정보, 부서번호 출력
select ename, dname, sal, job, d.deptno 
from emp e,dept d
where e.deptno = d.deptno and sal >= 2500;

-- 안시조인 (표준) from 절 , 를 join 으로 / where절 join 조건 -> on
-- inner join   =>  양쪽 테이블에 모두 있는 내용 출력
select ename, dname, d.deptno 
from emp e join dept d
on e.deptno = d.deptno;             --  조인조건 fk = pk

-- sal >= 2500 사원의 이름과 부서이름, 급여정보, 부서번호 출력
select ename, dname, sal, job, d.deptno 
from emp e join dept d
on e.deptno = d.deptno 
where sal >= 2500;              -- and를 써도 된다

-- outer join
-- oracle 방식
select ename, dname, d.deptno 
from emp e,dept d
where e.deptno(+) = d.deptno;       -- null이 있는 쪽에 (+) 마킹

select ename, dname, d.deptno 
from emp e,dept d
where e.deptno = d.deptno(+);

-- 안시 표준
select ename, dname, d.deptno 
from emp e right outer join dept d              --outer 생략가능
on e.deptno = d.deptno;

select ename, dname, d.deptno 
from emp e left outer join dept d
on e.deptno = d.deptno;

select ename, dname, d.deptno 
from emp e full outer join dept d
on e.deptno = d.deptno;

-- non equi-join
SELECT
    *
FROM salgrade;

-- oracle
SELECT ename, job, sal, grade
FROM emp, salgrade
where sal between losal and hisal
ORDER BY 4;

-- 안시 조인
SELECT ename, job, sal, grade
FROM emp join salgrade
on sal between losal and hisal
ORDER BY 4;

SELECT *
FROM emp join salgrade
on sal between losal and hisal
ORDER BY grade;

SELECT emp.*, salgrade.grade
FROM emp join salgrade
on sal between losal and hisal
ORDER BY grade;

-- 3개의 테이블
-- ename, dname, sal, grade
-- oracle
SELECT ename, dname, sal, grade
FROM emp e, salgrade, dept d
where sal between losal and hisal
and e.deptno = d.deptno
ORDER BY sal desc;

-- ansi join
SELECT ename, dname, sal, grade
FROM emp e 
    join salgrade
    on sal between losal and hisal
    join dept d
    on e.deptno = d.deptno
ORDER BY sal desc;

-- 3개의 테이블
-- ename, dname, sal, grade, sal>2000
-- oracle
SELECT ename, dname, sal, grade
FROM emp e, salgrade, dept d
where sal between losal and hisal
and e.deptno = d.deptno
and sal>2000
ORDER BY sal desc;

-- ansi join
SELECT ename, dname, sal, grade
FROM emp e 
    join salgrade
    on sal between losal and hisal
    join dept d
    on e.deptno = d.deptno
where sal > 2000                    -- where 대신에 and도 가능하다
ORDER BY sal desc;

SELECT ename, dname, sal, grade
FROM emp e 
    join salgrade
    on sal between losal and hisal
    join dept d
    on e.deptno = d.deptno
    and sal > 2000                    
ORDER BY sal desc;
    
-- self join
-- 사원이름emp, 상사mgr의 이름
SELECT a.ename 사원이름, b.ename 상사이름
    from emp a, emp b
    where a.mgr = b.empno(+);

SELECT a.ename 사원이름, b.ename 상사이름
    from emp a left outer join emp b        --outer 생략가능
    on a.mgr = b.empno;
    
    
SELECT a.ename 사원명, NVL(b.ename, '<TOP>') 상사
from emp a left outer join emp b        
on a.mgr = b.empno;

-- 사원의 급여가 상사의 급여보다 많은 사원 목록 리스트
SELECT a.ename 사원명, a.sal 사원급여, 
NVL(b.ename, '<TOP>') 상사,NVL(to_char(b.sal), '<TOP>') 상사급여
from emp a left outer join emp b        
on a.mgr = b.empno
where a.sal>b.sal;

-- SELECT a.ename 사원명, a.sal 사원급여, 
-- NVL(b.ename, '<TOP>') 상사,NVL(to_char(b.sal), '<TOP>') 상사급여
-- from emp a left outer join emp b        
-- on a.mgr = b.empno
-- and a.sal>b.sal;

--  natural join
select ename, dname, deptno 
from emp NATURAL join dept;     
-- on emp.deptno = dept.deptno;     --  조인조건 fk = pk

--select ename, dname, dept.deptno 
--from emp,dept
--where emp.deptno = dept.deptno;     --  조인조건 fk = pk

-- using join
select ename, dname, deptno 
from emp join dept
using(deptno);


----------------------------------day03------------------------------

-- 순서 중요
-- SELECT * 
-- FROM 
-- where
-- group by
-- having
-- ORDER BY

SELECT
    *
FROM emp;

SELECT ename,lower(ename),to_char(hiredate,'day')
FROM emp;

SELECT AVG(sal), AVG(comm), SUM(comm)/COUNT(comm), COUNT(*)
FROM emp;

SELECT AVG(sal),round(avg(sal),1),max(sal),min(sal)
FROM emp;

SELECT count(job), count(DISTINCT job)
FROM emp;

SELECT round(avg(sal)) "전체 평균 급여" FROM emp;
SELECT round(avg(sal)) 평균급여 FROM emp where deptno=10;
SELECT round(avg(sal)) 평균급여 FROM emp where deptno=20;
SELECT round(avg(sal)) 평균급여 FROM emp where deptno=30;
SELECT round(avg(sal)) 평균급여 FROM emp where deptno=40;

-- 순서 중요
-- SELECT * 
-- FROM 
-- where
-- group by
-- ORDER BY 

-- emp 부서번호별 요약 분석
SELECT round(avg(sal)),max(sal),min(sal),deptno
FROM emp
-- where 
group by deptno
ORDER BY deptno;

-- emp 부서이름별 요약 분석
SELECT round(avg(sal)),max(sal),min(sal),dept.dname
FROM emp, dept
where emp.deptno=dept.deptno
group by dept.dname
ORDER BY dept.dname;

SELECT round(avg(sal)),max(sal),min(sal),dept.dname
FROM emp full join dept
on emp.deptno=dept.deptno
group by dept.dname
ORDER BY dept.dname;

SELECT round(avg(sal)),max(sal),min(sal),dept.dname, emp.deptno
FROM emp full join dept
on emp.deptno=dept.deptno
group by dept.dname, emp.deptno
ORDER BY emp.deptno;

-- emp 도시이름별 요약 분석
SELECT round(avg(sal)),max(sal),min(sal),dept.loc, emp.deptno
FROM emp full join dept
on emp.deptno=dept.deptno
group by loc, emp.deptno
ORDER BY emp.deptno;

-- 6.월 별 입사자 수를 조회하는 SQL 쿼리문을 작성하세요 월 순으로 정렬하세요 .
SELECT to_char(HIREDATE,'MM') 월,count(empno) 입사자수
FROM emp
group by to_char(HIREDATE,'MM')
ORDER BY to_char(HIREDATE,'MM');

SELECT to_char(HIREDATE,'MM') 월,count(empno) 입사자수
FROM emp
group by to_char(HIREDATE,'MM')
ORDER BY 월;

-- 순서 중요
-- SELECT * 
-- FROM 
-- where
-- group by
-- having
-- ORDER BY

-- emp 부서이름별 요약 분석      평균급여>2000
SELECT round(avg(sal)),max(sal),min(sal),dept.dname
FROM emp join dept
on emp.deptno=dept.deptno
-- where round(avg(sal))>2000
group by dept.dname
having round(avg(sal))>2000
ORDER BY dept.dname;

-- emp 부서이름별 요약 분석      급여>1000
SELECT round(avg(sal)),max(sal),min(sal),dept.dname
FROM emp join dept
on emp.deptno=dept.deptno
where sal>1000
group by dept.dname
-- having sal>1000
ORDER BY dept.dname;

-- subquery
SELECT
    *
FROM emp;

-- FORD 사원보다 급여를 많이 받는 사원 리스트
SELECT sal
FROM emp
where upper(ename)=upper('ford');

SELECT
    *
FROM emp
where sal>3000;

SELECT
    *
FROM emp
where sal>(SELECT sal FROM emp where upper(ename)=upper('ford'));

-- 급여가 제일 적은 사원 리스트
SELECT min(sal)
FROM emp;

SELECT
    *
FROM emp
where sal=(SELECT min(sal) FROM emp);

-- 부서별 급여가 제일 적은  사원 리스트
SELECT min(sal) FROM emp group by deptno;
--SELECT * FROM emp where sal=(SELECT min(sal)FROM emp group by deptno);
SELECT * FROM emp where sal in (SELECT min(sal)FROM emp group by deptno);

-- 그럼 만약 한 부서에 800, 950이 있으면 둘다 검색?
SELECT
    *
FROM emp
where (deptno,sal) in((10,5000),(20,3000));
--                    10부서-5000  20부서-3000

SELECT * FROM emp where (deptno,sal) in (SELECT deptno, min(sal) FROM emp group by deptno);

-- mysql => SELECT * FROM emp order by sal desc limit 10,15

-- 집합연산자 union, union all, minus
SELECT job
FROM emp
where deptno=10

union

SELECT job
FROM emp
where deptno=20;

SELECT job
FROM emp
where deptno=10

union all

SELECT job
FROM emp
where deptno=20;

SELECT job
FROM emp
where deptno=10

minus

SELECT job
FROM emp
where deptno=20;

-- 사원이 한명도 없는 부서 정보를 찾으시오
SELECT dept.deptno dname
FROM emp join dept
on emp.deptno<>dept.deptno;

select deptno from dept
minus
select DISTINCT deptno from emp;

select * from dept
where deptno not in (select distinct deptno from emp);
        --다중일때는 in

select distinct deptno from emp;

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


------------------------------------------------day04-----------------------------------------------



-- 뷰        system 계정	-> SCOTT계정에서 실행할수 있게
create or replace view SCOTT.emp_detail
as
SELECT ename, dname, sal, grade
FROM SCOTT.emp e 
    join SCOTT.salgrade
    on sal between losal and hisal
    join SCOTT.dept d
    on e.deptno = d.deptno;
    
    
    
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

-- 회원 탈퇴
DELETE FROM users WHERE id = 'java01';

-- 회원 검색
SELECT * FROM users;

-- id, pw 찾기
SELECT id FROM users WHERE name = '홍길동';
SELECT password FROM users WHERE id = 'java01';

-- 로그인 처리
SELECT * FROM users WHERE id = 'java01' and password = '1234';


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
    INSERT INTO book (bookno,title,publisher,price) VALUES (BOOKNO.nextval,'jQuery','이지스',19000);
drop SEQUENCE bookno;       -- auto commit

INSERT INTO book (bookno,title,publisher,price) VALUES ((SELECT nvl(max(bookno),0) FROM book)+1,'html5','한빛미디어',23000);
INSERT INTO book (bookno,title,publisher,price) VALUES ((SELECT nvl(max(bookno),0) FROM book)+1,'jQuery','이지스',19000);
INSERT INTO book (bookno,title,publisher,price) VALUES ((SELECT nvl(max(bookno),0) FROM book)+1,'jQuery','이지스',19000);

ROLLBACK;

SELECT nvl(max(bookno),0) FROM book;

SELECT * FROM book;

-- book 등록
INSERT INTO book (bookno,title,publisher,price) VALUES ((SELECT nvl(max(bookno),0) FROM book)+1,'&title','&publisher',&price);

-- book 삭제
DELETE FROM book WHERE bookno = &bookno;

-- book 변경
UPDATE book SET price = &price where bookno = &bookno;

-- book 검색
SELECT * FROM book where upper(title) like upper('%&title%') and upper(publisher) like upper('%&publisher%');


-- 트랜잭션
-- 창1
DELETE FROM dept2 WHERE deptno = 10;
-- 창2
UPDATE dept2 SET loc='...' WHERE deptno = 10;

SELECT * FROM dept2;
COMMIT;
ROLLBACK;
------------------------------------------My App--------------------------------------------------------------------------


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
 
