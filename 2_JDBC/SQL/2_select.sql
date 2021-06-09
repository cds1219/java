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