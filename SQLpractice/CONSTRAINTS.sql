create table products(
id integer,
name varchar(20),
batch_no integer
);

insert into products values(1, "shirt" ,20),
(2 , "pant", 12),
(3, "watch" , 18),
(4, "short", 11),
(5, "bag", 15),
(6, "pen" ,2);

select * from products;

select * from products where id in (1,4,6);

select * from products where id not in(1,4,6);

select * from products where id between 1 and 5;



set sql_safe_updates = 0;

delete from products where batch_no = 2;

insert into products values(5 , "bag" , 15);

create table voters (
id integer primary key,
name varchar(25) not null,
age integer check(age >= 18),
county varchar(10) default "India"
);

select * from voters;

insert into voters(id , name,age)values (1, "Meher" , 21);

insert into voters(id , name,age)values (2, "Krishna" , 22),
(3, "Prasanna" , 21),
(4, "Satya" , 30),
(5, "Varaha" , 25),
(6, "Rajesh" , 21);

insert into voters(id, name) values(7, "Vani");

update voters set age = 18 where id = 7;

insert into voters (id, name ,age) values(8 , "Lalitha" , 20);

insert into voters (id ,name,age) values(9 , "Lalitha" , 22);

delete from voters where age = 22;

alter table voters modify name varchar(25) unique not null;


create table register(
id integer,
name varchar(20),
email_id varchar(20) unique not null,
password varchar(20) not null
);

select * from register;

insert into register (id , name ,email_id,password) values 
(1,"Meher", "Meher@gmail.com" , "123"),
(2, "Krishna" , "Prasa@gmail.com" , "1345");

insert into register(id ,name, email_id,password) values
(3, "Prasanna" , "Prasanna@gmail.com" , "1378");


set sql_safe_updates = 0;

create table department(
dept_id integer primary key,
dept_name varchar(20));

insert into department(dept_id , dept_name) values(1, "Java"),
(2, "SQL"),
(3, "Python"),
(4, "C++"),
(5, "React js"),
(6, "Angular");

select * from department;

delete from department;
drop table department;


create table employees(
emp_id integer primary key auto_increment,
emp_name varchar(20),
salary integer,
dept_id integer,

foreign key(dept_id) references department(dept_id)
);

select * from employees;
