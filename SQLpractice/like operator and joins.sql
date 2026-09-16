create database joins;
use joins;

create table department(
dept_id integer primary key,
dept_name varchar(20)
);

insert into department values(1, "Java"),
(2, "Python"),
(3, "SQL"),
(4, "AWS"),
(5, "Service desk"),
(6, "IT");

select * from department;

create table employees(
id integer primary key,
name varchar(20),
dept_id integer,
foreign key(dept_id) references department(dept_id)
);


insert into employees values(1, "Meher", 1),
(2, "Krishna" , 1),
(3 , "Prasanna" , 3),
(4 , "Vathi" , null),
(5 , "Lalitha" , 1),
(6 , "Varaha", 4 ),
(7 , "Satya" , null),
(8 , "Rajesh" , null),
(9 , "Vani" , 2),
(10 , "Rajesh" , 4);

select * from employees;

select * from employees where id = 2;

-- inner join
select emp.id , emp.name , dept.dept_name
from employees as emp
inner join department as dept
on emp.dept_id = dept.dept_id;

-- left join
select emp.name , dept.dept_name
from employees emp
left join department dept
on emp.dept_id = dept.dept_id;

-- right join 
select emp.name , dept.dept_name
from employees emp
right join department dept
on emp.dept_id = dept.dept_id;

create table products(
id integer primary key auto_increment,
name varchar(20)
);

insert into products values
(1 , "Shirts"),
(2 , "Pants"),
(3 , "T Shirt"),
(4 , "Night pants");

select * from products;

create table size(
id integer,
name varchar(5)
);

insert into size values ( 1 , "S"),
(2 , "M"),
(3 , "L"),
(4 , "XL"),
(5 , "XXL");

select * from size;

select * from products cross join size;

create table students(
id integer primary key auto_increment,
name varchar(20),
age integer,
dept_id integer,

foreign key(dept_id) references stu_department(dept_id)
);

alter table students rename column dept_id to department_id;

select * from students; 

create table stu_department(
dept_id integer primary key auto_increment,
dept_name varchar(20)
);

alter table stu_department rename column 
dept_name to department_name;



select * from stu_department;

insert into stu_department (dept_name) values("EEE"),
("MECH"),
("ECE"),
("CIVIL"),
("CSE");

use joins;

select department_name from stu_department 
where department_name like '%E_H';

select department_name from stu_department 
where department_name like '%E';

select department_name from stu_department
where department_name like '__E';

select department_name from stu_department
where department_name like '%E%';

select department_name from stu_department
where department_name like 'E%'




insert into students values (1 , "Meher" , 22, 1),
(2, "Krishna" , 21, 1),
(3, "Prasanna" , 23, 3),
(4, "Satya" , 24, 4),
(5, "Varaha" , 21, 1),
(6, "Vani" , 21, 2),
(7, "Lalitha" , 22, 3);

select * from students;

create table store(
id integer primary key,
name varchar(20),
categories varchar(20)
);

alter table store modify categories integer;  

insert into store (id, name , categories) values(1 ,"Electronics" , null),
(2, "Colthes" , null),
(3, "Footware" , null),
(4, "Books" , null);

select * from store;

insert into store(id , name ,categories) values
(5, "Washing machine" , 1),
(6 , "Mobiles" , 1),
(7 , "Oppo phone" , 6),
(8 , "Classmate book", 4),
(9 , "shoe", 3),
(10 , "puma shoe", 9),
(11 , "Campus",9);

alter table store rename column name to categorie_name;

alter table store rename column
categories to parent_categories;

-- self join inner join
select child.categorie_name as child_categorie,
parent.categorie_name as parent_categorie
from store as child
join store as parent
on child.parent_categories = parent.id;

-- self join left join
select child.categorie_name as child_cat ,
parent.categorie_name as parent_cat 
from store child
left join store parent
on child.parent_categories = parent.id;
