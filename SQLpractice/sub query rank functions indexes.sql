use mysql2026;

select * from employees;

select max(salary) as max_salary from employees;

select salary from employees
order by salary desc limit 1,1;

select salary from employees
order by salary desc limit 2,1;

select salary from employees
order by salary desc limit 3,1;

select distinct salary from employees
order by salary desc limit 3,1;

select max(salary) from employees
where salary < (select max(salary) from employees);

select salary , 
rank() over(order by salary desc) as emp_rank
from employees;

select salary , 
dense_rank() over(order by salary desc) as emp_rank
from employees;

select * from (
	select salary , 
	dense_rank() over(order by salary desc) as emp_rank
	from employees
) employees 
where emp_rank = 3;


create table emp(
id integer, 
name varchar(20),
salary integer,
city varchar(20),
index city_index(city)
);	

select * from emp;

create index city_index on employees(city);

show index from emp;

alter table emp modify column id integer primary key;

drop index city_index on emp;


 


