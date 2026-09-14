insert into employees (emp_name, salary,dept_id)values
('Meher', 19000,1),
('Krishna', 20000, 2),
('Prasanna', 22000,1),
('Varaha' , 25000, 3),
('Satya' ,15000,5),
('Appalachari', 21000,3);

-- To count total number of employee
select count(*) from employees;

-- With help of alias we can name column as temporarily 
select count(*) as no_of_Employees from employees;


select count(*) as no_of_Employees from employees where dept_id in (1 , 5);

create table students (
id integer primary key,
name varchar(20),
marks integer
);

alter table students add column dept_name varchar(15);


insert into students (id , name , marks, dept_name) values 
(1 , 'Meher' , 85, 'EEE'),
(2 , 'Krishna' , 90, 'ECE'),
(3, 'Prasanna' , 70, 'CSE'),
(4 , 'Satya' , 80, 'EEE'),
(5 , 'Varaha ' , 98, 'CSE'),
(6 , 'Lalitha' , 96, 'CSE');

-- to calculate total marks of all the students
select sum(marks) from students;

select sum(marks) from students where dept_name = 'CSE';

select sum(marks) from students where dept_name in ('CSE' , 'ECE');

select avg(marks) from students;

select  max(marks) from students;

select max(marks) from students where dept_name = "EEE";

select  min(marks) from students;

select * from students order by marks;

select * from students order by marks desc;

select dept_name , count(name) as no_of_stu_in_each_dept 
from students group by dept_name;

select dept_name, avg(marks) as each_dept_students 
from students group by dept_name;


select dept_name , sum(marks) as total_marks_dept
 from students 
 group by dept_name
 having sum(marks) > 150;
 
-- Find departments having more than 3 students.
select dept_name , count(name) as students from students 
group by dept_name
having students >= 3;

-- Find departments where the average marks are greater than 70.
select dept_name , avg(marks) as avg_marks from students 
group by dept_name
having avg_marks > 70;   
 
-- Find departments where the maximum marks are greater than 90.
select dept_name , max(marks) as max_marks from students 
group by dept_name
having max_marks > 90;

select * from students;

-- Find departments where the minimum marks are greater than 50.
select dept_name , min(marks) as min_marks from students 
group by dept_name
having min_marks > 50;

-- Find departments where the total marks are greater than 250.
select dept_name , sum(marks) as total_marks from students 
group by dept_name
having total_marks > 250;

-- Find departments having at least 2 students.
select count(name) as students from students
group by dept_name
having students > 2;

-- Find departments where the average marks are less than 89.
select dept_name , avg(marks) as avg_marks from students
group by dept_name
having avg_marks < 89;

-- Find the department with the highest average marks.
select dept_name , avg(marks) as highest_avg from students
group by dept_name order by highest_avg desc limit 1;

-- Find departments where the average marks are greater than 65 
-- and the number of students is greater than 2.
select dept_name , count(*) as students_count , 
avg(marks) as average 
from students
group by dept_name
having average > 65 and 
students_count > 2; 

-- Find departments where the total marks are greater than 150
-- and average marks are greater than 80.

select dept_name , sum(marks) as Total_marks,
avg(marks) as avg_marks
from students group by dept_name
having total_marks > 150 and avg_marks > 80; 

-- Find the department(s) having the highest number of students.

-- select dept_name, count(name) as student_count from students
-- group by dept_name order by student_count desc limit 1; 

select * from students;

select dept_name  , count(*) as count_dept
from students group by dept_name
having count_dept > 2;


select dept_name , count(*) as no_of_students
from students where marks > 95
group by dept_name
having no_of_students > 1;

select dept_name , max(marks) as marks from students
where marks < 98
group by dept_name
having marks > 85; 


 


