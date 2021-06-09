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