SELECT *
FROM employees;

SELECT *
FROM departments;

SELECT *
FROM jobs;

-- 문제1
select 
e.employee_id 사번, 
e.first_name 이름, 
department_name 부서명, 
NVL(ee.first_name, '<TOP>') 매니저이름
from employees e join departments d
on e.department_id = d.department_id
join employees ee        
on e.manager_id = ee.employee_id;

SELECT e.employee_id 사번, e.first_name 이름, d.department_name 부서명, m.first_name 상사명
FROM employees e, employees m, departments d 
where e.department_id = d.department_id and e.manager_id = m.employee_id(+);

select e.employee_id 사번, e.first_name 이름, d.department_name 부서명, nvl(m.first_name, '<<TOP>>') 매니저 
from employees e left outer join employees m on e.manager_id = m.employee_id
    join departments d on e.department_id = d.department_id;

-- 문제2
SELECT e.last_name, e.salary
FROM employees e join employees ee
on e.salary>ee.salary
and e.manager_id=ee.employee_id;

-- 문제3
SELECT first_name, last_name, salary
FROM employees e join jobs j
on e.job_id=j.job_id
where j.job_title='Sales Representative'
and e.salary between 9000 and 10000;

-- 문제4
SELECT e.employee_id 사번, e.last_name 성, e.hire_date 채용일
FROM employees e join employees ee
on e.hire_date<ee.hire_date
and e.manager_id=ee.employee_id;

-- 문제5 DISTINCT
SELECT job_title, department_name
FROM employees e join jobs j
on e.job_id=j.job_id
join departments d
on e.department_id=d.department_id;

SELECT distinct(job_title), department_name
FROM employees e join jobs j
on e.job_id=j.job_id
join departments d
on e.department_id=d.department_id;

-- 문제7 08년도 입사자가 없어서 98년도 입사자로 대체
SELECT first_name 이름, hire_date 입사일, employee_id 관리자사번, first_name 관리자이름
FROM employees
where to_char(HIRE_DATE,'rr') ='98';

-- 문제8
SELECT e.first_name 이름, e.salary 급여, d.department_name 부서명
FROM employees e join departments d
on e.DEPARTMENT_ID=d.DEPARTMENT_ID
and DEPARTMENT_NAME='Sales';

-- 문제9 04년도가 없어서 99년도로 대체
SELECT employee_id 사번, first_name 이름, last_name 성, NVL(d.department_name, '<NOT ASSIGNED>') 부서명
FROM employees e left join departments d
on e.DEPARTMENT_ID=d.DEPARTMENT_ID
where to_char(HIRE_DATE,'rr') ='99';

-- 문제10 94년도에 입사한 직원
SELECT e.first_name 직원이름, e.hire_date 입사일, ee.employee_id 관리자사번, ee.first_name 관리자이름
FROM employees e join employees ee
on e.manager_id=ee.employee_id
where to_char(e.HIRE_DATE,'rr') ='94';