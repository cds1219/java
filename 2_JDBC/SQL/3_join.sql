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
where sal >= 2500;

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
from emp e right outer join dept d
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