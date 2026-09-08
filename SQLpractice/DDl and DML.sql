show databases;
create database mysql2026;

create table students(
id integer,
name varchar(20),
age integer);

alter table students add column marks integer;

alter table students add column first_name varchar(20) first;

alter table students drop column first_name;

alter table students add column first_name varchar(20) after name;

alter table students drop column first_name;

alter table students rename column marks to mar;



alter table students drop column mar;

create table employee(
id integer,
emp_name varchar(20),
domain varchar(20));

drop table employee;

insert into students values(1, 'Meher', 21),
(2, 'Krishna' , 22),
(3 , 'Prasanna', 21);

insert into students (id, age) values (4, 25);

set sql_safe_updates=0;

update students set name = 'Varaha' where id = 4;

update students set name = "Satya" where name = 'Prasanna';

alter table students add column marks integer;

insert into students(marks) values (35),
(40),
(34),
(46);

delete from students where marks = 35;

delete from students where marks = 46;

update students set marks = 34 where age = 21;

update students set marks = 38 where age = 22;

delete from students where marks = 34;

delete from students marks;

alter table students drop marks;

delete from students where name = 'Krishna';

select * from students;
